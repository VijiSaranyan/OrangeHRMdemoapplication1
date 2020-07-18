package com.stepDefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.OrangeHRMLogin;
import com.pages.OrangeHrmReports;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportsTestSteps extends Library {
	SeleniumUtility utility;
	OrangeHRMLogin or;
	OrangeHrmReports or3;
	
	@Given("^Launch the OrangeHrm website$")
	public void launch_the_OrangeHrm_website() throws IOException
	{
		launchApplication();
	}

	@When("^Print title  of page$")
	public void print_title_of_page() 
	{
		utility=new SeleniumUtility(driver);
		utility.getTitle();
	}

	@Then("^Fill \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_and(String uName, String pass)
	{
		or=new OrangeHRMLogin(driver);
		or.UserName(uName);
		or.Password(pass);
	}

	@Then("^submit$")
	public void submit() 
	{
		or.Login();
	}

	@Then("^Clicks  on Leave tab and then  on Reports tab$")
	public void clicks_on_Leave_tab_and_then_on_Reports_tab()
	{
		System.out.println("The user is on Leave Page");
		or3=new  OrangeHrmReports (driver);
		or3.Leave();
	}

	@Then("^Click on Leave Entitlements and Usage Reports$")
	public void click_on_Leave_Entitlements_and_Usage_Reports()
	{
		//or3=new  OrangeHrmReports (driver);
		or3.Reports();
		or3.Balance();
	}

	@Then("^Click on Generate For Leave Type or Employee$")
	public void click_on_Generate_For_Leave_Type_or_Employee() throws InterruptedException
	{
		or3.Generate_For(1);
		//or3.Generate_For(2);

	}

	@When("^User Clicks on Leave Type and Fills the Leave Type ,From ,Job Title,Location,Sub Unit$")
	public void user_Clicks_on_Leave_Type_and_Fills_the_Leave_Type_From_Job_Title_Location_Sub_Unit() throws InterruptedException 
	{
		or3.Leave_Type(0, 0, 10, 6, 1);
		or3.CheckBox();
	}

	/*@When("^User Clicks on Employee and Fills the  Employee and From$")
	public void user_Clicks_on_Employee_and_Fills_the_Employee_and_From() 
	{
		or3.Employee_Type("Linda Anderson",2);
	}*/

	@Then("^User Clicks on View Button and Close the Browser$")
	public void user_Clicks_on_View_Button_and_Close_the_Browser() {
		
	    or3.View_Button();
	   // utility.quit();
	}



}
