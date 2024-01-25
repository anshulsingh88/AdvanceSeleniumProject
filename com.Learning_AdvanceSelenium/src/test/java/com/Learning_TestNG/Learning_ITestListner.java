package com.Learning_TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test2;

@Listeners(com.generic_Library.Listner_Impementaionx.class)
public class Learning_ITestListner extends Base_Test2{
	
	@Test
	public void loginm() throws InterruptedException
	{
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		Thread.sleep(1000);
	
	}
	
	
}
