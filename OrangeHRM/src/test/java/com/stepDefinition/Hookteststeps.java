package com.stepDefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.OrangeHRMLogin;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookteststeps extends Library {
	SeleniumUtility utility;
	OrangeHRMLogin or;
	@Before
	public void setup() throws IOException
	{
		launchApplication();
	}

	@When("^To get the title$")
	public void to_get_the_title()  {
		utility=new SeleniumUtility(driver);
		utility.getTitle();
	}
	@Then("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String uName, String pass)  {
		or=new OrangeHRMLogin(driver);
		or.UserName(uName);
		or.Password(pass);
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() 
	{
		or.Login();
	}
	
	@After
	public void closebrowser(){
		quit();
	}



}
