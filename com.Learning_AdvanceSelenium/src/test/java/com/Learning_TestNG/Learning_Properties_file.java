package com.Learning_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_file {
	
	@Test                                                                                                                                                           
	public void loginTest () throws IOException, InterruptedException                                                                                                                                          
	{                                   
		// Java representation of Object of external file
	FileInputStream fs=new FileInputStream("./src/test/resources/commanData/commanData.properties");
	
	//Class which is used to work on properties
	Properties prop= new Properties();
	prop.load(fs);
	
	// fetching values by passing keys
	String url=prop.getProperty("url");
	String username=prop.getProperty("username");
	String password=prop.getProperty("password");
	
	WebDriver driver =new ChromeDriver();                                                                                                                                                                                                   
	driver.manage().window().maximize();                                                                                                                                                                                                    
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));                                                                                                                                                                      
	driver.get(url);                                                                                                                                                                                       
	                                                                                                                                                                                                                                        
	 driver.findElement(By.xpath("//a[@href='/login']")).click();                                                                                                                                                                           
	 driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);                                                                                                                                                                
 	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);                                                                                                                                                           
 	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();                                                                                                                                                                      
 	driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();                                                                                                                                                        
 	                                                                                                                                                                                                                                        
	Thread.sleep(1000);                                                                                                                                                                                                                     
	driver.quit();                                                                                                                                                                                                                          
	}             

}
