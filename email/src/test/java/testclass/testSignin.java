package testclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;

import pageclass.SigninPage;
import pageclass.UserName;

public class testSignin  extends BaseClass{
	SigninPage objsigninpage=new SigninPage(this);
	UserName objusername=new UserName(this);
	@Test
	public void singin()
	
	{ 
	  objsigninpage.clickonsingin();
	}

	@Test
	public void enteremail() throws EncryptedDocumentException, IOException
	  {
		boolean enable = objusername.emailtexenabled();
		if(enable=true)
		{
		objusername.enteremail("testivavsys@gmail.com");
		objusername.clickonnext();
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

		}
	else
		{
			System.out.println("testfailes");
			Assert.assertTrue(false);
	
		}
	}
}
