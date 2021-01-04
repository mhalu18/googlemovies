package alertwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  public static void main(String[] args) {
	  //opening the browser and filling the text box
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
	js.executeScript("window.scrollBy(0,400)", "");
	driver.findElement(By.xpath("//span[text()='Alerts']")).click();
	
//	handling accept alert
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	driver.switchTo().alert().accept();
	
//handling alert after 5sec
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
//confirm alert
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	driver.switchTo().alert().accept();
	
//verification for selection
	String msg = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
	if(msg=="You selected Ok")
	{
		System.out.println("alert handled");
	}
	else
	{
		System.out.println("alert dissmesed");
	}
//handling promt button
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	driver.switchTo().alert().sendKeys("mhalu");
	driver.switchTo().alert().accept();
	driver.close();
}
 
}
