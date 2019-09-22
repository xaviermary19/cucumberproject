package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSmoke {
	WebDriver driver;
	LoginPage lp;
	String actual;
	
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antoj\\Desktop\\Selenium softwares\\new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		lp = new LoginPage(driver);
	}

	@When("^user enters username and password, click on submit button$")
	public void user_enters_username_and_password_click_on_submit_button() throws Throwable {
		
		actual = lp.doLogin("admin@yourstore.com", "admin");
	    
	}

	@Then("^user redirect to dashboard page$")
	public void user_redirect_to_dashboard_page() throws Throwable {
		System.out.println(actual);
	   
	}

}
