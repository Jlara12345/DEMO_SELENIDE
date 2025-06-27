package mx.com.asteci.testing.aut.demo.tests;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import mx.com.asteci.aut.demo.exceptions.ClientException;
import mx.com.asteci.testing.aut.demo.pages.FEATURES;
import mx.com.asteci.testing.aut.demo.pages.Home;
import mx.com.asteci.testing.aut.demo.utils.BaseTest;
import mx.com.liverpool.fp.auto.clases.utils.TestEngineClient;
import mx.com.liverpool.fp.auto.clases.utils.Util;

class Test_Secciones extends BaseTest {

	@Test
	void test() {

		// Variable para generar evidencia

		// que se ejecuto

		String timeStampFlujo = Util.getTimeStamp();
		String flujo = "TEST_NAVEGACION";
		long thinkTimeGral = 3000;

		

		Home home = new Home();

		

		Paso1_OpenHome(home, timeStampFlujo, flujo);
		
		FEATURES features = new FEATURES();
		
		Paso2_OpenLayout(features, timeStampFlujo, flujo);
		
		sleep(thinkTimeGral);

		
		Paso3_OpenStepper(features, timeStampFlujo, flujo);
		

		
		
		sleep(thinkTimeGral);
		
		Paso4_OpenAcordion(features, timeStampFlujo, flujo);
		
	
		
		
		sleep(thinkTimeGral);
		Paso5_CloseLayout(features, timeStampFlujo, flujo);
		
		
		sleep(thinkTimeGral);
		
		Paso6_OpenForms(features, timeStampFlujo, flujo);
		
		sleep(thinkTimeGral);
		
		
		Paso7_OpenFormLayout(features, timeStampFlujo, flujo);
		
		
	
		sleep(thinkTimeGral);
		
		Paso8_OpenDatePicker(features, timeStampFlujo, flujo);
		
		
		
		sleep(thinkTimeGral);
		
		Paso9_CloseForms(features, timeStampFlujo, flujo);
		
	
		
	

		sleep(thinkTimeGral);
		
		Paso10_OpenModal(features, timeStampFlujo, flujo);
		
		
	
		
		
		sleep(thinkTimeGral);
		Paso11_OpenDialog(features, timeStampFlujo, flujo);
		
		
		sleep(thinkTimeGral);
		
		
		Paso12_OpenWindow(features, timeStampFlujo, flujo);
		
		
		
		sleep(thinkTimeGral);
		
		
		Paso13_OpenPopover(features, timeStampFlujo, flujo);
		
		
	
		sleep(thinkTimeGral);
		
		Paso14_OpenToastr(features, timeStampFlujo, flujo);
		
	
		sleep(thinkTimeGral);
		
		
		Paso15_OpenTooltip(features, timeStampFlujo, flujo);
		

		sleep(thinkTimeGral);
		
		Paso15_CloseModal(features, timeStampFlujo, flujo);
		
		
		
	
		sleep(thinkTimeGral);

		features.clickExtraOpen();
		sleep(thinkTimeGral);
		features.clickExtraCalendar();
		sleep(thinkTimeGral);
		features.clickExtraClose();
		sleep(thinkTimeGral);

		features.clickTableOpen();
		sleep(thinkTimeGral);

		features.clickSmartTable();
		sleep(thinkTimeGral);

		features.clickTree();
		sleep(thinkTimeGral);

		features.clickTableClose();
		sleep(thinkTimeGral);

		features.authOptionOpen();

		sleep(thinkTimeGral);

		// features.clickLoginOption();

		sleep(thinkTimeGral);

		features.authOptionClose();

		sleep(5000);
	}



	public boolean Paso1_OpenHome(Home homeP, String timeStampFlujo, String flujo) {
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_HOME";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			//****************************************
			
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			homeP.open();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//****************************************
			
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;

	}
	
	private boolean Paso2_OpenLayout(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_LAYOUT_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();
			
			//****************************************

			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickLayoutOpen();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			
			//****************************************
			
			
			
			
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;

	}
	
