package com.HRMS.TestScripts;

import static com.HRMS.Libraries.LoginLibrary.*;
import static com.HRMS.Libraries.DirectoryLibrary.*;
import static com.HRMS.ObjectRepository.DirectoryRepository.*;
import static com.HRMS.ObjectRepository.LoginRepository.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.HRMS.GlobalParameters.ExcelWrappers;
import com.HRMS.wrappers.TestNGAnnotations;
import static com.HRMS.wrappers.SeleniumWrappers.*;

public class DirectoryTest extends TestNGAnnotations {
	
	@Test
	
	public void searchText() throws Exception
	{
		
		ExcelWrappers.setExcelFile(InputPath, "Sheet1");
		String str = ExcelWrappers.readData(1, 0);
		loginFunction();
		dashboardText(DashboardText);
		DirectoryTextLink(directoryLink);
		directorySearchText(directoryName, str);
		searchButton(SearchButton);
		String actualText = directoryTextValidation(textValidation);
		verifyEquals(str, actualText);
		
	}
	
	@Test
	
	public void jobTitleSearch() throws Exception
	{
		
		ExcelWrappers.setExcelFile(InputPath, "Sheet1");
		String str = ExcelWrappers.readData(1, 1);
		loginFunction();
		dashboardText(DashboardText);
		DirectoryTextLink(directoryLink);
		directoryJobTitleDropDownBox(JobTitle, str);
		searchButton(SearchButton);
		String actualText = directoryTextValidation(jobTitleValidation);
		verifyEquals(str, actualText);
		
	}

	public static void main(String[] args) {
		
	}
	
	
	
	

}
