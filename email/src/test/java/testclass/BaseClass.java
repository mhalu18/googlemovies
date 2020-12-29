package testclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//getter and setter method to set browser
	public static WebDriver objdriver;
	public WebDriver getDriver()
	{
		return objdriver;
	}
	public void  setDriver(WebDriver objdriver )
	{
		this.objdriver=objdriver;
	}
	//set property of browser
	@BeforeClass
public void setProperty()
{
	WebDriverManager.chromedriver().setup();
	objdriver=new ChromeDriver();
	objdriver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	objdriver.manage().window().maximize();
	objdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	//common method to click
	
public void click(By locator)
{
	 objdriver.findElement(locator).click();
}
//common method to send keys
public void sendkeys(By locator, String value)
{
	objdriver.findElement(locator).sendKeys(value);
	
}
//common method to check is enabled 
public boolean enabled(By locator)
{
	boolean enb = objdriver.findElement(locator).isEnabled();
	return enb;
}
//method to take screen shot
public void takescreenshot(String filename) throws IOException
{ 
	
	TakesScreenshot ts=(TakesScreenshot) objdriver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snapshot/"+filename+".png");
	FileUtils.copyFile(src, dest);
		
}
//method to fetch data from excel sheet
public String getexceldata(int rowno,int cellno) throws EncryptedDocumentException, IOException
{    
	String path="./credentials/data.xlsx";
	FileInputStream fis=new FileInputStream(path);
	Workbook wk = WorkbookFactory.create(fis);
	Sheet sheet = wk.getSheet("sheet1");
	Row row = sheet.getRow(rowno);
	Cell cell = row.getCell(cellno);
	return cell.toString();
}
//common method to get title 
public void getPageTitle() {
	   String title = objdriver.getTitle();
	   System.out.println("Title of the page " +title);
	   }
//common method to get text
public String getText(By locator)
{
	WebElement element = objdriver.findElement(locator);
	String returnValue  = element.getAttribute("value");
	System.out.println("Value is "+returnValue);
	return returnValue;
}
	 
	 
}

