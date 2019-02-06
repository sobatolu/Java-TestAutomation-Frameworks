package com.interswitchgroup.V3P.Config;

import java.io.File;

import com.interswitchgroup.V3P.Utilities.Utilities;

public class Constants {
	
	//Portal Links
	public static final String Url = "https://qa.interswitchng.com/portal/";//"https://isw-portal-uat.k9.isw.la/portal/"; 
	
	//Portal Users
	public static final String bankUser = "vbankuser@sharklasers.com";
	public static final String switchUser = "vswitchopps@sharklasers.com";
	public static final String adminUser = "vadminuser@sharklasers.com";
	public static final String password = "password";
	
	//Project library paths
	public static final String FOLDER_Result = "Test-Results";
	public static final String PROP_PROJECT_BASE_DIR = "project.basedir";
	public static final String FOLDER_DRIVER = "src\\test\\resources\\Driver";
	
	public static final String Path_ieDriver = Utilities.getKey(PROP_PROJECT_BASE_DIR) + File.separator + Constants.FOLDER_DRIVER 
			+ File.separator + "IEDriverServer.exe";

	//public static final String Path_chromeDriver = Utilities.getKey(PROP_PROJECT_BASE_DIR) + File.separator + Constants.FOLDER_DRIVER 
	//	+ File.separator + "chromedriver.exe";
	
	public static final String Path_chromeDriver = "C:\\Drivers\\chromedriver.exe";

	public static final String Path_firefox = Utilities.getKey(PROP_PROJECT_BASE_DIR) + File.separator + Constants.FOLDER_DRIVER 
		+ File.separator + "geckodriver.exe";
	
	//Test Defaults
	public static final int Default_Wait_TimeOut = 50;
	public static final int TimeoutValue = 20;
	
	//Base2 search Test Data
	public static final String terminalId = "40264A20";
	public static final String authCode = "539829";
	public static final int firstDigits = 468219;
	public static final int lastDigits = 6412;
	
	//SMS search Test Data
	public static final String cardAcceptor_terminalId = "10701986";
	public static final String requestMsg_type="0200";
	public static final String respCode = "00";
	public static final String transDecrip = "Cash Disbursement";
	public static final int sixthDigits = 418742;
	public static final int fourthdigits = 6494;
	public static final String raisedBy = "System";
	
	//Domain Settings Test Data
	public static final String Dselect = "WEMA Bank";
	public static final String DName = "wema";
	public static final String DEmail = "wema@test.com";
	
	//TC Test Data
	public static final String TCNum = "44";
	public static final String TCRNum = "3";
	public static final String TCDecrip = "TCodeTest";
}
