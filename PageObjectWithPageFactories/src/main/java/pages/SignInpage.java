package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Page;
import Locators.SignInLocaters;

public class SignInpage extends Page {
	
	public SignInLocaters SignInLocaters;
	public SignInpage()
	{
		this.SignInLocaters = new SignInLocaters();
	//	AjaxElementLocatorFactory obAjaxElementLocatorFactory = new AjaxElementLocatorFactory(driverr, 10);
	//	PageFactory.initElements(obAjaxElementLocatorFactory, this.SignInLocaters);
		PageFactory.initElements(driverr, this.SignInLocaters);
	}
	
	public void doLogin(String email,String password)
	{
		SignInLocaters.emaillocatorElement.sendKeys(email);
		SignInLocaters.passwordElement.sendKeys(password);
		SignInLocaters.signinbuttonlogoinElement.click();
	}

}
