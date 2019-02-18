package Abhibus.Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abhibus.SepDefinition.AbhibusHook;

public class ValidateAbhiBusesAvailabilityobj {
	
	public ValidateAbhiBusesAvailabilityobj() {
	PageFactory.initElements(AbhibusHook.driver, this);
	}
	@FindBy(id="SubHeadJrney")
	private WebElement Validation;
	
	public WebElement getValidation() {
		return Validation;
	}

	public WebElement getReturnValidation() {
		return returnValidation;
	}
	@FindBy(id="SubHeadJrney")
	private WebElement returnValidation;

}
