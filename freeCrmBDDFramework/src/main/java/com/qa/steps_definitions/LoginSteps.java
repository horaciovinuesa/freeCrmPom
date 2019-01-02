package com.qa.steps_definitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.runner.TestBase;
import com.qa.runner.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginSteps extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user is on crm login page$")
	public void user_is_on_crm_login_page() throws Throwable {
	    TestBase.initialization();
	    loginpage = new LoginPage();
	    String title = loginpage.validateHomePageTitle();
	    Assert.assertEquals(TestUtils.LOGIN_PAGE_TITLE, title);
	}

	@Given("^user fills in the login credentials$")
	public void user_fills_in_the_login_credentials() throws Throwable {
	    loginpage.enterLoginCredentials(prop.getProperty("username"), prop.getProperty("password"));
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
	    homepage = loginpage.login();
	}

	@Then("^The homepage is displayed$")
	public void the_homepage_is_displayed() throws Throwable {
	    String title = homepage.verifyTitle();
	    Assert.assertEquals(TestUtils.HOME_PAGE_TITLE,title);
	}

	@Then("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
	    boolean loggedIn = homepage.verifyLogIn();
	    Assert.assertTrue(loggedIn);
	}
	
}
