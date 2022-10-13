package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Page;

public class SignInTest {
	@BeforeClass
	public void Init()
	{
		Page.initConfiguration();	
	}
	@Test
	public void signInTest()
	{

		Page.topNavigation.goToSignin().doLogin("sumeetrayat11@gmail.com", "avv");
	
		
	}
	
	@AfterClass
	public void tearDown()
	{
		Page.quit();
	}

}
