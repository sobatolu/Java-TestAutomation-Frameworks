package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.PortalPage;
import com.interswitchgroup.V3P.Utilities.Log;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class Portal_Action {
	
	waitUtilities wait = new waitUtilities();
		
	public void ExecuteApp(WebDriver driver){
		PortalPage portal = new PortalPage(driver);
		
		if (portal.isHomepagebtnDisplayed(driver)){
			portal.Homepage(driver);
		}
		
		wait.WaitForElement(driver, portal.app_lnk);
		portal.NavigateToApp();
		Log.info("Navigated to app successfully");
	}

}
