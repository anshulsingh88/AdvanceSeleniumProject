package com.Learning_TestNG.practise_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_MultiDimensionArray_Data_Feeding {
	
@Test(dataProvider="getData",dataProviderClass = Demo_Workshop_TestData.class)    
	
	public void loginTest(String email, String password) throws InterruptedException 
	{
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	 driver.findElement(By.xpath("//a[@href='/login']")).click();
	 driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
 	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
 	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
 	driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();
 	
	Thread.sleep(1000);
	driver.quit();
	}

@DataProvider

public  Object[][] getData()
{
	Object[][] data  = {{"anshultradddvner99@gmail.com","ANSHUL"},{"anshultrader9@gmail.com","ANSHUL"},{"anshultradddvner9@gmail.com","ANSHUL"},{"anshultradddvner887088@gmail.com","ANSHUL"},{"anshultradddvner88008@gmail.com","ANSHUL"}};
	return data;
}

}
