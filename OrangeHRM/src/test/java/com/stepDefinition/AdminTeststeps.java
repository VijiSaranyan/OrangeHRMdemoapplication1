/*package com.stepDefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.OrangeHRMLogin;
import com.pages.OrangeHrmAdmin;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminTeststeps extends Library{
	SeleniumUtility utility;
	OrangeHRMLogin or;
	OrangeHrmAdmin or1;
	
	@Given("^To open the browser and navigate to the URL$")
    public void to_open_the_browser_and_navigate_to_the_url() throws IOException 
    {
		launchApplication();

    }
	 @When("^To get the title of the page$")
	    public void to_get_the_title_of_the_page() 
	    {
		 utility=new SeleniumUtility(driver);
			utility.getTitle();
	    }
	/* @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_Username_and_password(String uName,String pass)
	    {
		 or=new OrangeHRMLogin(driver);
			or.UserName(uName);
			or.Password(pass);
	    }
	 @Then("^Click submit button$")
	    public void click_submit_button()
	    {
		 or.Login();
	    }*/


	
	
	 /*@Given("^Admin paged to be launched$")
		public void admin_paged_to_be_launched() 
		{
			or1=new OrangeHrmAdmin(driver);
			or1.viewAdmin();
			or1.userManagement();
			or1.systemUsers();
		}

    @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_something_and_something(String SearchName, String eName) 
    {
    	or1.searchUname(SearchName);
    	or1.searchUserType("Admin");
    	or1.employeeName(eName);
    	or1.userStatus("Enabled");
    }
    
    @Then("^SearchButton$")
    public void searchbutton() 
    {
    	or1.search();
    }

    @Then("^Close the browser  $")
    public void close_the_browser() throws IOException 
    {
    	 utility.to_take_screenshot("src/test/resources/ScreenShots/orange.png");

 		quit();
    }
	
	
}*/
