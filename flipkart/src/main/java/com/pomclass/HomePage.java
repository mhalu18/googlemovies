package com.pomclass;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.generic.Pojo;
import com.generic.Wrapperclass;

public class HomePage {
	Pojo objpojo;
	
	//By cancelBTN= By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	
	By cancelBTN = By.xpath("//div[@class='_2QfC02']//button[@class='_2KpZ6l _2doB4z']");
	By electronicBTN=By.xpath("//span[text()='Electronics']");
	By btnSamsung=By.xpath("//a[@title='Samsung']");
    By btnviewall=By.xpath("//h2[contains(text(),'Latest Samsung mobiles')]//ancestor::div[@class='Nyt1vx']//descendant::span[text()='VIEW ALL']");
	//By allphones=By.xpath("div[class='_13oc-S']");
	By allphones=By.xpath("//div[@class='MIXNux']");
	
	//constructor of Home Page
	public HomePage(Pojo objpojo)
	{
		this.objpojo=objpojo;
		
	}
//handling popoup
	public void clickoncancelBTn() throws InterruptedException
	{
		System.out.println("Close POP UP");
		objpojo.getwrapper().click(cancelBTN);
		System.out.println(" Done");
	}
	public void actionclick()
	{
		objpojo.getwrapper().actionclick(cancelBTN);
	}
	//method to get title of page 
	public String titleOfPage()
	{
		return objpojo.getwrapper().gettitle();
	}
	
	public void ClickOnSamsungButton()
	{
		objpojo.getwrapper().actionclick(btnSamsung);
	}
	//mouse hovar on electronics
	public void mouseHoverOnElec()
	{
//		objpojo.getwrapper().actionclick(electronicBTN);

		Actions act =new Actions(objpojo.getDriver());
		
		//Actions objactions=new Actions(objpojo.getDriver());
		act.moveToElement(objpojo.getDriver().findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().build().perform();
		//objpojo.getwrapper().waitforelement(electronicBTN);
	   
		//objactions.moveToElement(objpojo.getDriver().findElement(shopping)).perform();	
		//objpojo.getDriver().findElement(btnSamsung).click();
		//objpojo.getDriver().findElement(electronicBTN).click();
	}
	
	//this method clicks on viewallphones
	public void clickonViewAll()
	{
	   objpojo.getwrapper().actionclick(btnviewall);
	}
 //methods to select list of mobiles
	public void clickOnRandomMobile()
	{
		List<WebElement> phonelist = objpojo.getDriver().findElements(allphones);
		Random objrandom=new Random();
		int listsize = objrandom.nextInt(phonelist.size());
		WebElement randommobile = phonelist.get(listsize);
		randommobile.click();
		
		
	}
}
