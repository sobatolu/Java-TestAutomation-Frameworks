package com.interswitchgroup.V3P.BaseTests;

import org.testng.annotations.Test;

import com.interswitchgroup.V3P.UserActions.Logout_Action;

public class UserLogout extends BaseTest {
	Logout_Action logout = new Logout_Action();
		
	@Test
	public void Logout(){
		
		logout.ExecuteLogout(driver);
	}	

}
