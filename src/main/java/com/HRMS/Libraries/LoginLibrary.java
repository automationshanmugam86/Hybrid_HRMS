package com.HRMS.Libraries;

import static com.HRMS.wrappers.SeleniumWrappers.*;
import static com.HRMS.ObjectRepository.LoginRepository.*;

import org.openqa.selenium.By;

public class LoginLibrary {
	
	public static void loginFunction()
	{
		
		enterText(UserName, "Admin");
		enterText(Password, "admin123");
		clickObject(loginButton);
		
	}
	
	public static void dashboardText(By locator) throws Exception
	{
		  boolean actualVal =  driver.findElement(locator).isDisplayed();
		  verifyEquals(true, actualVal);
		     
	}
	

}
