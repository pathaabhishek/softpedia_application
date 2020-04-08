package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.Wrapperclass;

public class search extends Wrapperclass {
	WebDriver driver;
	@FindBy(id = "hps_input")
	WebElement searchbar;
	public search(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void srch_bar() {
		searchbar.sendKeys("apple iphone");
		searchbar.submit();
	}

}

