package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass extends Pojo implements DataholderInterface {
	//Wrapperclass objwrapperclass;
	public void setenvir()
	{
		System.setProperty(path, key);
		driver=new ChromeDriver();
		driver.get(url);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objwrapperclass=new Wrapperclass(this);
	}
  //common method for teardown
	public void teardown()
	{
		driver.close();
	}
   
}
