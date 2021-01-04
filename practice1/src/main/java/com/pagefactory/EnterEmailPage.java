package com.pagefactory;

import java.util.Random;

import org.openqa.selenium.By;

import com.test.BaseTest;

public class EnterEmailPage {
	
BaseTest objbasetest;
	
	By emailTXt=By.id("email_create");
	By createBtn=By.id("SubmitCreate");

	
	public EnterEmailPage (BaseTest objbasetest)
	{
		this.objbasetest=objbasetest;
	}
public void enterEmail()
{
	Random rand=new Random();
	int num = rand.nextInt(100);
	System.out.println(num);
	objbasetest.getDriver().findElement(emailTXt).sendKeys("anything"+num+"@gmail.com");
}
public void clickOnCreate()
{
	objbasetest.getDriver().findElement(createBtn).click();
}
}
