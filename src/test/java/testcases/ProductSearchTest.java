package testcases;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;

public class ProductSearchTest 
{
  @Test(dataProvider = "dp")
  public void search(String productname) 
  {
	  Hook.test = Hook.extent.createTest("product search test");
	     if(LoginTest.login == true)
	     {
	  Hook.productsearchbox.clear();
	  Hook.productsearchbox.sendKeys(productname);
	  
	  Hook.test.log(Status.PASS, MarkupHelper.createLabel( "search product.. "+productname, ExtentColor.GREEN));
		
	  Actions a = new Actions(Hook.driver);
	  a.sendKeys(Keys.ENTER).perform();
	  
	Iterator <WebElement> it =   Hook.productresults.iterator();
	    
	   while(it.hasNext())
	   {
		   WebElement e = it.next();
		   Hook.test.log(Status.PASS, MarkupHelper.createLabel( "search result.. "+e.getText(), ExtentColor.GREEN));
			 
	   }
	     }
	     else
	     {
	    	 Hook.test.log(Status.FAIL, MarkupHelper.createLabel( "Cannot search Login before. ", ExtentColor.RED));
				  	 
	     }
  }

  @DataProvider
  public Object[][] dp() throws Exception 
  {
    return utility.WBConnect.readWBData("AmazonLogin.xlsx", "Sheet2");
  }
}
