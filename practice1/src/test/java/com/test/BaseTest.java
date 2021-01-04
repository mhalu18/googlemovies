package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public WebDriver getDriver()
	{
		return driver;
	}
 public void envirment()
 {
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	 driver.get("http://automationpractice.com/index.php");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
		 
 }
 public void teardown()
 {
	driver.close();
 }
}
