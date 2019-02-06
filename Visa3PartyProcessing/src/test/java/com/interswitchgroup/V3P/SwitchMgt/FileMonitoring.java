package com.interswitchgroup.V3P.SwitchMgt;

import org.testng.annotations.Test;

import com.interswitchgroup.V3P.BaseTests.BaseTest;
import com.interswitchgroup.V3P.UserActions.Monitoring_Action;
import com.interswitchgroup.V3P.Utilities.Log;

public class FileMonitoring extends BaseTest {
	
	Monitoring_Action monitor = new Monitoring_Action();
	
	@Test
	public void monitorFile(){
		Log.info("File Monitoring.....");
		monitor.Execute(driver);
	}

}
