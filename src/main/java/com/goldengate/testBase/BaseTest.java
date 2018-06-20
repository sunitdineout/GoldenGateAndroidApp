package com.goldengate.testBase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.goldengate.utils.SetCapability;


public class BaseTest {
	
	
	@BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws Throwable {
        System.out.println("--------------------- INSIDE BEFORE SUITE ---------------------");
        SetCapability.getInstance().setUp();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() throws Exception {
        System.out.println("--------------------- INSIDE AFTER SUITE ---------------------");
        SetCapability.getInstance().closeDriver();        
    }
	
}
