package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#Email")
	WebElement usrNameTest;
	@FindBy(css="#Password")
	WebElement pswd;
	@FindBy(css="[type='submit']")
	WebElement loginBtn;
	
	public String doLogin(String userName, String password) {
		usrName.sendKeys(userName);
		pswd.sendKeys(password);
		loginBtn.click();
		return driver.getTitle();
	}
	
}
