package alertwindow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  public static void main(String[] args) {
	  //opening the browser and filling the text box
	WebDriver driver=new ChromeDriver();
//	driver.get("https://demoqa.com");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,300)", "");
//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
//	js.executeScript("window.scrollBy(0,400)", "");
//	
//	driver.findElement(By.xpath("//span[.='Frames']")).click();
//	List<WebElement> ifr = driver.findElements(By.tagName("iframe"));
//	System.out.println(ifr.size());
//	
//	driver.switchTo().frame(1);
//	System.out.println("inside1");
////	driver.quit();
////	driver.switchTo().frame(0);
////	System.out.println("inside0");
//	driver.switchTo().defaultContent();
	
	driver.get("https://demoqa.com/nestedframes");
	List<WebElement> ifr1 = driver.findElements(By.tagName("iframe"));
	System.out.println(ifr1.size());
	driver.close();
//	WebElement parent = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//	driver.switchTo().frame(parent);
//
//	js.executeScript("window.scrollBy(0,500)", "");
//	
//	WebElement child = driver.findElement(By.xpath("//iframe[@id='frame2']"));
//	
//	driver.switchTo().frame(child);
//	
  }

}
