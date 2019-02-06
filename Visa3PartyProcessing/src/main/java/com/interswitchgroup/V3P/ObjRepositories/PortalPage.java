package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage {
	
	public PortalPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[.='VISA TC PROCESSOR']")
	public WebElement app_lnk;

	@FindBy(linkText ="Return to Homepage")
	public WebElement btn_homepage;
	
	public void NavigateToApp(){
		app_lnk.click();
	}
	
	public boolean isHomepagebtnDisplayed(WebDriver driver){
		try
		{
			if (driver.findElement(By.linkText("Return to Homepage")) != null)
			{
				return true;
			}
		}catch(Exception e){
			 return false;
		}
		return false;
	
	}
	
	public void Homepage(WebDriver driver){
		btn_homepage.click();
	}

}
