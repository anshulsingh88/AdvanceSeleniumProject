package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void browserOpen(String browser) {
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

	}

	@BeforeMethod(alwaysRun = true)
	public void login() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anshultradddvner887088@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ANSHUL");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();
	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}

}
