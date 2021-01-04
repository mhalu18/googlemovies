package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {

	//name text filed
	@FindBy(xpath="//input[@id='userName']")
	private WebElement  fnTb;
	//email text field
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement emTB;
	//current address
	@FindBy(id="currentAddress")
	private WebElement curAdd;
	
	//permanent address
	@FindBy(id="permanentAddress")
	private WebElement perAdd;
	
	//click button
	@FindBy(xpath="//button[@id='submit']")
	
	private WebElement subBtn;
	//verification
	//@FindBy(xpath="//p[@id='name'")
	//private WebElement veri;
  //initalizing object during run time
	public TextBox(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	//creating method
	public void getFullname(String fullname)   
	{
	fnTb.sendKeys(fullname);	
	}
	public void getEmail(String email)
	{
		emTB.sendKeys(email);
	}
	public void getPermanetAdd(String permanent)
	{
		perAdd.sendKeys(permanent);
	}
	public void getCurrentAdd(String current)
	{
	curAdd.sendKeys(current);	
	}
	public void getSubmitButn()
	{
	
		
		subBtn.click();
	}
//	public String gettext()
//	{
//		return veri.getText();
//	}
}
