package mx.com.asteci.testing.aut.demo.pages;

import com.codeborne.selenide.SelenideElement;

import mx.com.asteci.testing.aut.demo.utils.LocatorReader;

import static com.codeborne.selenide.Selenide.*;

public class FEATURES {

	public FEATURES() {
		// TODO Auto-generated constructor stub
	}

	// Selectores

	// Layaout Open
	private SelenideElement layoutOptionOpen = $(LocatorReader.get("features.layout.open"));

	private SelenideElement layoutOptionStepper = $(LocatorReader.get("features.layout.stepper"));
	private SelenideElement layoutOptionAcordion = $(LocatorReader.get("features.layout.accordion"));

	private SelenideElement layoutOptionClose = $(LocatorReader.get("features.layout.close"));
	// Layout Close

	// Forms Open

	private SelenideElement formOptionOpen = $(LocatorReader.get("features.forms.open"));

	private SelenideElement formLayoutOption = $(LocatorReader.get("features.forms.formsLayout"));
	private SelenideElement datepickerOption = $(LocatorReader.get("features.forms.datepicker"));

	private SelenideElement formOptionClose = $(LocatorReader.get("features.forms.close"));

	// Forms Close
	
	
	
	// Modal Open
	
	private SelenideElement modalOptionOpen = $(LocatorReader.get("features.modal.open"));
	
	private SelenideElement dialogOption = $(LocatorReader.get("features.modal.dialog"));
	private SelenideElement windowOption = $(LocatorReader.get("features.modal.window"));
	private SelenideElement popoverOption = $(LocatorReader.get("features.modal.popover"));
	private SelenideElement toastrOption = $(LocatorReader.get("features.modal.toastr"));
	private SelenideElement tooltipOption = $(LocatorReader.get("features.modal.tooltip"));
	
	
	private SelenideElement modalOptionClose = $(LocatorReader.get("features.modal.close"));
	
	
	//Modal Close
	
	
	//Extra Components Open
	private SelenideElement extraOptionOpen = $(LocatorReader.get("features.extra.open"));
	
	
	private SelenideElement calendarOption = $(LocatorReader.get("features.extra.calendar"));
	
	
	
	private SelenideElement extraOptionClose = $(LocatorReader.get("features.extra.close"));
	//Extra Components Close
	
	
	
	
	//Table Open
	
	private SelenideElement tableOptionOpen = $(LocatorReader.get("features.tables.open"));
	
	
	private SelenideElement smartTableOptionOpen = $(LocatorReader.get("features.tables.smartTable"));
	private SelenideElement treeOptionOpen = $(LocatorReader.get("features.tables.treeGrid"));
	
	private SelenideElement tableOptionClose = $(LocatorReader.get("features.tables.close"));
	
	//Table Close
	
	
	//Auth Open
	private SelenideElement authOptionOpen = $(LocatorReader.get("features.auth.open"));
	
	private SelenideElement loginOption = $(LocatorReader.get("features.auth.login"));
	
	
	
	private SelenideElement authOptionClose = $(LocatorReader.get("features.auth.close"));	
	//Auth Close
	
	
	
	
	
	
	

	public void clickLayoutOpen() {

		layoutOptionOpen.click();

	}
	
	
	public void clickStepper() {

		layoutOptionStepper.click();

	}

	public void clickAcordion() {

		layoutOptionAcordion.click();

	}

	public void clickLayoutClose() {

		layoutOptionClose.click();

	}

	

	public void clickFormOpen() {

		formOptionOpen.click();

	}

	public void clickFormLayoutOption() {

		formLayoutOption.click();

	}

	public void clickDatepickerOption() {

		datepickerOption.click();

	}

	public void clickFormClose() {

		formOptionClose.click();

	}
	
	
	public void clickModalOpen() {

		modalOptionOpen.click();

	}
	
	public void clickDialogOption() {

		dialogOption.click();

	}
	public void clickWindowOption() {

		windowOption.click();

	}
	public void clickPopoverOption() {

		popoverOption.click();

	}
	public void clickToastrOption() {

		toastrOption.click();

	}
	public void clickTooltipOption() {

		tooltipOption.click();

	}
	
	
	
	public void clickModalClose() {

		modalOptionClose.click();

	}
	
	
	
	
	public void clickExtraOpen() {

		extraOptionOpen.click();

	}
	
	
	
	public void clickExtraCalendar() {

		calendarOption.click();

	}
	
	public void clickExtraClose() {

		extraOptionClose.click();

	}
	
	
	public void clickTableOpen() {

		tableOptionOpen.click();

	}
	
	public void clickSmartTable() {

		smartTableOptionOpen.click();

	}
	
	
	public void clickTree() {

		treeOptionOpen.click();

	}
	
	public void clickTableClose() {

		tableOptionClose.click();

	}
	
	
	public void authOptionOpen() {

		authOptionOpen.click();

	}
	
	
	
	public void clickLoginOption() {

		loginOption.click();

	}
	
	
	public void authOptionClose() {

		authOptionClose.click();

	}
	
	
	
	
	
	
	

}
