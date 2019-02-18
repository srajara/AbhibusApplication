package Abhibus.SepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AbhibusHook {

	public static WebDriver driver;
	@Before
	public static void Loaddriver() {
		System.setProperty("webdriver.chrome.driver", "B:\\Testngpractice\\AbhiBusAplication\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public static void quitbrowser() {
	driver.quit();
	}
	
}
