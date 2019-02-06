package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.LogoutPage;
import com.interswitchgroup.V3P.Utilities.Log;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class Logout_Action {
		
	waitUtilities wait = new waitUtilities();
	
	public void ExecuteLogout(WebDriver driver){
		
		LogoutPage logout = new LogoutPage(driver);
		
		wait.WaitForEleClickable(driver, logout.menu_list);
		logout.menuList(driver);
		
		wait.WaitForElement(driver, logout.btn_logout);
		logout.Logout(driver);
		Log.info("Logged out successfully");
	}

}
