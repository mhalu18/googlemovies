package elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		  //opening the browser and 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.xpath("//span[.='Buttons']")).click();
		WebElement dclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	Actions as=new Actions(driver);
	
	//double click
	
	as.doubleClick(dclick).perform();
	String result = driver.findElement(By.xpath("//p[.='You have done a double click']")).getText();
	if(result=="You have done a double click")
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("failed");
	}
	//right click
	WebElement right = driver.findElement(By.xpath("//button[.='Right Click Me']"));
	as.contextClick(right).perform();
	 String result2 = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
	 
	 //verification
if(result2=="You have done a right click")
{
	System.out.println("test pass");
}
else
{
	System.out.println("test failed");
}
//click

WebElement click = driver.findElement(By.xpath("//button[.='Click Me']"));
 as.click(click).perform();
	}
}
