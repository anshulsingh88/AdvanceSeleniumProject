package com.generic_Library;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_Utility {
	
	public static void takeScreenshotofWebPage(WebDriver driver ,String screenshotName)
	{
		TakesScreenshot ts =(TakesScreenshot)driver ;
		File srs=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./src/test/resources/screenshots/"+screenshotName+".png");
		
		try {
			FileHandler.copy(srs, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void scrollToWebElement(WebDriver driver ,WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static WebDriver callingWebDriver(String URL)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		return driver;
	}
}
