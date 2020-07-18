/*package com.stepDefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.OrangeHRMLeave;
import com.pages.OrangeHRMLogin;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveTestSteps extends Library {
	SeleniumUtility utility;
	OrangeHRMLogin or;
	OrangeHRMLeave or1;
	
	@Given("^To open the browser and navigate to the URL$")
	public void to_open_the_browser_and_navigate_to_the_URL() throws IOException
	{
		launchApplication();
	}

	@When("^the title of login page is OrangeHrm$")
	public void the_title_of_login_page_is_OrangeHrm() 
	{
		utility=new SeleniumUtility(driver);
		utility.getTitle();
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String uName, String pass)  {
		or=new OrangeHRMLogin(driver);
		or.UserName(uName);
		or.Password(pass);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		or.Login();
		
	}

	@Given("^User is on Leavepage$")
	public void user_is_on_Leavepage() {
		System.out.println("The user is on Leave Page");
		or1=new OrangeHRMLeave(driver);
		or1.Leave();
	}

	@When("^User clicks on Leave List$")
	public void user_clicks_on_Leave_List() {
		
        or1.LeaveList();
		
	}

	@Then("^User selects  the \"([^\"]*)\" and To \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_the_and_To_and_and_and_and(String fdate, String tdate, String arg3, String arg4, String arg5, String arg6) throws InterruptedException {
		utility.fromdatepicker("//input[@id='calFromDate']", "11");//to select the from date
		utility.todatepicker("//input[@id='calToDate']", "13");//to select the to date
		utility.Checkbox("//input [@type='checkbox']");
		
		or1.employeeLeaveList("Thomas Fleming");
		utility.selectbydropdown2("Sales");
		or1.buttonSearch();


		
		//or1.FromDate(fdate);
		//or1.ToDate(tdate);
		
		
	}

	@Then("^User clicks on Search Button$")
	public void user_clicks_on_Search_Button() {
		
	}

	@Then("^Click on Close browser$")
	public void click_on_Close_browser() {
	}


}*/
