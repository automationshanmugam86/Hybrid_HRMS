package com.HRMS.GlobalParameters;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInstance extends GlobalParameters
{
	
	public BrowserInstance()
	{
		
		if(BROWSER.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\AllFrameworks\\HRMS_Hybrid\\src\\main\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\AllFrameworks\\HRMS_Hybrid\\src\\main\\resources\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(BROWSER.equals("CH"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\AllFrameworks\\HRMS_Hybrid\\src\\main\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}