package com.interswitchgroup.V3P.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.interswitchgroup.V3P.Config.Constants;

public class waitUtilities {
	
public WebDriverWait wait;
	
	public void WaitForElement(WebDriver driver, WebElement locator) {
		wait = new WebDriverWait(driver, Constants.TimeoutValue);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	public void WaitForEleClickable(WebDriver driver, WebElement locator){
		wait = new WebDriverWait(driver, Constants.TimeoutValue);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
		
	public void WaitForPageLoad(WebDriver driver){
		 ExpectedCondition<Boolean> pageLoad = new ExpectedCondition<Boolean>() {
			 public Boolean apply(WebDriver driver) {
				 return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			}
		 };
		Wait<WebDriver> wait = new WebDriverWait(driver,Constants.Default_Wait_TimeOut);
		try{
			wait.until(pageLoad);
		}catch(Throwable error){
			Log.info("Timeout waiting for Page Load Request to complete.");
		}
	}
	
	public void WaitForLoader(WebDriver driver, String loader){
		By loaderImage = By.xpath(loader);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderImage));
	}
	
	
	public void FluentSelectWait(WebDriver driver, WebElement element){
		
		final Select value = new Select(element);
		new FluentWait<WebDriver>(driver)
        .withTimeout(Constants.TimeoutValue, TimeUnit.SECONDS) //timeout at 30 seconds
        .pollingEvery(10, TimeUnit.MILLISECONDS) //checking every 10 milliseconds
        .ignoring(NoSuchElementException.class)
        .until(new Predicate<WebDriver>() {
        	@Override
            public boolean apply(WebDriver driver) {
                return (value.getOptions().size() > 1);
            }
        });
	}


}
