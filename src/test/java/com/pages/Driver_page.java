package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.Wrapperclass;

public class Driver_page extends Wrapperclass {
	WebDriver driver;
	@FindBy(xpath= "//*[@class=\"upcase fw500 mgleft_7\"  and  @href=\"https://drivers.softpedia.com/\"]")
	WebElement drivers;
	@FindBy(xpath = "//*[@href=\"https://drivers.softpedia.com/get/Router-Switch-Access-Point/NETGEAR/\"]")
	WebElement netgear;
	@FindBy(xpath = "//*[@class=\"col-white\"]")
	WebElement firmware;
	public Driver_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void gdrivers() {
	   drivers.click();
	}
	public void gnetgear() {
		netgear.click();
	}
	public void gfirmware() {
		firmware.click();
	}

}

