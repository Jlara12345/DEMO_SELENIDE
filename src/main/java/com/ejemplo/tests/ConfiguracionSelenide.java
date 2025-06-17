package com.ejemplo.tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class ConfiguracionSelenide {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        // Cabecera de un navegador real (moderna y válida)
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");

        // Otras opciones útiles
     //   options.addArguments("--start-maximized");
      //  options.addArguments("--disable-blink-features=AutomationControlled");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        Configuration.browserCapabilities = capabilities;
        Configuration.browser = "chrome";

        // Abre una página para probar
        com.codeborne.selenide.Selenide.open("https://www.unam.mx/");
        
        sleep(32000);
    }
}
