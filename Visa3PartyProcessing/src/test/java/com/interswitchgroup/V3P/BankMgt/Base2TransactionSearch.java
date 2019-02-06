package com.interswitchgroup.V3P.BankMgt;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.interswitchgroup.V3P.BaseTests.BaseTest;
import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.UserActions.SearchBase2_Action;
import com.interswitchgroup.V3P.Utilities.Log;

public class Base2TransactionSearch extends BaseTest  {
	
	SearchBase2_Action TransSearch = new SearchBase2_Action();
	
	@BeforeTest
	public void TestInit(){
		if(TransSearch.getDriver() ==null){
			TransSearch.setDriver(driver);
		}
		
	}
	
	@Test(priority = 2)
	public void SearchbyTerminalId() throws Exception{
		
		Log.info("Base2: Searching by terminal id.....");
		TransSearch.ExecuteSearchByTerminalId(Constants.terminalId);
	}
	
	@Test(priority = 3)
	public void SearchbyAuthCode() throws Exception{
		Log.info("Base2: Searching by authcode.....");
		TransSearch.ExecuteSearchByauthCode(Constants.authCode);
	}
	
	@Test(priority=4)
	public void SearchbyfirstPan() throws Exception{
		Log.info("Base2: Searching by first six digits.....");
		TransSearch.ExecuteSearchByfirstdigit(Constants.firstDigits);
		
	}
	
	@Test(priority=5)
	public void SearchbylastPan() throws Exception{
		Log.info("Base2: Searching by last four digits.....");
		TransSearch.ExecuteSearchBylastdigit(Constants.lastDigits);
		
	}
	
	@Test(priority=6)
	public void SearchbyPan() throws Exception{
		Log.info("Base2: Searching by pan.....");
		TransSearch.ExecuteSearchByPan(Constants.firstDigits, Constants.lastDigits);
		
	}
	
	@Test(priority=7)
	public void SearchbyTransStatus() throws Exception{
		Log.info("Base2: Searching by transaction status.....");
		TransSearch.ExecuteSearchBytransStatus("ORIGINAL TRANSACTION");
	}
	
	@Test(priority=1)
	public void SearchbyDate() throws Exception{
		Log.info("Base2: Searching by date.....");
		TransSearch.ExecuteSearchByDate(driver);
	}
	
	@Test(priority = 8)
	public void SearchbyRaisedBy() throws Exception{
		Log.info("Base2: Filter by Raised By....");
		TransSearch.ExecuteSearchByRaisedBy(Constants.raisedBy);
	}
	
	@Test(priority = 9)
	public void SearchbyNoCriteria() throws Exception{
		Log.info("Base2: No criteria selected");
		TransSearch.ExecuteSearchByNoCriteria();
	}
	
}
