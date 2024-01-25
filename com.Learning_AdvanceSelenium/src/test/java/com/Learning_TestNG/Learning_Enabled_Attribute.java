package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Enabled_Attribute {
	
@Test(enabled=false)
	
	public void resgisterTest() throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();

    	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ANSHUL");
    	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SINGH");
    	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anshultradddvner887088@gmail.com");
    	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ANSHUL");
    	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("ANSHUL");
    	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
    	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
    	
    	Thread.sleep(5000);   
    	driver.quit();
	}
	
@Test
	
	public void loginTest() throws InterruptedException 
	{
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	 driver.findElement(By.xpath("//a[@href='/login']")).click();
	 driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anshultradddvner887088@gmail.com");
 	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ANSHUL");
 	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
 	driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();
 	
	Thread.sleep(5000);
	driver.quit();
	}

}
