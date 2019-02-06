package com.interswitchgroup.V3P.BankMgt;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.interswitchgroup.V3P.BaseTests.BaseTest;
import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.UserActions.SearchSMS_Action;
import com.interswitchgroup.V3P.Utilities.Log;

public class smsTransactionSearch extends BaseTest {
	
	SearchSMS_Action TransSearch = new SearchSMS_Action();
	
	@BeforeTest
	public void TestInit(){
		Log.info("SMS: Searching start");
		if(TransSearch.getDriver() ==null){
			TransSearch.setDriver(driver);
		}
		
	}
	
	@Test(priority = 2)
	public void SearchbyTerminalId() throws Exception{
		
		Log.info("SMS: Searching by card acceptor terminal id.....");
		TransSearch.ExecuteSearchByCardAcceptorTerminalId(Constants.cardAcceptor_terminalId);
	}
	
	@Test(priority = 3)
	public void SearchbyRequestMsgType() throws Exception{
		Log.info("SMS: Searching by request message type.....");
		TransSearch.ExecuteSearchByRequestMsgType(Constants.requestMsg_type);
	}
	
	@Test(priority = 4)
	public void SearchbyFirstPan() throws Exception{
		Log.info("SMS: Searching by first six digits.....");
		TransSearch.ExecuteSearchByfirstdigit(Constants.sixthDigits);
	}
	
	@Test(priority = 5)
	public void SearchbyLastPan() throws Exception{
		Log.info("SMS: Searching by last four digits.....");
		TransSearch.ExecuteSearchBylastdigit(Constants.fourthdigits);
	}
	
	@Test(priority = 6)
	public void SearchbyPan() throws Exception{
		Log.info("SMS: Searching by masked pan.....");
		TransSearch.ExecuteSearchByPan(Constants.sixthDigits, Constants.fourthdigits);
	}
	
	@Test(priority = 8)
	public void SearchbyCPDDate() throws Exception{
		Log.info("SMS: Searching by CPD Date....");
		TransSearch.ExecuteSearchByCPD(driver);
	}
	
	@Test(priority = 7)
	public void SearchbyTransDecription() throws Exception{
		Log.info("SMS: Searching by Transaction Description....");
		TransSearch.ExecuteSearchByTransDescription(Constants.transDecrip);
	}
	 
	@Test(priority = 9)
	public void SearchbyRaisedBy() throws Exception{
		Log.info("SMS: Filter by Raised By....");
		TransSearch.ExecuteSearchByRaisedBy(Constants.raisedBy);
	}
	
	@Test(priority = 1)
	public void SearchbyTransDate() throws Exception{
		Log.info("SMS: Searching by local transaction date.....");
		TransSearch.ExecuteSearchByTransDate(driver);
	}
	
	@Test(priority = 10)
	public void SearchbyNoCriteria() throws Exception{
		Log.info("SMS: No criteria selected");
		TransSearch.ExecuteSearchByNoCriteria();
	}
}
