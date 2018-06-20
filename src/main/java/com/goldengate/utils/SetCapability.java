package com.goldengate.utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import pageobjects.login.LoginScreen;

public class SetCapability {
	
	 public static AndroidDriver driver;

	 Logger log = Logger.getLogger("devpinoyLogger");
	 
	 
	 private static SetCapability instance = new SetCapability();

	    public static  SetCapability getInstance() {
	        return instance;
	    } 
	 
	 
	 
	 public void setUp() throws Throwable { 
		 
	  log.debug("setting up test environment");
	  // Created object of DesiredCapabilities class.
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	   capabilities.setCapability("noReset", "false");
	  
	   capabilities.setCapability("deviceName", "9LNVAMM7WSMZT4AY");
	 

	  // Set BROWSER_NAME desired capability. It's Android in our case here.
	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

	  // Set android VERSION desired capability. Set your mobile device's OS version.
	  capabilities.setCapability(CapabilityType.VERSION, "5.1.1");

	  // Set android platformName desired capability. It's Android in our case here.
	  capabilities.setCapability("platformName", "Android");
	  
	  
	  capabilities.setCapability("app", "/home/puneetkumar/Backup/gg_v3.5.0_staging_8.apk");

	  capabilities.setCapability("appPackage", "com.paytm.goldengate.debug");
	  
	  capabilities.setCapability("appActivity", "com.paytm.goldengate.main.activities.SplashActivity");

	  // Created object of RemoteWebDriver will all set capabilities.
	  // Set appium server address and port number in URL string.
	  // It will launch calculator app in android device.
	    driver =  new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    

	 }
	
	

public void closeDriver() {
driver.quit();
}
}























