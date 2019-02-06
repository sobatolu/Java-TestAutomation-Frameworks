package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.MenuPage;
import com.interswitchgroup.V3P.ObjRepositories.SearchSmsPage;
import com.interswitchgroup.V3P.Utilities.AssertUtilities;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class SearchSMS_Action {
	

	private WebDriver driver;
	SearchSmsPage sms = null;
	public WebDriver getDriver(){
		
		return driver;
	}
	public void setDriver(WebDriver driver){
		this.driver = driver;
		sms = new  SearchSmsPage(driver);
	}
		
	waitUtilities wait = new waitUtilities();
	AssertUtilities assertTxt = new AssertUtilities();
	
	public void ExecuteSearchByCardAcceptorTerminalId(String terminalId) throws Exception{

		if(sms!=null){
			
			sms.clearDate();
			sms.CardAcceptor_TermId(terminalId);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchByRequestMsgType(String MsgType) throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			
			sms.requestMsg_type(MsgType);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
		
	}
	
	public void ExecuteSearchByRespCode(String respCode) throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.Resp_code(respCode);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
		
	}
	
	public void ExecuteSearchByTransDescription(String description) throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.Transaction_descrip(description);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
		
	}
	
	public void ExecuteSearchByRaisedBy(String name) throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.Raised_by(name);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
		
	}
	
	public void ExecuteSearchByNoCriteria() throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			assertTxt.confirmMsg(driver, sms.getMsg(), "Please select a criteria!!!");
		}
		
	}
	
	public void ExecuteSearchByCPD(WebDriver driver) throws Exception{
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.CPD_startDate(driver);
			sms.CPD_endDate(driver);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
		
	}
	
	public void ExecuteSearchByTransDate(WebDriver driver) throws Exception{
		if(sms!=null){
			MenuPage menu = new MenuPage(driver);
			menu.transSearch();
			wait.WaitForElement(driver, menu.sms_lnk);
			menu.sms();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			sms.clearFields();
			
			sms.Trans_startDate(driver);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
			
		}
		
	}
	
	public void ExecuteSearchByPan(int firstdigits, int lastdigits) throws Exception{
		
		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.txt_sixPan(firstdigits);
			sms.txt_fourPan(lastdigits);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchByfirstdigit( int firstdigits) throws Exception{

		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.txt_sixPan(firstdigits);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchBylastdigit( int lastdigits) throws Exception{

		if(sms!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			
			sms.clearDate();
			sms.txt_fourPan(lastdigits);
			sms.btn_transSearch();
			
			wait.WaitForEleClickable(driver, sms.btn_transSearch);
			//assertTxt.verifyRecord(sms.rowCount(), 0);
		}
	}
	

}
