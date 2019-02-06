package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.MonitoringPage;
import com.interswitchgroup.V3P.Utilities.AssertUtilities;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class Monitoring_Action {
	
	waitUtilities wait = new waitUtilities();
	AssertUtilities assertTxt = new AssertUtilities();
	
	public void Execute(WebDriver driver){
		MonitoringPage fileMonitor = new MonitoringPage(driver);
		
		fileMonitor.lnk_monitoring();
		wait.WaitForPageLoad(driver);
		
		assertTxt.confirmMsg(driver, fileMonitor.getPageHeader(), "Processed Files");
		fileMonitor.getFileContents();
		wait.WaitForElement(driver, fileMonitor.fileContent);
		wait.WaitForLoader(driver, fileMonitor.loader());
		assertTxt.confirmMsg(driver, fileMonitor.getPageHeader(), "File Name: sample.TXT");
	}

}
