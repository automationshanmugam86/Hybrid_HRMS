package com.HRMS.ObjectRepository;

import org.openqa.selenium.By;

public class DirectoryRepository {
	
	public static By directoryLink = By.xpath("//*[@id='menu_directory_viewDirectory']/b");
	
	public static By directoryName = By.xpath("//*[@id='searchDirectory_emp_name_empName']");
	
	public static By SearchButton = By.xpath("//*[@id='searchBtn']");
	
	public static By JobTitle = By.xpath("//*[@id='searchDirectory_job_title']");
	
	public static By JobLocation = By.xpath("//*[@id='searchDirectory_location']");
	
	public static By textValidation = By.xpath("//*[@id='resultTable']/tbody/tr[2]/td[2]/ul/li[1]/b");
	
	public static By jobTitleValidation = By.xpath("//*[@id='resultTable']/tbody/tr[2]/td[2]/ul/li[2]");

}
