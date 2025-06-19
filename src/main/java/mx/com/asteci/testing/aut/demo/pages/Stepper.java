package mx.com.asteci.testing.aut.demo.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

import mx.com.asteci.testing.aut.demo.utils.BaseTest;
import mx.com.asteci.testing.aut.demo.utils.LocatorReader;

public class Stepper extends BaseTest {

	public Stepper() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	
	//Selectores
	//private SelenideElement layoutOption= $("nb-icon.expand-state[ng-reflect-icon='chevron-left-outline']");
	private SelenideElement stepperF2fiel1= $(LocatorReader.get("stepper.f2.field1"));
	private SelenideElement stepperF2fiel2= $(LocatorReader.get("stepper.f2.field2"));
	private SelenideElement stepperF2fiel3= $(LocatorReader.get("stepper.f2.field3"));
	
	//private SelenideElement stepperF2BtnNext= $(LocatorReader.get("button[nbsteppernext]"));
	
	public void stepperF2Flied1SendName(String name) {
		
		stepperF2fiel1.sendKeys(name);
		
		
	}
	
	
	
	public void stepperF2Flied2SendColor(String color) {
		
		stepperF2fiel2.sendKeys(color);
		
		
	}
	
	
	
	
	public void stepperF2Flied3SendWord(String word) {
		
		stepperF2fiel3.sendKeys(word);
		
		
	}
	
	
	
	public void stepperF2Flied1pressEnter() {
		
		stepperF2fiel1.pressEnter();
		
		
	}
	
	
	
	public void stepperF2Flied2pressEnter() {
		
		stepperF2fiel2.pressEnter();
		
		
	}
	
	
	
	
	public void stepperF2Flied3pressEnter() {
		
		stepperF2fiel3.pressEnter();
		
		
	}
	
	
	public void stepperF2BtnNextClick() {
		
		
		//stepperF2BtnNext.click();
	}
	
	

}
