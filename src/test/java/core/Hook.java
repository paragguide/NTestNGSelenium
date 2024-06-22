package core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
   // login
	@FindBy(xpath = externalxpath.AmazonXpath.signin)
	public static WebElement signin;
	
	@FindBy(xpath = externalxpath.AmazonXpath.uid)
	public static WebElement uid;
	
	@FindBy(xpath = externalxpath.AmazonXpath.ctnbtn)
	public static WebElement ctnbtn;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err1)
	public static WebElement err1;
	
	@FindBy(xpath = externalxpath.AmazonXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = externalxpath.AmazonXpath.submit)
	public static WebElement submit;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err2)
	public static WebElement err2;
	
	// product
	@FindBy(xpath = externalxpath.AmazonXpath.productsearchbox)
	public static WebElement productsearchbox;
	
	@FindBy(xpath = externalxpath.AmazonXpath.productresults)
	public static List <WebElement> productresults;
	
	
	// forget
		@FindBy(xpath = externalxpath.AmazonXpath.help)
		public static WebElement help;
		
		@FindBy(xpath = externalxpath.AmazonXpath.forgetpwdlink)
		public static WebElement forgetpwdlink;
		
		@FindBy(xpath = externalxpath.AmazonXpath.forgettxtbox)
		public static WebElement forgettxtbox;
	
	
	
	
	
	
}
