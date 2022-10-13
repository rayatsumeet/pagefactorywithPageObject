package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Locators.TopMenuLocaters;

public class TopNavigation {
	WebDriver driver;
	public TopMenuLocaters toplocator;
	public TopNavigation(WebDriver driverr)
	{
		this.driver = driverr;
		this.toplocator = new TopMenuLocaters();
	//	AjaxElementLocatorFactory obAjaxElementLocatorFactory = new AjaxElementLocatorFactory(driverr, 10);
	//	PageFactory.initElements(obAjaxElementLocatorFactory, this.toplocator);
		PageFactory.initElements(driver, this.toplocator);
		
	}
	
	public SignInpage goToSignin()
	{
		toplocator.signinlinklocatorElement.click();
		
		toplocator.siginbuttonElement.click();
		return new SignInpage();
		
	}
	
	public void goToCreateAccount()
	{
		
	}
	
	public void goToSupport()
	{
		
		
		
	}
	
	public void goToTrips() {
		
	}

}
