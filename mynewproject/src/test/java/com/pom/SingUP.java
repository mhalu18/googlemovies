package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingUP {
	Select drop;
	//handlind textbox
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement ftName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement ltName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mnum;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement psTb;
// day dropdown
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement dayDrop;

//month Dropdown
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement monDrop;
//year Dropdown
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement yearDrop;
	
//handling radio button	
	@FindBy(xpath="//label[.='Male']")
	private WebElement male;
	
//signup button	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement sigBtn;

//constructer 
	public SingUP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//methods
	public void firstname(String firstname)
	{
		ftName.sendKeys(firstname);
	}
	public void lastname(String lastname)
	{
		ltName.sendKeys(lastname);
	}
	public void mobilenum(String number)
	{
		mnum.sendKeys(number);
	}
	public void password(String password)
	{
		psTb.sendKeys(password);
	}
	public void daydropdown()
	{
		drop= new Select(dayDrop); 
		drop.selectByValue("15");;
	}
	public void monthdropdown()
	{

		drop= new Select(monDrop); 
		drop.selectByVisibleText("Mar");
	}
	public void yrardropdown()
	{
		Select drop= new Select(yearDrop); 
		drop.selectByValue("2010");;
	}
public void radiobtn()
{
	male.click();
}
public void signup()
{
	sigBtn.click();
}
}
