package Abhibus.SepDefinition;

import org.openqa.selenium.support.PageFactory;

import Abhibus.Objectrepository.ValidateAbhiBusesAvailabilityobj;
import cucumber.api.java.en.Then;

public class ValidateAbhiBusesAvailabilitystep {
	
	public ValidateAbhiBusesAvailabilitystep() {
	PageFactory.initElements(AbhibusHook.driver, this);
	}
	
	
	@Then("User Validation the Bus Details in Bus_Search Page")
	public void user_Validation_the_Bus_Details_in_Bus_Search_Page() {
		ValidateAbhiBusesAvailabilityobj user_VerifyBus = new ValidateAbhiBusesAvailabilityobj();
		System.out.println("VAlidation Page output"+user_VerifyBus.getValidation().getText());
	}

}
