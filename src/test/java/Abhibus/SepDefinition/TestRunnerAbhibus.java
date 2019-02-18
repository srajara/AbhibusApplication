package Abhibus.SepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "B:\\Testngpractice\\AbhiBusAplication\\src\\test\\resources\\Feature\\Abhibus.feature",glue = { "Abhibus.SepDefinition" },plugin = {"html:target" })

public class TestRunnerAbhibus {

}
