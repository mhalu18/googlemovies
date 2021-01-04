package com.testcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	 static WebDriver driver;
	 public static Logger log;
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(WebDriver driver)
	{
		Baseclass.driver=driver;
	}
	@BeforeClass
	 public void method()
	{
	 //opening the browser and filling the text box
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 log = Logger.getLogger(Baseclass.class);
//	 PropertyConfigurator.configure("log4j.properties");
	 DOMConfigurator.configure("log4j.xml");
	
	
	}
	
	public static void takescreenshot(String filename) throws IOException
	{ 
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snapshot/"+filename+".png");
		FileUtils.copyFile(src, dest);
			
	}
  
}
