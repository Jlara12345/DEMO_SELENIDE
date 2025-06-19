package mx.com.asteci.testing.aut.demo.tests;

import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.Test;

import mx.com.asteci.testing.aut.demo.pages.Home;
import mx.com.asteci.testing.aut.demo.pages.Stepper;
import mx.com.asteci.testing.aut.demo.utils.BaseTest;

public class TestTmp extends BaseTest {
	
	
	
	
	@Test 
	public void testHomeFeatures () {
		
		Home homeFeatures = new Home();
		
		homeFeatures.open();
		homeFeatures.clickLayoutOpen();
		homeFeatures.clickOptionStepper();
		
		sleep(2000);
		
		Stepper stepper = new Stepper();
		
		stepper.stepperF2Flied1SendName("Juan");
		sleep(2000);
		stepper.stepperF2Flied1pressEnter();
		//stepper.stepperF2BtnNextClick();
		
		
		stepper.stepperF2Flied2SendColor("Azul");
		sleep(2000);
		//stepper.stepperF2BtnNextClick();
		stepper.stepperF2Flied2pressEnter();
		
		
		
		stepper.stepperF2Flied3SendWord("Something");
		sleep(2000);
		//stepper.stepperF2BtnNextClick();
		stepper.stepperF2Flied3pressEnter();
		
		
		
		
		sleep(10000);
		
		
		
	}
	

}
