package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusablefunctions.SeleniumUtility;

public class OrangeHrmReports{
	WebDriver driver;
	SeleniumUtility utility=new SeleniumUtility(driver);

	public OrangeHrmReports(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//this method is for username 
	public void UserName(String uName)
	{
		username.sendKeys(uName);
	}
	//this method is for password
	public void Password(String pass)
	{
		password.sendKeys(pass);
	}
	//this method is for login
	public void Login()
	{
		login.click();
	}
	//this method is to click on Leave module
	public void Leave()
	{
		leave.click();
	}
	//this method is to click Reports which is under leave module
	public void Reports()
	{
		report.click();
	}
	//this method is to click on leave Entiltements and usuage reports
	public void Balance()
	{
		balance.click();
	}
	//this is to click on leave type or employee
	public void Generate_For(int generate1) throws InterruptedException
	{
		generate.click();
		utility.selectDropDownByIndex(generate,generate1);
		//Thread.sleep(2000);
	}
	/*public void Employee_Type(String emp,int period1)
	{
		employee.sendKeys(emp);
		utility.selectDropDownByIndex(period,period1);
		
	}*/
	
	//this method is to click on leave type and fill the form
	public void Leave_Type(int ltype1,int period1,int jtitle1 ,int location1,int  subunit1) throws InterruptedException
	{
		utility.selectDropDownByIndex(ltype, ltype1);
		utility.selectDropDownByIndex(period, period1);
		//Thread.sleep(2000);
		utility.selectDropDownByIndex(jtitle, jtitle1);
		//Thread.sleep(2000);
		utility.selectDropDownByIndex(location,location1);
		//Thread.sleep(2000);
		utility.selectDropDownByIndex(subunit, subunit1);
		
	}
	//tjis method is o click on the checkbox
	public void CheckBox()
	{
		pemployee.click();
	}
	
	//thios emthod is to click on the view button
	public void View_Button()
	{
		view.click();
	}

	@FindBy(id="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;

	@FindBy(id="btnLogin")
	WebElement login;

	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;

	@FindBy(id="menu_leave_Reports")
	WebElement report;

	@FindBy(xpath="//a[@id='menu_leave_viewLeaveBalanceReport']")
	WebElement balance;

	@FindBy(id="leave_balance_report_type")
	WebElement generate;

	@FindBy(xpath="//input[@id='leave_balance_employee_empName']")
	WebElement employee;
	
	@FindBy(xpath="//select[@id='period']")
	WebElement period;

	@FindBy(xpath="//select[@id='leave_balance_leave_type']")
	WebElement ltype;
	
	@FindBy(xpath="//select[@id='leave_balance_job_title']")
	WebElement jtitle;
	
	@FindBy(xpath="//select[@id='leave_balance_location']")
	WebElement location;
	
	@FindBy(xpath="//select[@id='leave_balance_sub_unit']")
	WebElement subunit;
	
	@FindBy(xpath="//input[@id='leave_balance_include_terminated']")
	WebElement pemployee;
	
	@FindBy(xpath="//input[@id='viewBtn']")
	WebElement view;
}
