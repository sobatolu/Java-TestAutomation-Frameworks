package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransCodePage {
	
	public TransCodePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "h3")
	public WebElement pageHeader_txt;
	
	@FindBy(xpath = "//button[@class='btn']")
	public WebElement add_btn;
	
	@FindBy(tagName = "h4")
	public WebElement transCode_modal;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	public WebElement TC_number;
	
	@FindBy(css = "input[formControlName='transdescription']")
	public WebElement TC_descrip;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	public WebElement TCR_number;
	
	@FindBy(xpath = "//div[2]/div/div[2]/div/trans-code/div[3]/div/div/div[2]/form/div[4]/label")
	public WebElement dependency_chk;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement addTC_btn;
	
	@FindBy(xpath = "//button[@class='close']")
	public WebElement closeModal;
	
	@FindBy(css = ".table.table-striped.table-switch-alternate")
	public WebElement tableRows;
		
	public String getPageHeader(){
		return pageHeader_txt.getText();
	}
	
	public void addTCCategory(WebDriver driver){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", add_btn);
	}
	
	public void TCNum_sel(String value){
		Select TCNum = new Select(TC_number);
		TCNum.selectByVisibleText(value);	
	}
	
	public void TCRNum_sel(String value){
		Select TCRNum = new Select(TCR_number);
		TCRNum.selectByVisibleText(value);	
	}
	
	public void transDescrip(String input){
		TC_descrip.clear();
		TC_descrip.sendKeys(input);
	}
	
	public void FieldDependant_chk(){
		if(!dependency_chk.isSelected()){
			dependency_chk.click();
		}
	}
	
	public void addTransCode(){
		addTC_btn.click();
	}
	
	public void closeModal(){
		closeModal.click();
	}
	
	public String loader(){
		return "//div[@class='form-group']/div[@class='loading']";
		
	}
	
	
	

}
