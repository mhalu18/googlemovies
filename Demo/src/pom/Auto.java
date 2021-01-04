package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto {
	WebDriver driver;
	TextBox  tb=new TextBox(driver);
	@BeforeClass
	public void  beforemethod() 
	
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void methos()
	{
  
     
	tb.getFullname("mhalu dhavane");
	tb.getEmail("mhalu@18gmail.com");
	tb.getCurrentAdd("pune");
	tb.getPermanetAdd("pune");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	tb.getSubmitButn();
//    String veri1 = tb.gettext();
	}
	@Test
	public void method1()
	{
		tb.getFullname("rushi");
		tb.getEmail("rushi@1234gmail.com");
		tb.getCurrentAdd("pune");
		tb.getPermanetAdd("");
		tb.getSubmitButn();
		
	}
	@AfterClass
	public void verification()
	{
	 driver.close();
		Reporter.log("you have enterd name is");
	}

}
