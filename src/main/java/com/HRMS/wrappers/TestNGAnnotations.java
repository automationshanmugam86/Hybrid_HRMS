package com.HRMS.wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.HRMS.GlobalParameters.BrowserInstance;
import com.HRMS.GlobalParameters.GlobalParameters;

public class TestNGAnnotations extends GlobalParameters{
	
	@BeforeMethod
	
	public void beforeClass()
	
	{
		startTest();
	}
	
	// method to launch the browser and pass on the url
	public static void startTest() 
	{
		new BrowserInstance();
		SeleniumWrappers.lauchUrl(url);
		driver.manage().window().maximize();
	}
	
	//method to quit the browser
	public static void stopTest()
	{
		SeleniumWrappers.quitBrowser();
	}
	
	
	
	@AfterMethod
	
	public void afterClass()
	{
		stopTest();
	}


}
