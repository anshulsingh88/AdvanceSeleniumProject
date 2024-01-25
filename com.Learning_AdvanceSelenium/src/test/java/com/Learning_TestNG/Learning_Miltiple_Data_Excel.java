package com.Learning_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Learning_Miltiple_Data_Excel {
	
	@DataProvider(name="loginData")
	public Object[][] loginData() throws Throwable
	{
		FileInputStream fs=new FileInputStream("./src/test/resources/TestCaseData/registerData.xlsx");
		Workbook workbook =WorkbookFactory.create(fs);
		Sheet sheet= workbook.getSheet("loinData");
		Row row =sheet.getRow(1);
		int rowCount=sheet.getLastRowNum();
		int cellCount=row.getLastCellNum();
		
		Object[][]value =new Object[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int x=0;x<cellCount;x++)
			{
				value[i-1][x]=sheet.getRow(i).getCell(x).getStringCellValue();
			}
		}
		return value;
	}
	
	@Test(dataProvider = "loginData")
	public void login(String username,String password) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[@href='/login']")).click();

		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();

		System.out.println("LOGIN scucessfull");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.quit();
	}
	
		
}
	