	private boolean Paso3_OpenStepper(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_LAYAOUT_STEPPER";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickStepper();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso4_OpenAcordion(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_LAYAOUT_ACORDION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickAcordion();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso5_CloseLayout(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "CLOSE_LAYAOUT_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickLayoutClose();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso6_OpenForms(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_FORMS_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickFormOpen();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso7_OpenFormLayout(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_FORM_LAYOUT";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickFormLayoutOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso8_OpenDatePicker(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_FORM_DATEPICKER";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickDatepickerOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso9_CloseForms(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "CLOSE_FORMS_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickFormClose();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso10_OpenModal(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickModalOpen();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}

	private boolean Paso11_OpenDialog(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_DIALOG";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickDialogOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}

	private boolean Paso12_OpenWindow(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_WINDOW";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickWindowOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}

	private boolean Paso13_OpenPopover(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_POPOVER";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickPopoverOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
		
	private boolean Paso14_OpenToastr(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_TOASTR";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickToastrOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}

	private boolean Paso15_OpenTooltip(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "OPEN_MODAL_TOOLTIP";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickTooltipOption();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
	
	private boolean Paso15_CloseModal(FEATURES features, String timeStampFlujo, String flujo) {
		// TODO Auto-generated method stub
		boolean terminaOk = false;
		try {

			
			String paso = "CLOSE_MODAL_SECCTION";
			String verificacionPaso = "";
			String timeStampPaso = "";
			String observaciones = "";
			String nombreImagen = "";
			String finalizado = "NO";
			String target = "IMG";
			String tiempoRespuesta = "345";
			long inicio;
			long fin;

			// TimeStamp del paso
			timeStampPaso = Util.getTimeStamp();

			// SE CAPTURA EL MOMENTO DE INICIO DEL PASO
			inicio = System.currentTimeMillis();

			
			//********************************************
			// PASO QUE SE REALIZA SOBRE EL LA PAGINA
			features.clickModalClose();
			// SE CAPTURA EL MOMENTO FIN DEL PASO
			
			//********************************************
			
			
			fin = System.currentTimeMillis();

			// SE CALCULA EL TIEMPO DE RESPUESTA
			tiempoRespuesta = Util.calcularTiempoRespuesta(fin, inicio);

			System.out.println("El tiempo de respuesta ANTES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE LE SUMA TIEMPO DE RESPUESTA DUMMY, ESTE ES NECESARIO BORRARLO EN LOS
			// PROYECTOS REALES, ES SOLO PARA DEMO
			tiempoRespuesta = Util.tiempoRespuestaDummyDemo(tiempoRespuesta);
			System.out.println("El tiempo de respuesta DESPUES de agregarle el valor aleatorio es :" + tiempoRespuesta);
			// SE GENERA LA RUTA PARA GENERAR LA EVIDENCIA DEL PASO EN EL CLIENTE
			String rutaImagen = ruta + flujo + "_" + paso + "_" + timeStampFlujo + timeStampPaso + ".png";

			// DESPUES DEL RESULTADO SE VALIDA LA VALIDACION CORRECPONDIENTE Y SE DETERMINA
			// SI FUE OK O NOK
			verificacionPaso = "OK";
			observaciones = "Todo OK";

			// SE GENERA LA CAPTURA DE PANTALLA
			File imagenPantallazo = Util.tomarCapturaPantalla(rutaImagen);
			// SE RECUPERA EL NOMBRE DE LA IMAGEN PARA MANDARLA COMO PARTE DE LA EVIDENCIA.
			nombreImagen = imagenPantallazo.getName();
			finalizado = "NO";

			System.out.println("El valor del registro es:>>>  " + "Flujo: " + flujo + " Timestap Flujo:  "
					+ timeStampFlujo + " Paso " + paso + " TimestampPaso : " + timeStampPaso + " Tiempo de Respuesta: "
					+ tiempoRespuesta + " Verificacion Paso " + verificacionPaso + " Observaciones: " + observaciones
					+ " Nombre de Evidencia: " + nombreImagen +" Finalizado: "+ finalizado +" Target: "+ target );

			// SE ENVIA LA EVIDENCIA AL REPOSITORIO
			// TestEngineClient.envioEvidencia(imagenPantallazo, flujo, timeStampFlujo,
			// paso, timeStampPaso,verificacionPaso, observaciones, nombreImagen,
			// finalizado, target, tiempoRespuesta);
			
			terminaOk=true;

		} catch (IOException  e) {

			e.printStackTrace();

		}

		return terminaOk;
		
	}
}
