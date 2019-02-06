package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	public MenuPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Dashboard")
	public WebElement dashboard;
	
	@FindBy(linkText = "File Monitoring")
	public WebElement monitor;
	
	@FindBy(linkText = "Transcode Settings")
	public WebElement transCode;
	
	@FindBy(linkText = "Transaction search")
	public WebElement transSearch;
	
	@FindBy(linkText = "Base 2")
	public WebElement base2_lnk;
	
	@FindBy(linkText = "SMS")
	public WebElement sms_lnk;
	
	@FindBy(linkText = "Settings")
	public WebElement settings;
	
	@FindBy(linkText = "Domain Details")
	public WebElement domaindetails;
	
	public void dashboard(){
		dashboard.click();
	}
	
	public void transSearch(){
		transSearch.click();
	}
	
	public void fileMonitoring(){
		monitor.click();
	}
	
	public void TransCode(){
		transCode.click();
	}
	
	public void base2(){
		base2_lnk.click();
	}
	
	public void sms(){
		sms_lnk.click();
	}

	public void settings(){
		settings.click();
	}
	
	public void domain(){
		domaindetails.click();
	}
}
