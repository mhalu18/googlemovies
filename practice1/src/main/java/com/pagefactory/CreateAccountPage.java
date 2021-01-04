package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.BaseTest;

public class CreateAccountPage {
	
BaseTest objbasetest;
	
	By firstnameTxt=By.id("customer_firstname");
	By lastnameTxt=By.id("customer_lastname");
	By passTxt=By.id("passwd");
	By dayDrp=By.id("uniform-days");
	By monthDrp=By.id("months");
	By yearDrp= By.id("years");
	By emailTxt=By.id("email");
	By addTxt=By.id("address1");
	By cityTxt=By.id("city");
	By zipTxt=By.id("postcode");
	By statDrp=By.id("id_state");
	By countyDrp=By.id("id_country");
	By mobnumTxt=By.id("phone_mobile");
	By register=By.id("submitAccount");
	By aliasTxt=By.id("alias");
	

	
	public CreateAccountPage(BaseTest objbasetest)
	{
		this.objbasetest=objbasetest;
		
	}
	public void setFirstname()
	{
		objbasetest.getDriver().findElement(firstnameTxt).sendKeys("mhalu");
	}
	public void setlastname()
	{
		objbasetest.getDriver().findElement(lastnameTxt).sendKeys("dhavane");
	}
	public void setPassword()
	{
		objbasetest.getDriver().findElement( passTxt).sendKeys("hsgdfd");
	}
	public void setemail()
	{
		objbasetest.getDriver().findElement( emailTxt).sendKeys("eanything@gmail.com");
	}
	public void setDay()
	{
		WebElement day = objbasetest.getDriver().findElement(dayDrp);
		Select daysel=new Select(day);
		daysel.selectByValue("14");
	}
	public void setMonth()
	{
		WebElement month= objbasetest.getDriver().findElement(monthDrp);
		Select daysel=new Select(month);
		daysel.selectByVisibleText("May");
	}
	public void setYear()
	{
		WebElement year= objbasetest.getDriver().findElement(yearDrp);
		Select daysel=new Select(year);
		daysel.selectByVisibleText("2009");
	}
	public void setAdreess()
	{
		objbasetest.getDriver().findElement(addTxt).sendKeys("home no:46,ivavsys,pune");
	}
	public void setCity()
	{
		objbasetest.getDriver().findElement(cityTxt).sendKeys("pune");
	}
	public void setState()
	{
		WebElement state= objbasetest.getDriver().findElement(statDrp);
		Select stat=new Select(state);
		stat.selectByVisibleText("Alaska");
	}
	public void setCountry()
	{
		WebElement country= objbasetest.getDriver().findElement(countyDrp);
		Select countr=new Select(country);
		countr.selectByVisibleText("United States");
	}
	public void setZip()
	{
		objbasetest.getDriver().findElement(zipTxt).sendKeys("88888");
	}
	public void setMobilenum()
	{
		objbasetest.getDriver().findElement(mobnumTxt).sendKeys("985632478");
	}
	public void setAlia()
	{
		objbasetest.getDriver().findElement(aliasTxt).sendKeys("my adreeessss");
	}
	public void clickRegister()
	{
		objbasetest.getDriver().findElement(register).click();
	}
	


}
