package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Page;
import Locators.HomePageLocators;
import net.bytebuddy.asm.Advice.This;

public class HomePage extends Page{
	
	public HomePageLocators homePageLocators;
	public HomePage()
	{
		this.homePageLocators= new HomePageLocators();
	//	AjaxElementLocatorFactory obAjaxElementLocatorFactory = new AjaxElementLocatorFactory(driverr, 20);
	//	PageFactory.initElements(obAjaxElementLocatorFactory, this.homePageLocators);
		PageFactory.initElements(driverr,  this.homePageLocators);
		
		
	}
	
	
	public void goToStays()
	{
		
	}
	
	
	public HomePage goToFlights()
	{
	//homePageLocators.flightElement.click();
	click(homePageLocators.flightElement);
	return this;
	}

	public void goToCars()
	{
		
	}

	public void goToPackages()
	{
		
	}
	
	public int  getCountOfTabs()
	{
		return homePageLocators.listoftabElements.size();
	}
	public void bookAFlight() 
	{
		homePageLocators.leavingFrom.click();
		homePageLocators.leavingFrominputboxElement.sendKeys("delhi");
		
	 int size=    homePageLocators.leavingFrominputboxlistElement.size();
	 System.out.println(size);
	 for(int i=0;i<=size-1;i++)
	 {
		 homePageLocators.leavingFrominputboxElement.sendKeys(Keys.DOWN);
		
		 if(homePageLocators.leavingFrominputboxlistElement.get(i).getText().contains("Binghamton (BGM - Greater Binghamton)"))
		 {
			 System.out.println(homePageLocators.leavingFrominputboxlistElement.get(i).getText());
			 homePageLocators.leavingFrominputboxlistElement.get(i).click();
			
			// click( homePageLocators.leavingFrominputboxlistElement.get(i));
			
			 break;
		 }
	 }
	 
	 //filling goingto
	 
	 homePageLocators.goingtoElement.click();
	 homePageLocators.goingtoElementinputbox.sendKeys("dubai");
	int size1=  homePageLocators.goingtolistofelements.size();
	 
	 for(int i=0;i<=size1-1;i++)
	 {
		 homePageLocators.goingtoElementinputbox.sendKeys(Keys.DOWN);
		
		 if(homePageLocators.goingtolistofelements.get(i).getText().contains("Dourados (DOU - Francisco de Matos Pereira)"))
		 {
			 homePageLocators.goingtolistofelements.get(i).click();
			 break;
		 }
	 }
	 
	 //enring Depart date
	 homePageLocators.departdateWebElement.click();
	 homePageLocators.selectdepartdatewebelement.click();
	
	
	 //Returning date
	 homePageLocators.clickanywhere.click();
     homePageLocators.returndateclick.click();
//	 homePageLocators.selectnextbutton.click();
	 homePageLocators.returndatewWebElement.click();
	 homePageLocators.clickanywhere.click();
	 //click search
	 homePageLocators.clicksearchElement.click();	 
		
	}
	
	


}
