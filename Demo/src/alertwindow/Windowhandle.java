package alertwindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
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
	js.executeScript("window.scrollBy(0,150)", "");
	driver.findElement(By.xpath("//span[.='Browser Windows']")).click();
	
	//handling the single window
	String current = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	 driver.switchTo().window(current);
	//handling the multiple window
	 driver.findElement(By.xpath("//button[.='New Window']")).click();
	 
	Set<String> allwindow = driver.getWindowHandles();
	Iterator<String> it = allwindow.iterator();
	
	
	while(it.hasNext())
	{
		String child1 = it.next();
		if(!current.equalsIgnoreCase(child1))
         {
			 driver.switchTo().window(child1);
             WebElement text = driver.findElement(By.id("sampleHeading"));
             System.out.println("Heading of child window is " + text.getText());
             driver.close();
             System.out.println("Child window closed");
	
        }
		
	}
	 driver.switchTo().window(current);
     driver.quit();

	   
			
		}
	}
			
	
	
 
  

