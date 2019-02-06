package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.MenuPage;
import com.interswitchgroup.V3P.ObjRepositories.TransCodePage;
import com.interswitchgroup.V3P.Utilities.AssertUtilities;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class TransCode_Action {
	
	waitUtilities wait = new waitUtilities();
	AssertUtilities assertTxt = new AssertUtilities();
	
	public void ExecuteSuccessfully(WebDriver driver, String TCnum, String TCRnum, String descrip){
		TransCodePage TC = new TransCodePage(driver);
		MenuPage menu = new MenuPage(driver);
				
		wait.WaitForElement(driver, menu.settings);
		menu.settings();
		wait.WaitForElement(driver, menu.transCode);
		menu.TransCode();
		
		wait.WaitForPageLoad(driver);
		assertTxt.confirmMsg(driver, TC.getPageHeader(), "Transaction Code category");
		
		TC.addTCCategory(driver);
		wait.WaitForElement(driver, TC.transCode_modal);
		
		wait.FluentSelectWait(driver, TC.TC_number);
		TC.TCNum_sel(TCnum);
		TC.transDescrip(descrip);
		wait.FluentSelectWait(driver, TC.TCR_number);
		TC.TCRNum_sel(TCRnum);
		TC.FieldDependant_chk();
		TC.addTransCode();
		
		TC.closeModal();
		wait.WaitForLoader(driver, TC.loader());
		assertTxt.verifyTxt(driver, "TCODETEST");
		
		
	}
	
	public void ExecuteDuplicate(){
		
	}

}
