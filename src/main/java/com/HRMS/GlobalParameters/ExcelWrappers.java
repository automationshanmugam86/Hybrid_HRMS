package com.HRMS.GlobalParameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrappers extends GlobalParameters {
	
	public ExcelWrappers()
	{
		super();
	}
	
	public static XSSFWorkbook ExcelWbook;
	
	public static XSSFSheet ExcelWsheet;
	
	public static XSSFCell Cell;
	
	public static int row;
	
	public static int col;
	
	
	//Setting up the excel file
	
	public static void setExcelFile(String path, String sheetName) throws IOException
	{
		
		FileInputStream excelFile = new FileInputStream(path);
		
		ExcelWbook = new XSSFWorkbook(excelFile);
		
		ExcelWsheet = ExcelWbook.getSheet(sheetName);
		
	}
	
	//Reading data from Excel sheet
	
	public static String readData(int rowNum, int colNum) throws Exception
	
	{
		
		  Cell =  ExcelWsheet.getRow(rowNum).getCell(colNum);
		  
		  String cellData = Cell.getStringCellValue();
		  
		  return cellData;
		
	}
	
	//writing data to Excel sheet
	
	public static void writeCellData(int rowNum, int colNum, String data) throws Exception
	{
		
		
		    Cell =  ExcelWsheet.getRow(rowNum).getCell(colNum);
		    
		    Cell.setCellValue(data);
		    
		    //write to file
		    
		    ExcelWbook.write(new FileOutputStream(InputPath));
		    
		 
	}
	
	//getting count of rows in a sheet
	
	public static int getRowCount()
	{
		
		
		    int rowCount =  ExcelWsheet.getPhysicalNumberOfRows();
		    
		    return rowCount;
    }
	
	//getting count of columns in a sheet
	
	public static int getColCount(int rowNum)
	{
		
		int columnCount = ExcelWsheet.getRow(rowNum).getPhysicalNumberOfCells();
		
		return columnCount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
