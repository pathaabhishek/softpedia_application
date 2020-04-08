package com.sd;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cts.Seleniumutility.seleniumutil;
import com.cts.baseclass.Wrapperclass;
import com.pages.Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Definition extends Wrapperclass{
	Loginpage log;
	seleniumutil screenshot;
	
	final static Logger LOG = LogManager.getLogger(Login_Definition.class.getName());
	
	@Given("^Launch the softpedia website$")
	public void launch_the_softpedia_website()throws IOException {
		launchApp();
		LOG.info("Browser launched sucessfully");
		
	}
	@Then("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() {
		log = new Loginpage(driver);
		log.loginbtn();
		LOG.info("Clicked on login button");
		
	}

	@Then("^user enters\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		log = new Loginpage(driver);
		log.fusername(username);
		log.fpassword(password);
		LOG.info("entered username and password");
		
	}
	@Then("^Exit the browser$")
	public void exit_the_browser() {
		screenshot = new seleniumutil(driver);
		screenshot.takeSnapShot("C:\\abhishek\\Softpedia\\src\\test\\resources\\screenshot\\Login.png");
		driver.quit();
		LOG.info("Browser quit sucessfully");
		
	}
}
