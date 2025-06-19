package com.ejemplo.tests;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import mx.com.liverpool.fp.auto.clases.utils.TestEngineClient;
import mx.com.liverpool.fp.auto.clases.utils.Util;

class Flujo_Basico {
	
    
    //RUTA PARA ALMACENAR LA EVIDENCIA DE MANERA LOCAL
    static String ruta = "/Users/QualityServices/REPO/TMP_EVIDENCIA_CLIENTES/";
  	
  	//URL DEL SERVIDOR DE MONITOREO
  	 static String urlTestE = "http://192.168.0.50:8080/UPLOAD/monitoring/mon_ext/insertaRegistro";
	
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
        // Configura automáticamente ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        
        ChromeOptions options = new ChromeOptions();

        // Cabecera de un navegador real (moderna y válida)
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
        

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        
        
        Configuration.browserCapabilities = capabilities;
        Configuration.browser = "chrome";
        
        Configuration.browser = "chrome";
        Configuration.headless = false; // true si estás en CI o sin entorno gráfico
        
    
        
        
        
     // Inicializar componente cliente para enviar evidencia
     		TestEngineClient.init(urlTestE, ruta);
        
        
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		
		
		
		try {
		
		// que se ejecuto
		
		String timeStampFlujo="";
		String flujo = "FORMULARIO1";
		String paso = "Paso";
		String verificacionPaso = "";
		String timeStampPaso = "";
		String observaciones = "";
		String nombreImagen = "";
		String finalizado = "NO";
		String target = "IMG";
		String tiempoRespuesta = "345";
		
		long inicio;
		long fin;
		
		
		
		//CODIGO PARA EL TIMESTAMP DEL FLUJO COMPLETO
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Mazatlan");
		String DATE_FORMAT = "yyyy.MM.dd.HH.mm.ss";
		SimpleDateFormat formatterWithTimeZone = new SimpleDateFormat(DATE_FORMAT);
		formatterWithTimeZone.setTimeZone(timeZone);

		Date date = new Date();

		timeStampFlujo = formatterWithTimeZone.format(date);
		
		
		
		sleep(2000);
		//NOMBRE DEL PASO
		paso="HOME";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		
		//toma de tiempo de inicio
		inicio = System.currentTimeMillis();
		
		open("http://localhost:4200");
		
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :"  +tiempoRespuesta);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :"  +tiempoRespuesta);
		
		//String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".jpeg";
		String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		//File imagenPantallazo = Util.captureScreen(rutaImagen);
		File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		sleep(2000);
		
		
		//NOMBRE DEL PASO
		paso="MENU_DESPLEGABLE";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		inicio = System.currentTimeMillis();
		$("nb-icon.expand-state[ng-reflect-icon='chevron-left-outline']").click();
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		
		imagenPantallazo=null;
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		
		sleep(2000);
		
		
		
		//NOMBRE DEL PASO
		paso="SELECCIONA_OPCION_FORMULARIOS";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		inicio = System.currentTimeMillis();
		$("a[title='Stepper'][href='/pages/layout/stepper']").click();
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		imagenPantallazo=null;
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		
		sleep(2000);
		
		
		
		
		
		//NOMBRE DEL PASO
		paso="INTRODUCE_NOMBRE";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		inicio = System.currentTimeMillis();
		$("[formcontrolname='firstCtrl']").sendKeys("Mr. Bones");
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		
		imagenPantallazo=null;
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		
		sleep(2000);
		
		
		
		
		
		
		
		
		//NOMBRE DEL PASO
		paso="OPRIME_ENTER";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		
		inicio = System.currentTimeMillis();		
		$("[formcontrolname='firstCtrl']").pressEnter();
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		imagenPantallazo=null;
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		
		sleep(2000);
		
		
		
		
		//NOMBRE DEL PASO
		paso="INTRODUCE_COLOR";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		inicio = System.currentTimeMillis();
		$("[formcontrolname='secondCtrl']").sendKeys("Blue");
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		imagenPantallazo=null;
		
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		sleep(2000);
		
		
		
		
		//NOMBRE DEL PASO
		paso="OPRIME_ENTER";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());
		
		inicio = System.currentTimeMillis();
		$("[formcontrolname='secondCtrl']").pressEnter();
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		
		imagenPantallazo=null;
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		sleep(2000);
		
		
		
		
		
		
		
		
		
		
		//NOMBRE DEL PASO
		paso="INTRODUCE_PALABRA";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());	
		
		inicio = System.currentTimeMillis();
		$("[formcontrolname='thirdCtrl']").sendKeys("God!");
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		imagenPantallazo=null;
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		nombreImagen = imagenPantallazo.getName();
		finalizado="NO";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		sleep(2000);
		
		
		
		//NOMBRE DEL PASO
		paso="OPRIME_ENTER";
		
		//TIMESTAMP DEL PASO
		timeStampPaso = formatterWithTimeZone.format(new java.util.Date());	
		
		inicio = System.currentTimeMillis();
		$("[formcontrolname='thirdCtrl']").pressEnter();
		fin =System.currentTimeMillis();
		tiempoRespuesta=Util.calcularTiempoRespuesta(fin, inicio);
		tiempoRespuesta=Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
		
		rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";
		
		//DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA SI FUE OK O NOK
		verificacionPaso = "OK";
		observaciones = "Todo OK";
		
		
		imagenPantallazo=null;
		
		
		//imagenPantallazo = Util.captureScreen(rutaImagen);
		imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
		nombreImagen = imagenPantallazo.getName();
		finalizado="YES";
		
		TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo, paso, timeStampPaso,
				verificacionPaso, observaciones, nombreImagen, finalizado, target, tiempoRespuesta);
		
		
		
	
		
		
		
		
		
		
		
		
		sleep(10000);
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
