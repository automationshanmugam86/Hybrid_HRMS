/**
 * 
 */
/**
 * @author Karthika R
 *
 */
package com.HRMS.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.HRMS.GlobalParameters.GlobalParameters;



public class CommonUtils extends GlobalParameters{

       public static String screenshotName;
	
	   public static void captureScreenshot() {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String fileName = CommonUtils.getTimeStamp();
		screenshotName = fileName+ ".jpg" ;
		//screenshotName = CommonUtils.getTimeStamp();
        try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\TestReports\\"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	
	
	  public static String getTimeStamp(){
			Date date = new Date();
			String timeStampString = DateFormat.getDateTimeInstance(
		            DateFormat.MEDIUM, DateFormat.SHORT).format(date)
					.replace(" ", "_")
					.replace(",", "")
					.replace(":", "_");
			return timeStampString;
		}

	
}