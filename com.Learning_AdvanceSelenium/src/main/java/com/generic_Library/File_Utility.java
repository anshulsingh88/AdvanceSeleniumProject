package com.generic_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
	public static String getPropertyValue(String Key) throws IOException
	{
		// Java representation of Object of external file
		FileInputStream fs=new FileInputStream("./src/test/resources/commanData/commanData.properties");
		
		//Class which is used to work on properties
		Properties prop= new Properties();
		prop.load(fs);
		
		String value=prop.getProperty(Key);
		return value;
	}
	
	public static String getSingleDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception
	{
		FileInputStream fs=new FileInputStream("./src/test/resources/TestCaseData/registerData.xlsx");
		Workbook workbook =WorkbookFactory.create(fs);
		Sheet sheet= workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String value =cell.getStringCellValue();
		return value;
	}
	
	public static Object[][] getMultipleDataFromExcel(String sheetName) throws Exception
	{
		FileInputStream fs=new FileInputStream("./src/test/resources/TestCaseData/registerData.xlsx");
		Workbook workbook =WorkbookFactory.create(fs);
		Sheet sheet= workbook.getSheet(sheetName);
		Row row =sheet.getRow(1);
		int rowCount=sheet.getLastRowNum();
		int cellCount=row.getLastCellNum();
		
		Object[][]value =new Object[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int x=0;x<cellCount;x++)
			{
				DataFormatter data=new DataFormatter();
				data.formatCellValue(sheet.getRow(i).getCell(x));
				value[i-1][x]=data.formatCellValue(sheet.getRow(i).getCell(x));
			}
		}
		return value;
	}

}
