package Abhibus.SepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Abhibus.Objectrepository.AbhibusHomePageobj;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AbhibusHomePageStep {
	
	
	
	@Given("User Entering Abibus Application HomePage")
	public void user_Entering_Abibus_Application_HomePage() {
		
		AbhibusHook.driver.get("https://www.abhibus.com/");
	    
	}

	@When("User Fills Sourse and Destination location details {string},{string}")
	public void user_Fills_Sourse_and_Destination_location_details(String user_SourceLoc, String user_DestLoca) throws AWTException, InterruptedException {
		AbhibusHomePageobj user_Fill = new AbhibusHomePageobj();
		Robot rc = new Robot();
		user_Fill.getSourceLocation().sendKeys(user_SourceLoc);
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER );
		user_Fill.getDestLocation().sendKeys(user_DestLoca);
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_TAB);
		rc.keyPress(KeyEvent.VK_ENTER);
		user_Fill.getDatePicker().click();
		user_Fill.getDateofTravel().click();

	}

	@When("User Click the Search button in Abibushomepage")
	public void user_Click_the_Search_button_in_Abibushomepage() {
		AbhibusHomePageobj user_Search=new AbhibusHomePageobj();
		user_Search.getSearchBtn().click();
	    
	}

	


}
