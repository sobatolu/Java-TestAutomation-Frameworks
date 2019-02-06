package com.interswitchgroup.V3P.ObjRepositories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.interswitchgroup.V3P.Config.Constants;

public class MonitoringPage {
	
	public MonitoringPage(WebDriver driver){
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.TimeoutValue), this);
	}
	
	@FindBy(linkText = "File Monitoring")
	public WebElement monitoring_lnk;
	
	@FindBy(tagName = "h3")
	public WebElement pageHeader_txt;
	
	@FindBy(linkText = "COMPLETED_WITH_ERROR")
	public WebElement sampleFile;
	
	@FindBy(css = ".table.table-striped.table-switch-alternate")
	public WebElement fileContent;
	
	@FindBy(xpath="//div[@class='form-group']/div[@class='loading']")
	public WebElement loader;
	
	public void lnk_monitoring(){
		monitoring_lnk.click();
	}
	
	public String getPageHeader(){
		return pageHeader_txt.getText();
	}
	
	public void getFileContents(){
		sampleFile.click();
	}
	
	public int rowCount(){
		
		List<WebElement> allRows = fileContent.findElements(By.tagName("tr"));
		int row_count = allRows.size();
		return row_count - 1;

	}
	
	public String loader(){
		return "//div[@class='form-group']/div[@class='loading']";
		
	}
	
		
}
