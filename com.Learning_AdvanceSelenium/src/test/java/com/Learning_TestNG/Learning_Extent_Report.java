package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.fedcm.model.LoginState;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generic_Library.Java_Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Learning_Extent_Report {
	
	@Test
	public void demoWebShopLogin() throws InterruptedException
	{
		ExtentReports report =new ExtentReports("./src/test/resources//TestReport/"+Java_Utility.getName()+".html");
		
		ExtentTest test= report.startTest("LoginTest");
		
		test.log(LogStatus.PASS, "Welcome page is displayed Successfully");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "validating Welcome page");

		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login", "validating Login page");

		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anshultradddvner887088@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ANSHUL");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "validating Home page");

		driver.quit();
}

}
