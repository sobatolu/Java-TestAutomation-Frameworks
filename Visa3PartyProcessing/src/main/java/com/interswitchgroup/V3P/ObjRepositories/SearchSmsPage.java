package com.interswitchgroup.V3P.ObjRepositories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchSmsPage {
	
	public SearchSmsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Transaction Search SMS']")
	public WebElement smsSearch_lnk;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[1]")
	public WebElement trans_startDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[2]")
	public WebElement trans_endDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[1]")
	public WebElement clr_transStartDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[2]")
	public WebElement clr_transEndDate;
	
	@FindBy(css = "input[formControlName=cardAcceptorTerminalID]")
	public WebElement CardAcceptor_terminalId;
	
	@FindBy(css = "input[formControlName=requestMsgType]")
	public WebElement requestMsg_type;
	
	@FindBy(css = "input[formControlName=authorizationIDRespCode]")
	public WebElement AuthId_respCode;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	public WebElement transStatus;
	
	@FindBy(css = "input[formControlName=pan1]")
	public WebElement txt_firstPan;
	
	@FindBy(css = "input[formControlName=pan2]")
	public WebElement txt_lastPan;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	public WebElement sel_transDescrip;
	
	@FindBy(css = "input[formControlName=responseCode]")
	public WebElement resp_code;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[3]")
	public WebElement cpd_startDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnpicker btnpickerenabled'])[4]")
	public WebElement cpd_endDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[3]")
	public WebElement clr_cpdStartDate;
	
	@FindBy(xpath = "(//button[@type='button'][@class='btnclear btnclearenabled'])[4]")
	public WebElement clr_cpdEndDate;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btn_transSearch;
	
	@FindBy(css = ".table.table-striped.table-switch-alternate")
	public WebElement searchResult;
	
	@FindBy(xpath = "//button[.='Action']")
	public WebElement btn_action;
	
	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	public WebElement sel_raisedBy;
	
	@FindBy(xpath = ".//*[@id='toast-container']/div/div/div[2]/div")
	public WebElement msg_box;
	
	public void lnk_base2Search(){
		smsSearch_lnk.click();
	}
	
	public void clearDate(){
		clr_transEndDate.click();
		clr_transStartDate.click();
	}
	
	public void clearFields() throws Exception{
		
		CardAcceptor_terminalId.clear();
		txt_firstPan.clear();
		txt_lastPan.clear();
		requestMsg_type.clear();
		resp_code.clear();
	}
	
	public void Trans_startDate(WebDriver driver){
		trans_startDate.click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("//span[.='1']")).click();
	}
	
	public void Trans_endDate(WebDriver driver){
		trans_endDate.click();
	}
	
	public void CPD_startDate(WebDriver driver){
		cpd_startDate.click();
		driver.findElement(By.xpath("(//button[@type='button'][@class='headerbtn mydpicon icon-mydpleft headerbtnenabled'])[1]")).click();
		driver.findElement(By.xpath("//span[.='1']")).click();
	}
	
	public void CPD_endDate(WebDriver driver){
		cpd_endDate.click();
		driver.findElement(By.xpath("//span[.='1']")).click();
	}
	
	public void CardAcceptor_TermId(String input){
		CardAcceptor_terminalId.clear();
		CardAcceptor_terminalId.sendKeys(input);
	}
	
	public void requestMsg_type(String input){
		requestMsg_type.clear();
		requestMsg_type.sendKeys(input);
	}
	
	public void Transaction_descrip(String value){
		Select description = new Select(sel_transDescrip);
		description.selectByVisibleText(value);
	}
	
	public void Raised_by(String value){
		Select description = new Select(sel_raisedBy);
		description.selectByVisibleText(value);
	}
	
	public void Resp_code(String input){
		resp_code.clear();
		resp_code.sendKeys(input);
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
	
	public int rowCount(){
		List<WebElement> allRows = searchResult.findElements(By.tagName("tr"));
		int row_count = allRows.size();
		return row_count - 1;
	}
	
	public String getMsg(){
		return msg_box.getText();
	}
	

}
