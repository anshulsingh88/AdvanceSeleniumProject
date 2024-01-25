package com.testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.Base_Test2;
import com.generic_Library.WebDriver_Utility;
import com.object_Repository.Cart_Page;
import com.object_Repository.Home_Page;
import com.object_Repository.Welcome_Page;

public class TC003_RemoveFromCart extends Base_Test2{
	
@Test(groups="regressionTesting")
public void removeFromCart() throws InterruptedException
{
	Home_Page hp=new Home_Page(driver);
	Cart_Page cp=new Cart_Page(driver);
	Welcome_Page wp=new Welcome_Page(driver);
	
	hp.getApparelAndShoesButton().click();
	cp.getBlueJeansAddToCartButton().click();
	Thread.sleep(1000);
	wp.getShoppingCartLink().click();
	Thread.sleep(1000);
	
	cp.getBlueJeansRemoveCheckBox().click();
	cp.getUpdateShoppingCartButton().click();
	Thread.sleep(1000);
	WebDriver_Utility.scrollToWebElement(driver, cp.getShoppingCartLogo());
	WebDriver_Utility.takeScreenshotofWebPage(driver, "RemoveFromCart");
	Thread.sleep(2000);
}

}
