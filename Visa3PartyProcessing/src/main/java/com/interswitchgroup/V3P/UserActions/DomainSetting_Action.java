package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.DomainSettingPage;
import com.interswitchgroup.V3P.ObjRepositories.MenuPage;
import com.interswitchgroup.V3P.Utilities.AssertUtilities;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class DomainSetting_Action {
	
	waitUtilities wait = new waitUtilities();
	AssertUtilities assertTxt = new AssertUtilities();
	
	public void Execute(WebDriver driver, String value, String folderName, String domainEmail) throws Exception{
		DomainSettingPage domain = new DomainSettingPage(driver);
		MenuPage menu = new MenuPage(driver);
		
		wait.WaitForElement(driver, menu.settings);
		menu.settings();
		wait.WaitForElement(driver, menu.domaindetails);
		menu.domain();;
		/*menu.dashboard();
		wait.WaitForElement(driver, domain.domain_lnk);
		domain.navigateToDomain();*/
		
		wait.WaitForElement(driver, domain.add_btn);
		Thread.sleep(5000);
		domain.lnk_domain();
		
		wait.WaitForElement(driver, domain.domain_modal);
		wait.FluentSelectWait(driver, domain.domain_sel);
		domain.domain_sel(value);
		domain.domainName_txt(folderName);
		domain.domainEmail_txt(domainEmail);
		domain.addDomain();
		
		wait.WaitForElement(driver, domain.msgModal);
		assertTxt.confirmMsg(driver, domain.getMsg(), "Added successfully");
		
		domain.closeModal();
		wait.WaitForLoader(driver, domain.msgModal());
		assertTxt.ElementNotPresent(driver, domain.domain_modal);
	}
		

}
