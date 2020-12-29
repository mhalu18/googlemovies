package pageclass;

import org.openqa.selenium.By;

import testclass.BaseClass;

public class SigninPage {
	BaseClass obj1;
	By singlink=By.linkText("Sign in");
	
	
	public SigninPage(BaseClass obj1)
	{
		this.obj1=obj1;
	}
   public void clickonsingin()
   {
	   obj1.click(singlink);
   }
}
