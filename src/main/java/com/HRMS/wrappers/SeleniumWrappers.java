package com.HRMS.wrappers;

import java.text.DateFormat;
import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.text.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.HRMS.GlobalParameters.GlobalParameters;

public class SeleniumWrappers extends GlobalParameters{
	

    //sendkeys method of Selenium  
	
	public static void enterText(By Locator, String text)
	{
		
		driver.findElement(Locator).sendKeys(text);
	}
	
	//sendkeys method with Keyboard functions
	
	public static void pressKey(By Locator, Keys keys)
	{
		driver.findElement(Locator).sendKeys(keys);
	}
	
	//clear method of selenium
	
	public static void clearText(By Locator)
	{
		driver.findElement(Locator).clear();
	}
	
	//click method of Selenium
	
	public static void clickObject(By Locator)
	{
		driver.findElement(Locator).click();
	}
	
	
	//getTitle method of Selenium
	
	public static String titleVerification()
	{
		String text = driver.getTitle();
		
		return text;
	}
	
	//select method from selenium
	
	public static void selectOption(By Locator, String Option)
	{
		Select select = new Select(driver.findElement(Locator));
		
		select.selectByVisibleText(Option);
	}
	
	//quit method from selenium
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	
	
	
	
	//accept the alerts in selenium
	
	public static void acceptAlert() throws Exception
	{
		driver.switchTo().alert().accept();
	}
	
	
	//cancel the alerts in selenium
	
	public static void cancelAlert() throws Exception
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	//get alert text from alerts using selenium
	
	public static String getAlertText() throws Exception
	{
		     String text = driver.switchTo().alert().getText();
		     return  text;
	}
	
	
	//refresh the page using selenium
	
	public static void refreshPage()
	{
		driver.navigate().refresh();
	}
	
	// navigate to url using selenium
	
	public static void navigatePath(String text)
	{
		driver.navigate().to(text);
	}
	
	//launch the url using selenium
	
	public static void lauchUrl(String url)
	{
		driver.get(url);
	}
	
	
	//isenable command from selenium
	public static boolean isElementEnabled(By Locator)
	{
		if(driver.findElement(Locator).isEnabled())
		{
			return true;
		}
		return false;
  }
	
	public static String extractText(By Locator)
	{
		String text = driver.findElement(Locator).getText();
		return text;
	}
	
	
	
	
	
	///////////////////////////Java commands //////////////////////////////////////////////
	//Thread.sleep method from Java
	
		public static void waitTime(int TimeinMils) throws InterruptedException
		{
			Thread.sleep(TimeinMils);
		}
		
		public static String getDate()
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");
			
			Date date = new Date();
			
			return dateFormat.format(date);
			
		}
		
	///////////////////////////TestNG Assertions///////////////////////////////////////////
		
		//assert equals in testng
		public static void verifyEquals(String expected, String actual) throws Exception
		{
			assertEquals(expected,actual);
		}
		
		
		//assert equals in testng
		public static void verifyEquals(boolean expected, boolean actual) throws Exception
		{
			assertEquals(expected,actual);
		}
		
		//assertTrue in Testng
		
		public static void verifyTrue(boolean actualValue) throws Exception
		{
			assertTrue(actualValue);
		}
		
		//assertFalse in Testng
		
		public static void verifyFalse(boolean actualValue) throws Exception
		
		{
			assertFalse(actualValue);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
