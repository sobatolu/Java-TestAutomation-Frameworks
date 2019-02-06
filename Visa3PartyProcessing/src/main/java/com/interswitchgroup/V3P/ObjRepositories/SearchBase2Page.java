package com.interswitchgroup.V3P.ObjRepositories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SearchBase2Page {
	
	public SearchBase2Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Transaction Search Base 2']")
	public WebElement base2Search_lnk;
		
	//@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled btnleftborder'])[1]")
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[1]")
	public WebElement txt_startDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[2]")
	public WebElement txt_endDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[1]")
	public WebElement clr_startDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[2]")
	public WebElement clr_endDate;
	
	@FindBy(css = "input[formControlName=terminalId]")
	public WebElement txt_terminalId;
	
	@FindBy(css = "input[formControlName=authCode]")
	public WebElement txt_authCode;
	
	@FindBy(xpath = "//div/div[2]/div[2]/div/select")
	public WebElement sel_transStatus;
	
	@FindBy(css = "input[formControlName=maskedPan1]")
	public WebElement txt_firstPan;
	
	@FindBy(css = "input[formControlName=maskedPan2]")
	public WebElement txt_lastPan;
	
	@FindBy(css=".btn.btn-default.form-control.ladda-button")
	public WebElement btn_transSearch;
	
	@FindBy(css = ".table.table-striped.table-switch-alternate")
	public WebElement searchResult;
	
	@FindBy(xpath = ".fa.fa-file-excel-o")
	public WebElement btn_action;
	
	@FindBy(xpath = "//div/div[2]/div[1]/div/select")
	public WebElement sel_raisedBy;
	
	@FindBy(xpath = ".//*[@id='toast-container']/div/div/div[2]/div")
	public WebElement msg_box;
	
	public void lnk_base2Search(){
		base2Search_lnk.click();
	}
	
	public void clearDate(){
		clr_endDate.click();
		clr_startDate.click();
	}
	
	public void clearFields() throws Exception{
	
		txt_terminalId.clear();	
		txt_authCode.clear();
		txt_firstPan.clear();
		txt_lastPan.clear();
	}
	
	public void txt_startDate(WebDriver driver){
		txt_startDate.click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("//span[.='1']")).click();
		
		
	}
	
	public void txt_endDate(String input){
		txt_endDate.click();
	}
	
	public void txt_terminalId(String input){
		txt_terminalId.clear();
		txt_terminalId.sendKeys(input);
	}
	
	public void txt_authCode(String input){
		txt_authCode.clear();
		txt_authCode.sendKeys(input);
	}
	
	public void sel_transStatus(String value){
		Select status = new Select(sel_transStatus);
		status.selectByVisibleText(value);
	}
	
	public void txt_sixPan(int input){
		txt_firstPan.clear();
		txt_firstPan.sendKeys(String.valueOf(input));
	}
	
	public void txt_fourPan(int input){
		txt_lastPan.clear();
		txt_lastPan.sendKeys(String.valueOf(input));
	}
	
	public void btn_transSearch(){
		btn_transSearch.submit();
	}
	
	public void Raised_by(String value){
		Select description = new Select(sel_raisedBy);
		description.selectByVisibleText(value);
	}
	
	public String getMsg(){
		return msg_box.getText();
	}
	
	
	public int rowCount(){
				
		List<WebElement> allRows = searchResult.findElements(By.tagName("tr"));
		int row_count = allRows.size();
		return row_count - 1;

	}
	
	

}
