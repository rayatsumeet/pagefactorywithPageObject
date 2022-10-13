package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuLocaters {
	
	@FindBy(xpath = "//button[.='Sign in']")
	public WebElement signinlinklocatorElement;
	
	//sign in button
	@FindBy(xpath = "//a[.='Sign in']")
	public WebElement siginbuttonElement;

}
