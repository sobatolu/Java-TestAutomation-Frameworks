package com.interswitchgroup.V3P.BaseTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.interswitchgroup.V3P.Config.Constants;
import com.interswitchgroup.V3P.ObjRepositories.LoginPage;
import com.interswitchgroup.V3P.Utilities.BrowserFactory;
import com.interswitchgroup.V3P.Utilities.Log;
import com.interswitchgroup.V3P.Utilities.waitUtilities;

public class BaseTest {
	
	public static WebDriver driver;
	public String suiteName, testName;
	BrowserFactory browserFactory = new BrowserFactory();
	waitUtilities wait = new waitUtilities();
	
	@BeforeSuite
	public void SuiteInit(ITestContext context){
		//Start logging
		DOMConfigurator.configure("log4j.xml");
		suiteName = context.getCurrentXmlTest().getSuite().getName();
		Log.startTestCase(suiteName);
		
		
	}
	
	@BeforeTest(alwaysRun = true)
	public void StartTest(ITestContext context){
		testName = context.getName();
		Log.startTestCase(testName);
		
		//Initiate driver, open browser, and navigate to url
		driver = browserFactory.getBrowser("Chrome"); //launch browser
		driver.manage().timeouts().pageLoadTimeout(Constants.Default_Wait_TimeOut, TimeUnit.SECONDS); //wait for page load
		driver.manage().window().maximize(); //maximize browser window
				
		browserFactory.LoadApplication(); //navigate to portal
						
		//re-direct to passport login page
		LoginPage Login = new LoginPage(driver);
		wait.WaitForElement(driver, Login.btn_passportLogin);
		Log.info("Loading Login Page");	
		Login.loadLoginPage();
	}
	
	@AfterTest
	public void endTest(){
	/*	browserFactory.closeAllDriver(); //close browser
*/		Log.endTestCase(testName);
	}
	
	@AfterSuite
	public void SuiteTeardown(){
		Log.endTestCase(suiteName);
	}
}
