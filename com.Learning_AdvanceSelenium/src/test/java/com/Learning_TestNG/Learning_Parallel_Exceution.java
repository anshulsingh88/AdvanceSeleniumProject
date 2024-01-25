package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Parallel_Exceution {

	@Test(invocationCount = 10, threadPoolSize = 5)

	public void loginTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anshultrader9@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ANSHUL");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();

		Thread.sleep(1000);
		driver.quit();
	}

}
