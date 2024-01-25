package com.generic_Library;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.object_Repository.Home_Page;
import com.object_Repository.Login_Page;
import com.object_Repository.Welcome_Page;

public class Base_Test2 {
	
	public static WebDriver sdriver;
	public WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void browserOpen() throws IOException {
		String URL=File_Utility.getPropertyValue("url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);

		sdriver = driver;

	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		String EMAIL=File_Utility.getPropertyValue("username");
		String PASSWORD=File_Utility.getPropertyValue("password");
	    Welcome_Page wp=new Welcome_Page(driver);
	    Login_Page lp=new Login_Page(driver);
		
		wp.getLoginLink().click();
		lp.getEmailTextField().sendKeys(EMAIL);
		lp.getPasswordTextField().sendKeys(PASSWORD);
		lp.getRemberMeCheckbox().click();
		lp.getLoginButton().click();

	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
		Home_Page hp=new Home_Page(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}


}
