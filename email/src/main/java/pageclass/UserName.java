package pageclass;

import org.openqa.selenium.By;

import testclass.BaseClass;

public class UserName {
	BaseClass obj1;
	By emailTexbox=By.xpath("//input[@type='email']");
	By nextBtn=By.xpath("//span[.='Next']");
	public UserName(BaseClass obj1)
	{
		this.obj1=obj1;
	}
	public void enteremail(String email)
	{
		obj1.sendkeys(emailTexbox, email);
	}
   public void clickonnext()
   {
	   obj1.click(nextBtn);
   }
  public boolean emailtexenabled()
  {
	 boolean enb = obj1.enabled(emailTexbox);
	return enb ;
  }
}
