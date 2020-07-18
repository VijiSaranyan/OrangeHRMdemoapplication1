package com.reusablefunctions;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.google.common.io.Files;

public class SeleniumUtility extends Library{
	WebDriver driver;

	public SeleniumUtility(WebDriver driver) {
		this.driver=driver;

	}
	
	public void fromdatepicker(String path,String date) throws InterruptedException
	{
		driver.findElement(By.xpath(path)).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(date)).click();

	}
	public void todatepicker(String path1,String date1)
	{
		driver.findElement(By.xpath(path1)).click();
		driver.findElement(By.linkText(date1)).click();

	}
	
	 public void selectDropDownByIndex(WebElement element, int index ){

         Select selectByIndex = new Select(element);
         selectByIndex.selectByIndex(index);  
        // WebElement option=selectByIndex.getFirstSelectedOption();
        // Actions action = new Actions(driver);
         //action.keyDown(Keys.CONTROL).click(element).build().perform();
  }
	 public void selectDropDownByValue(WebElement element, String value ){
		  Select selectByValue = new Select(element);
         selectByValue.selectByValue(value);
         

		}
	 public void selectDropDownByVisibleText(WebElement element, String visibleText ){
         Select selectByVisibleText = new Select (element);
         selectByVisibleText.selectByVisibleText(visibleText);
            
	}
	 public   void checkbox_Checking(WebElement checkbox,String value) {
			boolean checkstatus;
			checkstatus = checkbox.isSelected();
			if (checkstatus == true) {
			System.out.println("Checkbox is already checked");
			} else {
			checkbox.click();
			System.out.println("Checked the checkbox");
			}
			}

	/* public void selectbydropdown4(int index)
		{
			WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_report_type']"));
			Select dropDown= new Select(mySelectElement);
			dropDown.selectByIndex(index);

		}
	
	//Location
	/*public void selectbydropdown(int index) throws InterruptedException

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='entitlements_filters_location']"));
		Thread.sleep(2000);
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByIndex(index);

	}
	//subunit
	public void selectbydropdown1(String dropdown2) throws InterruptedException

	{
		WebElement mySelectElement1 = driver.findElement(By.xpath("//select[@id='entitlements_filters_subunit']"));
		Thread.sleep(2000);
		Select drop= new Select(mySelectElement1);
		drop.selectByVisibleText(dropdown2);

	}
	//Leave Type
	public void selectbydropdown2(String dropdown3)

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='entitlements_leave_type']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByVisibleText(dropdown3);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(mySelectElement).build().perform();

	}
	public void selectbydropdown3(int index)

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='period']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByIndex(index);

	}
	public void selectbydropdown4(int index)
	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_report_type']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByIndex(index);

	}
	public void selectbydropdown5(String dropdown3)

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_leave_type']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByVisibleText(dropdown3);
	}
	public void selectbydropdown6(String dropdown3)

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_job_title']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByVisibleText(dropdown3);
	}
	public void selectbydropdown7(int index) throws InterruptedException

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_location']"));
		Thread.sleep(2000);
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByIndex(index);

	}
	public void selectbydropdown8(String dropdown3)

	{
		WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='leave_balance_sub_unit']"));
		Select dropDown= new Select(mySelectElement);
		dropDown.selectByVisibleText(dropdown3);
	}*/
	
	
	public void AlterHandling() throws InterruptedException
	{

		driver.findElement(By.id("OrangeHRM - Confirm Leave Assignment")).click();
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
	}
	public void Checkbox(String locator)
	{
		 List <WebElement> li= driver.findElements(By.xpath(locator));
	        //System.out.println(li.size());
	                for(int i=0;i<=li.size()-1;i++)
	                {
	                    li.get(i).click();
	                }
	                
	}
	
	


	public void to_take_screenshot(String path) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(path));
	}

	public void getTitle() {

		System.out.println(driver.getTitle());

	}
	public void Explicitlywait(String Locator) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
	}
	public void quit() {
		driver.close();

	}



}
