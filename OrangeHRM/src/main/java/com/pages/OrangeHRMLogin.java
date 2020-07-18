package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.baseclass.Library;
	public class OrangeHRMLogin extends Library{


		WebDriver driver;
		public  OrangeHRMLogin(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void UserName(String uName)
		{
			username.sendKeys(uName);
		}
		public void Password(String pass)
		{
			password.sendKeys(pass);
		}
		public void Login()
		{
			login.click();
		}
		
		
		@FindBy(id="txtUsername")
		WebElement username;

		@FindBy(id="txtPassword")
		WebElement password;
		
		@FindBy(id="btnLogin")
		WebElement login;
		

		
			
		
		
		}
		

