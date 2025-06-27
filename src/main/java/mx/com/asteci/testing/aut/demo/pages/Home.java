package mx.com.asteci.testing.aut.demo.pages;

import com.codeborne.selenide.SelenideElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import mx.com.asteci.testing.aut.demo.utils.LocatorReader;


public class Home {

	public Home() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Acciones
	
	public Home open() {
		
		com.codeborne.selenide.Selenide.open("http://localhost:4200");
		return this;
		
	}
	
	
	

	

}
