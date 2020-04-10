package com.sd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cts.Seleniumutility.seleniumutil;
import com.cts.baseclass.Wrapperclass;
import com.pages.Driver_page;


public class Drivers_Definition extends Wrapperclass {
	Driver_page ab;
	seleniumutil screenshot;
	final static Logger LOG = LogManager.getLogger(Drivers_Definition.class.getName());

	 @Given("^Launch the sp applicaion$")
	    public void launch_the_sp_applicaion() throws Throwable {
		 launchApp();
		 LOG.info("Browser sp launched sucessfully");
	}
    @And("^The user on click to the DRIVERS in the application$")
    public void the_user_on_click_to_the_drivers_in_the_application() {
    	screenshot = new seleniumutil(driver);
    	screenshot.takeSnapShot("C:\\abhishek\\Softpedia\\src\\test\\resources\\screenshot\\Drive.png");
    	
    	ab=new Driver_page(driver);
    	ab.gdrivers();
    	ab.gnetgear();
    	//ab.gfirmware();
    	LOG.info("the user clicks the drivers");
    	
    }

   @Given("^Browser is quit$")
   public  void browser_is_quit()  {
    	driver.quit();
    	LOG.info("Browser sucessfully quited");
    }

}