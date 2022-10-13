package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	
	@FindBy(xpath="//*[@id=\"uitk-tabs-button-container\"]/li[2]/a")
	public WebElement flightElement;
	
	// book a flight x paths
	@FindBy(xpath="//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")
	public WebElement leavingFrom;
	@FindBy(xpath="//*[@id=\"location-field-leg1-origin\"]")
	public WebElement leavingFrominputboxElement;
	
	@FindBy(xpath="//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li")
	public List<WebElement> leavingFrominputboxlistElement; ;
	
	
	//going to x path

	//public WebElement going
	@FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
	public WebElement goingtoElement;
	
	@FindBy(xpath = "//*[@id=\"location-field-leg1-destination\"]")
	public WebElement goingtoElementinputbox;
	
	@FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li")
	public List<WebElement> goingtolistofelements;
	
	
	//depart date
	@FindBy(xpath = "//*[@id=\"d1-btn\"]")
	public WebElement departdateWebElement;
	
	@FindBy(xpath = "//button[@aria-label='12 May 2021']")
	public WebElement selectdepartdatewebelement;
	//return date
	
	@FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[1]")
	public WebElement clickanywhere;
	@FindBy(xpath = "//*[@id=\"d2-btn\"]")
	public WebElement returndateclick;
	
	@FindBy(xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/button[2]")
	public WebElement selectnextbutton;
	@FindBy(xpath = "//button[@aria-label='16 Jun 2021']")
	public WebElement returndatewWebElement;
	//search button click
	@FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
	public WebElement clicksearchElement;
	
	@FindBy(xpath = "//table[@class='uitk-date-picker-weeks']/tbody/tr/td/button")
	public WebElement datElement;
	
	//list of tabs
	@FindBy(xpath = "//ul[@id='uitk-tabs-button-container']/li")
	public List<WebElement> listoftabElements;
	
}
