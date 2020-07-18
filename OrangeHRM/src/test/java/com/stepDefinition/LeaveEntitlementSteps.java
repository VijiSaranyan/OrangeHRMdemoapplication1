/*package com.stepDefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.OrangeHRMLogin;
import com.pages.OrangeHrmLeaveEntitlement;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveEntitlementSteps extends Library{
	SeleniumUtility utility;
	OrangeHRMLogin or;
	 OrangeHrmLeaveEntitlement or2;
	
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
	@Given("^User is on Entitlement page$")
	public void user_is_on_Entitlement_page() {
		System.out.println("The user is on Leave Page");
		or2=new  OrangeHrmLeaveEntitlement (driver);
		or2.Leave();
		or2.LeaveEntitlement();
		
		
	}

	@When("^User clicks on Add Entitlement$")
	public void user_clicks_on_Add_Entitlement() {
		or2.AddEntitlement();
		
		
	}
	@Then("^User selects \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws InterruptedException
	{
		or2=new  OrangeHrmLeaveEntitlement (driver);
		utility=new SeleniumUtility(driver);

		//utility.Checkbox("//input[@id='entitlements_filters_bulk_assign']");
		or2.Employee("Thomas Fleming");
		//utility.selectbydropdown(4);
		//utility.selectbydropdown1("Sales");
		utility.selectbydropdown2("Vacation US");
		utility.selectbydropdown3(6);
		or2.Entitlement("5");
	}

	@Then("^User clicks on Save Button$")
	public void user_clicks_on_Save_Button() {
		or2.Save();
		or2.Cancel();
		
	}
	
	@When("^User clicks on Employee Entitlement$")
	public void user_clicks_on_Employee_Entitlement()
	{
		//or2.EmployeeEntitlement();
	}

	@Then("^the User Selects \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_User_Selects_and_and(String arg1, String arg2, String arg3) {
		or2.Employee1("Thomas Fleming");
		utility.selectbydropdown2("Vacation US");
		utility.selectbydropdown3(4);
	}

	@Then("^User clicks on Search Button$")
	public void user_clicks_on_Search_Button() throws Throwable 
	{
		or2.Search();
	}
	public void user_is_on_Reports_Page() 
	{
		or2.Leave();
	}

	}*/
