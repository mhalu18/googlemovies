package testclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;

import pageclass.UserName;

public class UsernameTest extends testSignin {
	UserName un=new UserName(this);
	@Test
	public void enteremail() throws EncryptedDocumentException, IOException
	  {
		boolean enable = un.emailtexenabled();
		if(enable=true)
		{
		un.enteremail(this.getexceldata(0, 1));
		un.clickonnext();
		}
		else
		{
			System.out.println("text box is not enabled");
			this.takescreenshot("emailfailed");
		}

	  }
	{
	if(objdriver.getTitle().equalsIgnoreCase(""))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
			//this.takescreenshot("tilteof page");
		}
	else
		{
			System.out.println("testfailes");
			Assert.assertTrue(false);
			//this.takescreenshot("ailed page");
		}
	}
}

