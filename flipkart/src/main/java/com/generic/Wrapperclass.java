package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapperclass {
	Pojo objpojo;
	WebDriverWait objwebdriverwait;
	public Wrapperclass(Pojo objpojo)
	{
		this.objpojo=objpojo;
	}
	
	//common method for click
	public void click(By locator)
	{
		objpojo.getDriver().findElement(locator);
	}
	//common method to set text
	public void setTxt(By locator,String entertex)
	{
		objpojo.getDriver().findElement(locator).sendKeys(entertex);
	}
   //common method to getTex
	public void getTxt(By locator)
	{
		objpojo.getDriver().findElement(locator).getText();
	}
	//common method for scrolldown
	public void scrollDown()
	{
		JavascriptExecutor objrefjs=(JavascriptExecutor) objpojo.getDriver();
		objrefjs.executeScript("window.scrollBy(0,300)", "");
	}
	//common method to get title
	public String  gettitle()
	{
		String title = objpojo.getDriver().getTitle();
		return title;
	}
	//common method to action clicl
	public void actionclick(By locator)
	{    
		WebElement element = objpojo.getDriver().findElement(locator);
		JavascriptExecutor objjse=(JavascriptExecutor) objpojo.getDriver();
		objjse.executeScript("arguments[0].click();", element);
	}
	//common method to mousehover
	public void mousehovar(By locator) 
	{
		Actions objaction =new Actions(objpojo.getDriver());
		//objaction.moveToElement(target)
	}
	//common method to wait
	public void waitforelement(By locator)
	{
		objwebdriverwait=new WebDriverWait(objpojo.getDriver(),30);
		objwebdriverwait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
