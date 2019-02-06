package com.interswitchgroup.V3P.Utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.interswitchgroup.V3P.Config.Constants;

public class BrowserFactory {
	
	public WebDriver driver;
	private Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	
	public BrowserFactory() {
	}
	 
	public WebDriver getBrowser(String browserName) {
		driver = null;
 
		switch (browserName) {
		case "Mozilla":
			driver = drivers.get("Mozilla");
			if (driver == null) {
				DesiredCapabilities dc = new DesiredCapabilities();
			    System.setProperty("webdriver.gecko.driver", Constants.Path_firefox);
				driver = new FirefoxDriver(dc);
				drivers.put("Mozilla", driver);
				Log.info("Mozilla browser started");
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver", Constants.Path_ieDriver);
				driver = new InternetExplorerDriver();
				drivers.put("IE", driver);
				Log.info("Internet Explorer browser started");
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", Constants.Path_chromeDriver);
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
				Log.info("Chrome browser started");
			}
			break;
		}
		return driver;
	}
	
	public void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			Log.info("Test Completed and Browser Closed");	
		}
	}
	
	public void tearDownDrivers(){
		for (String key : drivers.keySet()) {
			drivers.get(key).quit();
			Log.info("Driver teardown successfully");	
		}
		
	}
	
	public void LoadApplication(){
		driver.navigate().to(Constants.Url);
		driver.manage().timeouts().pageLoadTimeout(Constants.Default_Wait_TimeOut, TimeUnit.SECONDS); //wait for page load
		Log.info("Browsed to URL: " + Constants.Url );
	}

}
