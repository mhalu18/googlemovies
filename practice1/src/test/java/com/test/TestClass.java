package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagefactory.CreateAccountPage;
import com.pagefactory.EnterEmailPage;
import com.pagefactory.SignInPage;

public class TestClass extends BaseTest {
	SignInPage objsignpage=new SignInPage(this);
	EnterEmailPage objenteremailpage=new EnterEmailPage(this);
	CreateAccountPage objcreatepage=new CreateAccountPage(this);
	@BeforeClass
	public void setenvir()
	{
		this.envirment();
	}
	@Test
	public void signIn()
	{
		
		objsignpage.clickOnSignin();
		 objenteremailpage.enterEmail();
		 objenteremailpage.clickOnCreate();
		 objcreatepage.setFirstname();
		 objcreatepage.setlastname();
		 objcreatepage.setPassword();
		 //objcreatepage.setemail();
		 //objcreatepage.setDay();
		 //objcreatepage.setMonth();
		 //objcreatepage.setYear();
		 objcreatepage.setAdreess();
		 objcreatepage.setCity();
		 objcreatepage.setState();
		 objcreatepage.setZip();
		 objcreatepage.setCountry();
		 objcreatepage.setMobilenum();
		 objcreatepage.setAlia();
		 objcreatepage.clickRegister();
		 
	
	}
	@Test
	public void veri()
	{
		objsignpage.veri();
	}

}
