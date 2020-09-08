package com.HRMS.ObjectRepository;

import org.openqa.selenium.By;

public class LoginRepository {
	
	public static By UserName = By.name("txtUsername");
	
	public static By Password = By.name("txtPassword");
	
	public static By loginButton = By.name("Submit");
	
	public static By DashboardText = By.xpath("//*[@id='content']/div/div[1]/h1");

}
