package com.interswitchgroup.V3P.SwitchMgt;

import org.testng.annotations.Test;

import com.interswitchgroup.V3P.BaseTests.BaseTest;
import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.UserActions.DomainSetting_Action;
import com.interswitchgroup.V3P.Utilities.Log;

public class DomainSettings extends BaseTest{
	
	DomainSetting_Action domain = new DomainSetting_Action();
	
	@Test
	public void AddDomain() throws Exception{
		Log.info("Domain Settings.....");
		domain.Execute(driver, Constants.Dselect,Constants.DName, Constants.DEmail);
	}

}
