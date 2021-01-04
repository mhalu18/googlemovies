package elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		  //opening the browser and 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//clicking on yes radio button
		WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yes.click();
		//clicking on impresive
		WebElement impre = driver.findElement(By.xpath("//label[.='Impressive']"));
		impre.click();
		//checking is clicked or not
		if(impre.isEnabled())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//verifying display message displayed or not
		String disp = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		if(disp=="You have selected Impressive")
		{
			System.out.println("test succed");
		}
		//checking for no button is clicable or not
		WebElement no = driver.findElement(By.xpath("//label[@for='noRadio']"));
		System.out.println(no.isEnabled());
		{
	
		}
		no.click();
		
		
	
	
		
	}
	

}
