package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;

public class ForgetPwdTest extends Hook
{
  @Test
  public void forgettest()
  {
	  test = extent.createTest("forget test");
	  signin.click();
	  help.click();
	  forgetpwdlink.click();
	  forgettxtbox.sendKeys("paragguide@yahoo.co.in");
	  test.log(Status.PASS, MarkupHelper.createLabel( "request to get pwd sent.. ", ExtentColor.GREEN));
		
  }
}
