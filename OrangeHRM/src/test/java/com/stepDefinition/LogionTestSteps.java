/*package com.stepDefinition;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.baseclass.Library;
import com.pages.OrangeHRMLogin;
import com.pages.OrangeHrmLeaveList;
import com.reusablefunctions.SeleniumUtility;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogionTestSteps extends Library {
	SeleniumUtility utility;
	OrangeHRMLogin or;
	//OrangeHrmAdmin or1;
	OrangeHrmLeaveList or1;


	@Given("^To open the browser and navigate to the URL$")
	public void to_open_the_browser_and_navigate_to_the_URL() throws IOException {
		launchApplication();
	}

	
	@When("^To get the title of the page$")
	public void to_get_the_title_of_the_page()  {
		utility=new SeleniumUtility(driver);
		utility.getTitle();
	}
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String uName, String pass)  {
		or=new OrangeHRMLogin(driver);
		or.UserName(uName);
		or.Password(pass);
	}

	@Then("^Click submit button$")
	public void click_submit_button() throws IOException {
		or.Login();
	    utility.to_take_screenshot("src/test/resources/ScreenShots/orangevalid.png");

	}
	/*@When("^User clicks on  Leave page$")
	public void user_clicks_on_Leave_page() 
	{
	
		or1=new OrangeHrmLeaveList(driver);
		
		or1.Leave();
	//or1.LeaveList();

	}
	@Then("^Click Admin button$")
	public void click_Admin_button() 
	{
		or1=new OrangeHrmAdmin(driver);
		or1.viewAdmin();
	}
	
	@Given("^Admin page to be launched$")
	public void admin_page_to_be_launched() {
		or1.userManagement();
		or1.systemUsers();
	}
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and_and_and(String SearchName, String Utype, String eName, String Status) 
	{
		or1.searchUname(SearchName);
		or1.searchUserType(Utype);
		or1.employeeName(eName);
		or1.userStatus(Status);
	}

	@Then("^SearchButton$")
	public void searchbutton() throws Throwable {
	    or1.search();
	}

	
	
	@Then("^Close the browser$")
	public void close_the_browser() throws IOException  {


	}

}*/
