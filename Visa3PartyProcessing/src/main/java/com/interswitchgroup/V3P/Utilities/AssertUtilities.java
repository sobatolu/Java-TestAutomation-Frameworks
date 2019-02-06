package com.interswitchgroup.V3P.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AssertUtilities {
	
	public boolean match = false;
	
	public void confirmMsg(WebDriver driver, String message1, String message2){
	
		if (message1.contains(message2)){
			match = true;
		}
			Assert.assertTrue(match);
			Log.info("Text Found: " + message1);
	}
		
	public void verifyTxt(WebDriver driver, String message){
		match = false;
		String pageSource = driver.getPageSource();
		if (pageSource.contains(message)){
			match = true;
		}
		Assert.assertTrue(match);
		Log.info(message + " Found");
	}
	
	public void assertMsg(WebDriver driver, WebElement element, String message){
		String elementMsg = element.getText();
		Assert.assertEquals(message, elementMsg);
		Log.info("Text Found: " + message);
	}
	
	public void verifyRecord(int actual, int expected){
			Assert.assertNotEquals(actual, expected);
			Log.info("Search result returned: " + actual);
		
	}
	
	public void ElementNotPresent(WebDriver driver, WebElement element){
		if (element.isDisplayed()){
			match = true;
			
		}
		else{match = false;}
		
		Assert.assertFalse(match);
		Log.info("element not present");
	}
	
}
