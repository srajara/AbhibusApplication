package Abhibus.Objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abhibus.SepDefinition.AbhibusHook;

public class AbhibusHomePageobj {
	
	public AbhibusHomePageobj() {
		PageFactory.initElements(AbhibusHook.driver,this);
	}
	@FindBy(id="source")
	private WebElement SourceLocation;
	public WebElement getSourceLocation() {
		return SourceLocation;
	}
	public WebElement getDestLocation() {
		return destLocation;
	}
	public WebElement getDatePicker() {
		return datePicker;
	}
	public WebElement getDateofTravel() {
		return dateofTravel;
	}
	public WebElement getReturnDate() {
		return ReturnDate;
	}
	public WebElement getReturnTmrDate() {
		return ReturnTmrDate;
	}
	@FindBy(id="destination")
	private WebElement destLocation;
	@FindBy(id="datepicker1")
	private WebElement datePicker; 
	@FindBy(xpath="//div[@id=\"tomorrowdiv\"]")
	private WebElement dateofTravel;
	@FindBy(id="datepicker2")
	private WebElement ReturnDate;
	@FindBy(xpath="//a[text()='23']")
	private WebElement ReturnTmrDate;
	@FindBy(xpath="//a[@class='btnab icosearch']")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
		
		}



}
