package com.Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_Library.File_Utility;
import com.generic_Library.Java_Utility;
import com.generic_Library.WebDriver_Utility;

public class Learning_Flipkart_20 {
	
	@DataProvider(name="excelData")
	public Object[][] excelData() throws Exception
	{
		return File_Utility.getMultipleDataFromExcel("flipkart");
	}
	
	@Test(dataProvider = "excelData")
	public void flipkart(String searchData) throws InterruptedException
	{
		WebDriver driver=WebDriver_Utility.callingWebDriver("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys(searchData,Keys.ENTER);
		Thread.sleep(1000);
		WebDriver_Utility.takeScreenshotofWebPage(driver,"flipkartSearch "+ Java_Utility.getName());
		Thread.sleep(1000);
		driver.quit();
		
	}

}
