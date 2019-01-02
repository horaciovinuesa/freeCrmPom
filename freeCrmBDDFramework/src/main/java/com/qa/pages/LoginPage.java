package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.runner.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath="//font[text()='Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	WebElement homePageLogo;
	
	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHomeLogo() {
		return homePageLogo.isDisplayed();
	}
	
	public void enterLoginCredentials(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public HomePage login() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn);
		return new HomePage();
	}
}
