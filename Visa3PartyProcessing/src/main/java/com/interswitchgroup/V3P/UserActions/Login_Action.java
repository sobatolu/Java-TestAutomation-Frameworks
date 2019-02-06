package com.interswitchgroup.V3P.UserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.ObjRepositories.LoginPage;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class Login_Action {
	
	waitUtilities wait = new waitUtilities();
	
	public void Execute(WebDriver driver, String username, String password){
		
		LoginPage Login = new LoginPage(driver);
		
		wait.WaitForElement(driver, Login.btn_login);
		Login.getuserName(username);
		Login.getPassword(password);
		Login.PortalLogin();
		driver.manage().timeouts().pageLoadTimeout(Constants.Default_Wait_TimeOut, TimeUnit.SECONDS);
	}

}
