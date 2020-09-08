package com.HRMS.Libraries;

import org.openqa.selenium.By;

import com.HRMS.GlobalParameters.GlobalParameters;
import static com.HRMS.wrappers.SeleniumWrappers.*;

public class DirectoryLibrary extends GlobalParameters {
	
	public static void DirectoryTextLink(By Locator) throws Exception
	{
		clickObject(Locator);
	}
	
	public static void directorySearchText(By Locator, String Text) throws Exception
	{
		enterText(Locator, Text);
	}
	
	public static void directoryJobTitleDropDownBox(By Locator, String Option) throws Exception
	{
	selectOption(Locator, Option);
	}
	
	public static void directoryLocationDropDownBox(By Locator, String Option) throws Exception
	{
		selectOption(Locator, Option);
	}
	
	public static void searchButton(By Locator) throws Exception 
	{
		clickObject(Locator);
	}
	
	public static String directoryTextValidation(By Locator) throws Exception
	{
		String str = extractText(Locator);
		return str;
	}
	

}



