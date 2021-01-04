package com.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom.CreateAccount;

public class Test1 extends Baseclass{
	
	
	
	@Test
	public void createaccount() throws IOException
	{
	     log.info("Created object for pom class");
	     
		CreateAccount ca= new CreateAccount(getDriver());
		ca.button();
		System.out.println(driver.getTitle());
		
		log.info("getting titlt");
		
		if(driver.getTitle().equalsIgnoreCase("log in or sign up "))
		{   
			  Baseclass.takescreenshot("facebook2");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);;
		 
			
		}
		
	}
	

	

}

