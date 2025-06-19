package mx.com.asteci.testing.aut.demo.utils;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import mx.com.liverpool.fp.auto.clases.utils.TestEngineClient;

public class BaseTest {
	
	
    //RUTA PARA ALMACENAR LA EVIDENCIA DE MANERA LOCAL
   // static String ruta = "/Users/QualityServices/REPO/TMP_EVIDENCIA_CLIENTES/";
    static String ruta = ConfigReader.get("test.engine.client.path");
  	
  	//URL DEL SERVIDOR DE MONITOREO
  	 //static String urlTestE = "http://192.168.0.50:8080/UPLOAD/monitoring/mon_ext/insertaRegistro";
  	 static String urlTestE = ConfigReader.get("test.engine.server.url");

	public BaseTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	
    @BeforeAll
    static void setUp() {
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

}
