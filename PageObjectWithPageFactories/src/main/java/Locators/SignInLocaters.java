package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLocaters {
	
	//email
	@FindBy(xpath = "//*[@id=\"signin-loginid\"]")
	public WebElement emaillocatorElement;
	
	//password
	@FindBy(xpath = "//*[@id=\"signin-password\"]")
	public WebElement passwordElement;
	
	//click on sigin button
	@FindBy(xpath = "//*[@id=\"submitButton\"]")
	public WebElement signinbuttonlogoinElement;
	

}
