package runner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepDefinitions.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/cucumber"},
		features = {"src/test/resources/features"},
		glue = {"stepDefinitions/"},
		tags = {"@Login_user"},
		monochrome = true,
		dryRun = false
		)

public class TestRunner {
	
	//before class
	@BeforeClass
	public static void setUp() {
		BasePage.init_extentReport();
	}
	
	@AfterClass
	public static void tearDown() {
        BasePage.driver.quit();
        BasePage.generateExtentReport();
	}
	

}