package practice_Programm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_Library.File_Utility;
import com.generic_Library.Java_Utility;
import com.generic_Library.WebDriver_Utility;
import com.object_Repository.Facebook_Page;

public class Facebook {
	
	@DataProvider(name="facebook")
	public Object[][] facebook() throws Exception
	{
		return File_Utility.getMultipleDataFromExcel("facebook");
	}
	
	@DataProvider(name="loginpage")
	public Object[][] facebook_login() throws Exception
	{
		return File_Utility.getMultipleDataFromExcel("loinData");
	}
	
	@Test(priority = 1,dataProvider ="loginpage")
	public void login(String username,String password) throws Exception
	{
		WebDriver driver=WebDriver_Utility.callingWebDriver("https://www.facebook.com/login.php/");
		Facebook_Page fb=new Facebook_Page(driver);
		fb.getEmailAddressTextField_LoginPage().sendKeys(username);
		fb.getPasswordTextField_LoginPage().sendKeys(password);
		fb.getLoginButton_LoginPage().click();
		Thread.sleep(1000);
		WebDriver_Utility.takeScreenshotofWebPage(driver, "facebook "+Java_Utility.getName());
		Thread.sleep(1000);
		driver.quit();
		
	}
	
	@Test(priority = 2,dataProvider = "facebook",enabled=false)
	public void signUp(String url,String firstname,String lastname,String mobile_no,String password,String dayData,String monthData,String yearData) throws Exception
	{
		WebDriver driver=WebDriver_Utility.callingWebDriver(url);
		Facebook_Page fb=new Facebook_Page(driver);
		
		fb.getCreateNewAccountButton().click();
		Thread.sleep(1000);
		fb.getFirstNameTextField().sendKeys(firstname);
		fb.getLastNameTextField().sendKeys(lastname);
		fb.getEmailTextField().sendKeys(mobile_no);
		fb.getPasswordTextField().sendKeys(password);
		
		WebElement day=fb.getDayDropdown();
		WebElement month=fb.getMonthDropdown();
		WebElement year=fb.getYearDropdown();
		
		Select dayNew=new Select(day);
		Select monthNew=new Select(month);
		Select yearNew=new Select(year);
		
		dayNew.selectByValue(dayData);
		monthNew.selectByValue(monthData);
		yearNew.selectByValue(yearData);
		
		fb.getMaleRadioButton().click();
		fb.getSignUpButton().click();
		
   	    Thread.sleep(2000);
		WebDriver_Utility.takeScreenshotofWebPage(driver, "facebook "+Java_Utility.getName());
		Thread.sleep(2000);
		driver.quit();
		
	  }
	}



