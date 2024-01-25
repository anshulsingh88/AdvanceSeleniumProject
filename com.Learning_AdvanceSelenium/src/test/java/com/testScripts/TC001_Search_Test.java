package com.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.Base_Test2;
import com.generic_Library.WebDriver_Utility;
import com.object_Repository.Cart_Page;
import com.object_Repository.Home_Page;
import com.object_Repository.Welcome_Page;

public class TC001_Search_Test extends Base_Test2{
	
	
	@Test(groups="smokeTesting")
	public void TC001() throws InterruptedException
	{
		Welcome_Page wp=new Welcome_Page(driver);
		Cart_Page cp=new Cart_Page(driver);
		Home_Page hp=new Home_Page(driver);
		
		wp.getSearchTextField().sendKeys("mobile",Keys.ENTER);
		WebDriver_Utility.scrollToWebElement(driver,hp.getSearchLogo());
		
		Thread.sleep(2000);
		WebDriver_Utility.takeScreenshotofWebPage(driver, "searchScreenshot");
	}
	
	
}
