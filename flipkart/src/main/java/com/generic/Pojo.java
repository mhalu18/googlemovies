package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {
	static WebDriver driver;
	 Wrapperclass objwrapperclass;
	
	//getter method to get driver
	public WebDriver getDriver()
	{
		return driver;
	}
	
	//method to set driver
	public void setDriver()
	{
		this.driver=driver;
	}
	public Wrapperclass getwrapper()
	{
		return objwrapperclass;
	}

}
