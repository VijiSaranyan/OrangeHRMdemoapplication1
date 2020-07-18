package com.baseclass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


//import io.github.bonigarcia.wdm.WebDriverManager;
;

public class Library {

	protected WebDriver driver;
	public static Properties prop;
	//public static Logger logger = LogManager.getLogger(Library.class.getName());
	Logger logger=Logger.getLogger(Library.class);
	
	@BeforeMethod()
	public void setup() throws IOException
	{
		//to generate your own logs
	logger.info("launching chrome browser");
	logger.warn("this is the warning message");
	logger.fatal("this is gthe fatal message");
	logger.debug("this is the debugging statement");
	}


	public void launchApplication() throws IOException {
		FileInputStream file=new FileInputStream("src/test/resources/Configuration/config.properties");
		Properties prop = new Properties();
		prop.load(file);
		logger.info("Property file is loaded");
		String	browser = prop.getProperty("browser");
		String	url = prop.getProperty("url");

		try {
			if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();

			}else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
				driver=new ChromeDriver();
				logger.info("ChromeBrowser is launched ");


			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);

		}catch(WebDriverException e) {
			System.out.println("browser could not be launched");
		}

	}	

	public void quit() {
		driver.close();

	}




}
