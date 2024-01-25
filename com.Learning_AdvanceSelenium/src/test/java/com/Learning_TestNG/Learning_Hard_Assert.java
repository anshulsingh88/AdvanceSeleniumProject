package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Hard_Assert {
	
	@Test
	public void demoWebShopLogin() throws InterruptedException
	{
		
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