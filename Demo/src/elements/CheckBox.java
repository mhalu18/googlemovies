package elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		  //opening the browser and 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement chk = driver.findElement(By.xpath("//span[@class='rct-title']"));
		chk.click();
	boolean chk1 = driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected();
	//verification of check box
	
		 if (chk1==true)
		 {
			 System.out.println("selected");
		 }
		 else
		 {
			 System.out.println("not selected");
		 }
		 //expanding button click
		
	      WebElement expand = driver.findElement(By.xpath("//button[@title='Expand all']"));
	      expand.click();
	      
	      WebElement collaps = driver.findElement(By.xpath("//button[@title='Collapse all']"));     
	      collaps.click();
	      expand.click();
	      chk.click();
	      driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).click();
	      
	      

	}

}
