package com.Learning_TestNG.practise_TestNG;

import org.testng.annotations.DataProvider;

public class Demo_Workshop_TestData {
	
	@DataProvider
	
	public  Object[][] getData()
	{
		Object[][] data  = {{"anshultradddvner99@gmail.com","ANSHUL"},{"anshultrader9@gmail.com","ANSHUL"},{"anshultradddvner9@gmail.com","ANSHUL"},{"anshultradddvner887088@gmail.com","ANSHUL"}};
		return data;
	}

}
