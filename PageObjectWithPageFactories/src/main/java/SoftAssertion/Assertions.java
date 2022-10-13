package SoftAssertion;

import org.testng.asserts.SoftAssert;

import Listeners.Listeners;

public class Assertions {
	
	
	public static SoftAssert softAssert= new SoftAssert();
	
	
      public static void assertInt(int actual ,int expected)
      {
    	      System.out.println("Actual"+actual+" "+expected);
    		  softAssert.assertEquals(actual, expected);
    		  
		
		}
    	  


      }



