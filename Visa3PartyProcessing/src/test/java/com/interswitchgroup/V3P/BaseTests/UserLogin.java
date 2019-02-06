package com.interswitchgroup.V3P.BaseTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.interswitchgroup.V3P.Config.PortalUsers;
import com.interswitchgroup.V3P.UserActions.Login_Action;
import com.interswitchgroup.V3P.UserActions.Portal_Action;
import com.interswitchgroup.V3P.Utilities.Log;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class UserLogin extends BaseTest {
	
	public String userCred;
	public String username;
	public String password;
	public String[] temp;
	
	Login_Action Login = new Login_Action();
	PortalUsers user = new PortalUsers();
	Portal_Action portal = new Portal_Action();
	waitUtilities wait = new waitUtilities();
	
	@Parameters({"userRole"})
	@BeforeTest
	public void TestInit(String userRole){
		
		userCred = user.UserLogin(userRole);
		temp = userCred.split(" ");   
		username = temp[0];   
		password = temp[1];
	}
		
	@Test(priority=1)
	public void SignIn(){
		
		Login.Execute(driver, username, password);
		Log.info(username + " logged in");
	}
	
	@Test(priority=2)
	public void NavigateToApp(){
		Log.info("Navigating to V3P App......");
		wait.WaitForPageLoad(driver);
		portal.ExecuteApp(driver);
	}

}
