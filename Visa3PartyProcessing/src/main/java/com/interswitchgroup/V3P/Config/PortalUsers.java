package com.interswitchgroup.V3P.Config;

import com.interswitchgroup.V3P.Utilities.Log;

public class PortalUsers {
	
	public String username;
	public String password;
	
	public String UserLogin(String role){
		
		switch (role) {
		
		case "BankUser":
			Log.info("Bank user login");
			username = Constants.bankUser;
			password = Constants.password;
			break;
		case "SwitchUser":
			Log.info("Switch Operator User login");
			username = Constants.switchUser;
			password = Constants.password;
			break;
			
		case "AdminUser":
			Log.info("Admin User login");
			username = Constants.adminUser;
			password = Constants.password;
			break;
		}
		return username + " " + password;
	}

}
