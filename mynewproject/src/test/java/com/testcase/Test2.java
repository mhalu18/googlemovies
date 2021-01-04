package com.testcase;

import org.testng.annotations.Test;

import com.pom.SingUP;

public class Test2 extends Test1{
	@Test
	public void filldetails()
	{
		SingUP sign=new SingUP(getDriver());
		sign.firstname("ram");
		sign.lastname("deshmukh");
		sign.mobilenum("8880752827");
		sign.password("ram@1234");
		sign.daydropdown();
		sign.monthdropdown();
		sign.yrardropdown();
		sign.radiobtn();
		sign.signup();
	}

}
