package com.interswitchgroup.V3P.UserActions;

import org.openqa.selenium.WebDriver;

import com.interswitchgroup.V3P.ObjRepositories.SearchBase2Page;
import com.interswitchgroup.V3P.Utilities.AssertUtilities;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class SearchBase2_Action{
	
	private WebDriver driver;
	SearchBase2Page base2 = null;
	public WebDriver getDriver(){
		
		return driver;
	}
	public void setDriver(WebDriver driver){
		this.driver = driver;
		base2 = new  SearchBase2Page(driver);
	}
	
	waitUtilities wait = new waitUtilities();
	AssertUtilities assertTxt = new AssertUtilities();

		
	public void ExecuteSearchByTerminalId(String terminalId) throws Exception{

		if(base2!=null){
						
			base2.clearDate();
			base2.txt_terminalId(terminalId);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchByauthCode(String authCode) throws Exception{
		if(base2!=null){
			base2.clearFields();
			base2.txt_authCode(authCode);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchByPan(int firstdigits, int lastdigits) throws Exception{
		
		if(base2!=null){
			base2.clearFields();
			base2.txt_sixPan(firstdigits);
			base2.txt_fourPan(lastdigits);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchByfirstdigit( int firstdigits) throws Exception{

		if(base2!=null){
			base2.clearFields();
			base2.txt_sixPan(firstdigits);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchBylastdigit( int lastdigits) throws Exception{

		if(base2!=null){
			base2.clearFields();
			base2.txt_fourPan(lastdigits);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		}
	}
	
	public void ExecuteSearchBytransStatus(String transStatus) throws Exception{
		if(base2!=null){
			base2.clearFields();
			base2.sel_transStatus(transStatus);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyTxt(driver, "ORIGINAL TRANSACTION");
			
		}
	}
	
	public void ExecuteSearchByRaisedBy(String name) throws Exception{
		if(base2!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			
			base2.clearDate();
			base2.clearFields();
			base2.Raised_by(name);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.confirmMsg(driver, base2.getMsg(), "Please select a criteria!!!");
		}
		
	}
	
	public void ExecuteSearchByNoCriteria() throws Exception{
		if(base2!=null){
			driver.navigate().refresh();
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			
			base2.clearDate();
			base2.clearFields();
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			assertTxt.confirmMsg(driver, base2.getMsg(), "Please select a criteria!!!");
		}
		
	}
	
	public void ExecuteSearchByDate(WebDriver driver) throws Exception{
		if(base2!=null){
			base2.lnk_base2Search();
			wait.WaitForPageLoad(driver);
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			
			base2.txt_startDate(driver);
			base2.btn_transSearch();
			
			wait.WaitForEleClickable(driver, base2.btn_transSearch);
			//assertTxt.verifyRecord(base2.rowCount(), 0);
		
		}
	}


}
