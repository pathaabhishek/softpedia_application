package com.sd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cts.Seleniumutility.seleniumutil;
import com.cts.baseclass.Wrapperclass;
import com.pages.game;


public class Games_Definition extends Wrapperclass {
    game as;
    
    seleniumutil screenshot;
	final static Logger LOG = LogManager.getLogger(Games_Definition.class.getName());
    @Given("^Launch the softpedia applicaion$")
    public void launch_the_softpedia_applicaion() throws IOException {
        launchApp();
        LOG.info("SF launched sucessfully");
    }

    @And("^The user can play the games on click to the GAMES$")
    public void the_user_can_play_the_games_on_click_to_the_games() 
    
    {
    	as=new game(driver);
    	as.fgame();
    	LOG.info("Browser launched sucessfully and user enters the required game");
    	
    }

    @And("^Exit the sf browser$")
    public void exit_the_sf_browser()  {
    	driver.quit();
    }
}
    

