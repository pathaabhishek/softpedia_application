package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.Wrapperclass;

public class game extends Wrapperclass {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[3]/ul[1]/li[3]/a")
	WebElement game;
	public game(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	
	public void fgame() {
	   game.click();
	}

}
