package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.Wrapperclass;

public class search extends Wrapperclass {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"hps_input\"]")
	WebElement search_bar;
	public search(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void search_bar_item() {
		search_bar.sendKeys("apple iphone");
		search_bar.submit();
	}

}

