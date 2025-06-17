package com.ejemplo.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class UNAMTEST {

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
        
        
        
        
    }

    /**
     * 
     */
    @Test
    void buscarEnGoogle() {
        open("http://localhost:4200");
        
        /*

        // Aceptar cookies si aparece
        if ($$("button").size() > 0 && $$("button").get(0).getText().contains("Aceptar")) {
            $$("button").get(0).click();
        }
        
        
        $("a[href='/transporte']").pressEnter();
      //  $("#search").should(appear); 

   //   $("[name='q']").setValue("Selenide WebDriverManager").pressEnter();
     //   $("#search").should(appear);
        
        $("a[href='/transporte']").pressEnter();
        
        $("li.menu__item.menu-mlid-1181 a.menu__link").hover();
        
        
      //  $("a.menu__link[href='/transporte/autobuses-para-los-campus-unam']").click();
        
      //  $("a[title='Autobuses para los Campus UNAM'][href='/transporte/autobuses-para-los-campus-unam']").click();
        
        $("a[title='Autobuses para los Campus UNAM'][href='/transporte/autobuses-para-los-campus-unam']").shouldBe(visible).click();;

        */
        sleep(10000);
    }
}
