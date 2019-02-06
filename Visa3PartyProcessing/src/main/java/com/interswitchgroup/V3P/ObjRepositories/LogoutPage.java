package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public LogoutPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='menu-list']/a/span[1]")
	public WebElement menu_list;
	
	@FindBy(id = "logout_link")
	public WebElement btn_logout;
	
	public void menuList(WebDriver driver){
		//menu_list.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", menu_list);
	}
	
	public void Logout(WebDriver driver){
		//btn_logout.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", btn_logout);
	}
	
}
