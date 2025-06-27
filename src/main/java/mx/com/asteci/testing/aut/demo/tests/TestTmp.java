package mx.com.asteci.testing.aut.demo.tests;

import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.Test;

import mx.com.asteci.testing.aut.demo.pages.Home;
import mx.com.asteci.testing.aut.demo.pages.Stepper;
import mx.com.asteci.testing.aut.demo.utils.BaseTest;
import mx.com.asteci.testing.aut.demo.utils.LocatorReader;

import static com.codeborne.selenide.Selenide.*;

public class TestTmp extends BaseTest {
	
	
	
	
	@Test 
	public void testHomeFeatures () {
		
		Home homeFeatures = new Home();
		
		homeFeatures.open();
		
		
		
		//Layout
		
		$(LocatorReader.get("features.layout.open")).click();
		sleep(2000);
		//Stepper
		$(LocatorReader.get("features.layout.stepper")).click();
		sleep(2000);
		
		//Accordion
		$(LocatorReader.get("features.layout.accordion")).click();
		sleep(2000);
				
		
		
		
		$(LocatorReader.get("features.layout.close")).click();
		
	
		
		
	//forms
		$(LocatorReader.get("features.forms.open")).click();
		sleep(2000);
		//FormLayout
		$(LocatorReader.get("features.forms.formsLayout")).click();
		sleep(2000);
		
		//Datepicker
		
		$(LocatorReader.get("features.forms.datepicker")).click();
		sleep(2000);
		
		$(LocatorReader.get("features.forms.close")).click();
		
		
	
		
	//modal
		
		$(LocatorReader.get("features.modal.open")).click();
		sleep(2000);
		
		//Dialog
		$(LocatorReader.get("features.modal.dialog")).click();
		sleep(2000);
		//Window
		$(LocatorReader.get("features.modal.window")).click();
		sleep(2000);
		//Popover
		$(LocatorReader.get("features.modal.popover")).click();
		sleep(2000);
		//Toastr
		$(LocatorReader.get("features.modal.toastr")).click();
		sleep(2000);
		//Tooltip
		$(LocatorReader.get("features.modal.tooltip")).click();
		sleep(2000);
		
		
		$(LocatorReader.get("features.modal.close")).click();
		
	
		
		
	//Extra
		
		$(LocatorReader.get("features.extra.open")).click();
		sleep(2000);
		

		
		//Calendar
		$(LocatorReader.get("features.extra.calendar")).click();
		sleep(2000);
		
		$(LocatorReader.get("features.extra.close")).click();
		
		
	//Tables
		

		$(LocatorReader.get("features.tables.open")).click();
		sleep(2000);
		
		
		//SmartTable
		$(LocatorReader.get("features.tables.smartTable")).click();
		sleep(2000);
		
		//Tree Grid
		$(LocatorReader.get("features.tables.treeGrid")).click();
		sleep(2000);
		
		
		$(LocatorReader.get("features.tables.close")).click();
		
		/*
		
	//Auth
		
		sleep(2000);
		$(LocatorReader.get("features.auth.open")).click();
		sleep(2000);
		
		
		
		//Login
		$(LocatorReader.get("features.auth.login")).click();
		sleep(2000);
		
		//Back
		$(LocatorReader.get("feature.auth.back")).click();
		sleep(2000);
		
		//Register
		$("body > ngx-app > ngx-pages > ngx-one-column-layout > nb-layout > div > div > div > nb-sidebar > div > div > nb-menu > ul > li.menu-item.ng-tns-c7-41.ng-star-inserted > ul > li.menu-item.ng-tns-c7-43.ng-tns-c7-41.ng-star-inserted > a").click();
		sleep(2000);
		
		//Back Register
		$("body > ngx-app > nb-auth > nb-layout > div > div > div > div > div > nb-layout-column > nb-card > nb-card-header > nav > a > nb-icon").click();
		sleep(2000);
		
		//Request Password
		
		$("body > ngx-app > ngx-pages > ngx-one-column-layout > nb-layout > div > div > div > nb-sidebar > div > div > nb-menu > ul > li.menu-item.ng-tns-c7-64.ng-star-inserted > ul > li.menu-item.ng-tns-c7-67.ng-tns-c7-64.ng-star-inserted > a").click();
		sleep(2000);
		
		
		//Back Request Password
		
		$("body > ngx-app > nb-auth > nb-layout > div > div > div > div > div > nb-layout-column > nb-card > nb-card-header > nav > a > nb-icon").click();
		sleep(2000);
		
		
		
		//Reset Password
		
		$("body > ngx-app > ngx-pages > ngx-one-column-layout > nb-layout > div > div > div > nb-sidebar > div > div > nb-menu > ul > li.menu-item.ng-tns-c7-87.ng-star-inserted > ul > li.menu-item.ng-tns-c7-91.ng-tns-c7-87.ng-star-inserted > a").click();
		sleep(2000);
		
		
		
		//Back Reset Password
		$("body > ngx-app > nb-auth > nb-layout > div > div > div > div > div > nb-layout-column > nb-card > nb-card-header > nav > a > nb-icon").click();
		sleep(2000);
		
		
		//Close Auth
		$("body > ngx-app > ngx-pages > ngx-one-column-layout > nb-layout > div > div > div > nb-sidebar > div > div > nb-menu > ul > li.menu-item.ng-tns-c7-110.ng-star-inserted > a > nb-icon.expand-state > svg > g > g").click();
		sleep(2000);
		
		
		
		
		
		
		//Close Auth
		//$(LocatorReader.get("features.auth.close")).click();
	
		*/
		
		sleep(5000);
		
		//$("").click();
		//sleep(2000);
		
		
		
	}
	
	
	

	

}
