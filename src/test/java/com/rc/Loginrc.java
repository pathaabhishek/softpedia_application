package com.rc;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Feature",
		plugin = {"pretty", "html:target\\cucumber-html-report",
				"json:target\\cucumber-json-report",
				"junit:target\\cucumber-junit-report",
				"com.cucumber.listener.ExtentCucumberFormatter:target\\cucmber-extent-report\\Extentreport.html"},
		tags = {"@TC01_01,@TC02_02,@TC03_03,@TC04_04"},
		glue = {"com.sd"},
		monochrome = true
		)

public class Loginrc {
	
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent-config.xml");
	    Reporter.setSystemInfo("user", System.getProperty("user.name"));
	    Reporter.setSystemInfo("os", "Windows");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
	

}