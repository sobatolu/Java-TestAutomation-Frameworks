package com.interswitchgroup.V3P.SwitchMgt;

import org.testng.annotations.Test;

import com.interswitchgroup.V3P.BaseTests.BaseTest;
import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.UserActions.TransCode_Action;
import com.interswitchgroup.V3P.Utilities.Log;

public class TransactionCode extends BaseTest{
	
	TransCode_Action TC = new TransCode_Action();
	
	@Test
	public void addTC_Successfully(){
		Log.info("Transaction Code Settings.....");
		TC.ExecuteSuccessfully(driver, Constants.TCNum, Constants.TCRNum, Constants.TCDecrip);
	}

}
