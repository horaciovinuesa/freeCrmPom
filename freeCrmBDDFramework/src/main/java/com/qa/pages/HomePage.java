package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.runner.TestBase;
import com.qa.runner.TestUtils;

public class HomePage extends TestBase{
	
	//Page factory
	@FindBy(xpath="//td[contains(text(), 'Horacio Vinuesa')]")
	WebElement topMenuUsername;
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contacts;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newContact;
	
	
	//Initialize the elements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogIn() {
		String loginEvidence = "loginSuccesEvidence"+TestUtils.TIME_STAMP;
		takeScreenshot(loginEvidence);
		driver.switchTo().frame("mainpanel");
		return topMenuUsername.isDisplayed();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contacts).build().perform();
		newContact.click();
	}

}
