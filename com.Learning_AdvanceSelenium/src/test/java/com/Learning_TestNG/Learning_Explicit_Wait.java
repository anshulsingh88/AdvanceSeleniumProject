package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Learning_Explicit_Wait {
	
	@Test(priority = 1)
	public void tests1()
	{
     
	Reporter.log("star programm",true);
	}
		
	@Test(priority = 2)
	public void test1()
	{
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/login");
     
     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    
	
	}

}
