package com.sd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cts.Seleniumutility.seleniumutil;
import com.cts.baseclass.Wrapperclass;
import com.pages.search;

import cucumber.api.java.en.Given;

public class Search_Definition extends Wrapperclass {
	search sr;
	seleniumutil screenshot;
	final static Logger LOG = LogManager.getLogger(Search_Definition.class.getName());
	
    @Given("^Launch the sf application$")
    public void launch_the_sf_application() throws Throwable {
		launchApp();
		LOG.info(" softpedia Browser launched sucessfully");
		screenshot = new seleniumutil(driver);
		screenshot.takeSnapShot("C:\\abhishek\\Softpedia\\src\\test\\resources\\screenshot\\search.png");
	}

	@Given("^User enter the required item in search button and click on search$")
	public void user_enter_the_required_item_in_search_button_and_click_on_search() {
		sr.srch_bar();
		LOG.info(" in the search bar the user is entered the text");
		
	
		
	}

	@Given("^the browser is closed$")
public void the_browser_is_closed()  {
		driver.quit();
		LOG.info("Browser sucessfully closed");
		
	}

}
