package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class New_Interview {
	
	@Test
	public void myntra() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		WebElement menTshirt=driver.findElement(By.xpath("(//a[@href='/shop/men' ])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(menTshirt).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
