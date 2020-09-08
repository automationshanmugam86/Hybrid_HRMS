package com.HRMS.TestScripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.HRMS.wrappers.TestNGAnnotations;

import static com.HRMS.Libraries.LoginLibrary.*;
import static com.HRMS.ObjectRepository.LoginRepository.*;

public class LoginTest extends TestNGAnnotations {
	private static Logger log = Logger.getLogger(LoginTest.class);
	
	@Test
	
	public void loginValidate() throws Exception
	{
		loginFunction();
		log.info("login successull");
		dashboardText(DashboardText);
		log.info("DashboardText successfull");
		
	}
	
}
