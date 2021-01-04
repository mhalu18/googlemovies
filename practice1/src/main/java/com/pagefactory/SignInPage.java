package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.test.BaseTest;

public class SignInPage  {
	BaseTest objbasetest;
	
	By signInLink=By.xpath("//a[@class='login']") ;
	By username= By.xpath("//span[contains(text(),'mhalu dhavane')]");

	
	public SignInPage(BaseTest objbasetest)
	{
		this.objbasetest=objbasetest;
	}
	
	public void clickOnSignin()
	{
		objbasetest.getDriver().findElement(signInLink).click();
	}
  public void veri()
  {
	   WebElement user = objbasetest.getDriver().findElement(username);
	   
	   System.out.println(user.getText());
	   Assert.assertEquals(user.getText(), "mhalu dhavane");
  }
}
