package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.Wrapperclass;

public class Loginpage extends Wrapperclass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navicos\"]/li[3]")
	WebElement loginbtn;
	@FindBy (id = "_lu")
	WebElement email;
	@FindBy (id = "_lp")
	WebElement userpassword;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void loginbtn() {
		loginbtn.click();
	}
	public void fusername(String username) {
		email.sendKeys(username);
	}
	public void fpassword(String password) {
		userpassword.sendKeys(password);
	}
}
