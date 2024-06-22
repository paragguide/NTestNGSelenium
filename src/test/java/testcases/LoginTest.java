package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;

public class LoginTest extends Hook 
{
	public static boolean login = false;
	
  @Test(priority = 1)
  public void useridtest() 
  {
	  test = extent.createTest("userid test");
		signin.click();
		uid.sendKeys("paragguide@yahoo.co.in");
		ctnbtn.click();
		    try {
  test.log(Status.FAIL, MarkupHelper.createLabel( err1.getText(), ExtentColor.RED));
   Assert.fail("userid is not valid..");
		
		    }
		catch(Exception e)
		    {
	test.log(Status.PASS, MarkupHelper.createLabel( "userid is valid.. ", ExtentColor.GREEN));
	
		    }
  }
  
  @Test(priority = 2,dependsOnMethods= "useridtest")
  public void passwordtest()
  {
	  test = extent.createTest("password test");
	  pwd.sendKeys("RMinfotech12#&&");
	  submit.click();
	  
	  try {
		  test.log(Status.FAIL, MarkupHelper.createLabel( err2.getText(), ExtentColor.RED));
		   Assert.fail("password is not valid..");
				
				    }
				catch(Exception e)
				    {
			test.log(Status.PASS, MarkupHelper.createLabel( "password is valid.. ", ExtentColor.GREEN));
			login = true;
				    }
		 
	  
  }
}
