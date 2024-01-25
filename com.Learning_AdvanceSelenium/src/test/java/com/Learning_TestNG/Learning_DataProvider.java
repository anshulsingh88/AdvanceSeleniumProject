package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_DataProvider {
	
	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "anshultradddvner99@gmail.com";
		data[0][1] = "ANSHUL";

		data[1][0] = "anshultrader9@gmail.com";
		data[1][1] = "ANSHUL";

		data[2][0] = "anshultradddvner9@gmail.com";
		data[2][1] = "ANSHUL";

		return data;                                                                                                                                                                                                                         
	}     
	
	@Test(dataProvider="loginData")                                                                                                                                                              
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
                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                            

}
