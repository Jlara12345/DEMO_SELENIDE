package mx.com.asteci.testing.aut.demo.pages;






import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import mx.com.asteci.testing.aut.demo.utils.LocatorReader;


public class Home {

	public Home() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Selectores
	//private SelenideElement layoutOption= $("nb-icon.expand-state[ng-reflect-icon='chevron-left-outline']");
	private SelenideElement layoutOption= $(LocatorReader.get("features.layout.open"));
	
	private SelenideElement layoutStepper= $(LocatorReader.get("features.layout.stepper"));
	
	
	
	//Acciones
	
	public Home open() {
		
		com.codeborne.selenide.Selenide.open("http://localhost:4200");
		return this;
		
	}
	
	public void clickLayoutOpen() {
		
		layoutOption.click();	
		
	}
	
	public void clickOptionStepper() {
		
		layoutStepper.click();
		
		
	}
	

}
