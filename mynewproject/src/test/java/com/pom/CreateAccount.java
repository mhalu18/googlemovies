package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcase.Baseclass;

public class CreateAccount {
	Baseclass driver;
	public CreateAccount(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[.='Create New Account']")
	public  WebElement btn;
 public void button()
 {
	 btn.click();
 }
}

