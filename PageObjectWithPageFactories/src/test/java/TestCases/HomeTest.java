package TestCases;



import org.apache.xml.security.Init;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Page;
import SoftAssertion.Assertions;
import pages.HomePage;

public class HomeTest {

	
	@BeforeClass
	public void Init()
	{
		Page.initConfiguration();	
	}
	@Test
	public void homeTest()  {

		
		HomePage homePage= new HomePage();
		Assertions.assertInt(homePage.getCountOfTabs(), 7);
	//	Assert.assertEquals(homePage.getCountOfTabs(), 6);
	//	Assertions.assertInt(homePage.getCountOfTabs(), 4);
	//	Assertions.assertInt(homePage.getCountOfTabs(), 6);
		 
	
		homePage.goToFlights().bookAFlight();
		
		

	}
	@AfterClass
	public void tearDown()
	{
		Page.quit();
	}

}
