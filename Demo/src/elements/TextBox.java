package elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  public static void main(String[] args) {
	  //opening the browser and filling the text box
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	adding the name email id and address to text filed
	WebElement fullname = driver.findElement(By.xpath("//input[@type='text']"));
	boolean chec = fullname.isEnabled();
	if(chec==true)
	{
	fullname.clear();
	fullname.sendKeys("king karana");
	}
	else
	{
		System.out.println("not enabled");
	}
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.clear();
	email.sendKeys("karan@mahabharat.com");
	WebElement adress = driver.findElement(By.id("currentAddress"));
	adress.clear();
	adress.sendKeys("kurukestra");
	WebElement padresss = driver.findElement(By.id("permanentAddress"));
	padresss.clear();
	padresss.sendKeys("kurukestra");
	//Scroll down the page
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	//click on submit button
	WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
	button.click();
	
	//verify the values inserted
	String veri = fullname.getAttribute("value");
	String veri1 = driver.findElement(By.xpath("//p[@id='name']")).getText();
	if(veri1.replace("Name:", "").equals(veri))
	{
		System.out.println("name enterd"+veri);
		System.out.println("filled name is 2"+veri1);
	}
	else
	{
		System.out.println("fail");
	}
	//verify email
	String everi = email.getAttribute("value");
	String everi1 = driver.findElement(By.xpath("//p[@id='email']")).getText();
    if(everi1.replace("Email:", "").equals(everi))
    {
    	System.out.println("true");
    }
    else
    {
    	System.out.println("false");
    }
	
	
	//driver.close();
	
	
	
	
	
	
	
}
}
