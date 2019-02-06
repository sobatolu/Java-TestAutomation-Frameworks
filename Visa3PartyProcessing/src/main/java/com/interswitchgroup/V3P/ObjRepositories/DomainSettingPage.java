package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DomainSettingPage {
	

	public DomainSettingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Domain Settings']")
	public WebElement domain_lnk;
	
	@FindBy(tagName = "h3")
	public WebElement pageHeader_txt;
	
	@FindBy(xpath = "//button[@class='btn']")
	public WebElement add_btn;
	
	@FindBy(css = ".table.table-striped.table-switch-alternate")
	public WebElement domains;
	
	@FindBy(xpath = ".//*[@id='addModal']/div/div/div[1]/h4")
	public WebElement domain_modal;
	
	@FindBy(id = "domainId")
	public WebElement domain_sel;
	
	@FindBy(css = "input[formControlName='domainFolderName']")
	public WebElement foldername;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement addDomain_btn;
	
	@FindBy(xpath = "//button[@class='close']")
	public WebElement closeModal;
	
	@FindBy (xpath = ".//*[@id='toast-container']/div/div/div[2]/div")
	public WebElement msgModal;
	
	@FindBy(css = "input[formControlName='email']")
	public WebElement domainEmail;
	
		
	public void lnk_domain(){
		add_btn.click();
	}
	
	public String getPageHeader(){
		return pageHeader_txt.getText();
	}
	
	public String getModalTitle(){
		return domain_modal.getText();
	}
	
	public void navigateToDomain(){
	
		domain_lnk.click();
	}
	
	public void closeModal(){
		closeModal.click();
	}
	
	public void addDomain(){
		addDomain_btn.click();
	}
	
	public void domain_sel(String value){
		Select domain = new Select(domain_sel);
		domain.selectByVisibleText(value);	
	}
	
	public void domainName_txt(String input){
		foldername.clear();
		foldername.sendKeys(input);
	}
	
	public void domainEmail_txt(String input){
		domainEmail.clear();
		domainEmail.sendKeys(input);
	}
	
	public String getMsg(){
		return msgModal.getText();
	}
	
	public String msgModal(){
		return ".//*[@id='toast-container']/div/div/div[2]/div";
	}

}
