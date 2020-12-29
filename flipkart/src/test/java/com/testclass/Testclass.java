package com.testclass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.Baseclass;
import com.pomclass.HomePage;

public class Testclass extends Baseclass {

	HomePage objhomepage=new HomePage(this);
	
	
	
	
	@BeforeClass
	public void setbrowser()
	{
	this.setenvir();
	}
	@Test(priority=0)
	public void openHomePage() throws InterruptedException
	{
		objhomepage.actionclick();
		objhomepage.mouseHoverOnElec();
		objhomepage.ClickOnSamsungButton();	
	}
	@Test(priority=1)
	public void viewall()
	{
		objhomepage.clickonViewAll();
		objhomepage.clickOnRandomMobile();
	}
//	@Test
//	public void  verifytitle()
//	{
//      String  title = objhomepage.titleOfPage();
//      String expectedtitle=actualtitle;
//      Assert.assertEquals(title, expectedtitle);
//     }
//	

}
