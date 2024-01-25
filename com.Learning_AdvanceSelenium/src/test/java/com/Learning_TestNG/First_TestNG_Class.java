package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	
	@Test   //It acts like a main method
	
	public void login() {
		
		Reporter.log("This is my 1st Test case",true);
	}
	
@Test   //It acts like a main method
	
	public void register() {
		
		Reporter.log("This is my 2st Test case",true);
	}

@Test   //It acts like a main method

public void help() {
	
	Reporter.log("This is my 3st Test case",true);
}

}
