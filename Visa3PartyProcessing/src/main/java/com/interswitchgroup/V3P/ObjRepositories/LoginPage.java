package com.interswitchgroup.V3P.ObjRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Login with Passport")
	public WebElement btn_passportLogin;
	
	@FindBy(id="username")
	public WebElement txt_username;
	
	@FindBy(id="password")
	public WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btn_login;
	
	
	public void loadLoginPage(){
		btn_passportLogin.click();
	}
	
	public void getuserName(String input){
		txt_username.clear();
		txt_username.sendKeys(input);
	}
	
	public void getPassword(String input){
		txt_password.clear();
		txt_password.sendKeys(input);
	}
	
	public void PortalLogin(){
		btn_login.submit();
	}
	

}
