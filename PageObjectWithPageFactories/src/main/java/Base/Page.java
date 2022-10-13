package Base;



import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.TopNavigation;

public class Page {
	public static WebDriver driverr;
	

	public static WebDriverWait wait;
	public static Actions actions;
	public static TopNavigation topNavigation;
	public static Logger log  = Logger.getLogger("Page");
	
	public static void  initConfiguration()
	{
		PropertyConfigurator.configure("log4j.properties");
		log.setLevel(Level.DEBUG);
		
		if(Constants.browser.equals("chrome"))
		{
			log.info("launching chrome browser");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driverr= new ChromeDriver(options);
			
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driverr= new FirefoxDriver();
		}
		driverr.manage().window().maximize();
		driverr.get(Constants.urll);
		//driverr.manage().deleteAllCookies();
		
		driverr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait= new WebDriverWait(driverr, 5);
		topNavigation = new TopNavigation(driverr);
		
	}
	public static void scroll()
	{
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driverr;
		jsExecutor.executeScript("window.scrollBy(0,200)");
	}
	
	public void click(WebElement element) {
		log.info("clicking on web element");
		log.debug("element click"+element);
		element.click();

	}
	
	public void type(WebElement element, String value)
	{
		element.sendKeys(value);
		log.debug("element typing"+element);
	}
	
	public static void quit()
	{
		
		driverr.quit();
		driverr=null;
	}

}
