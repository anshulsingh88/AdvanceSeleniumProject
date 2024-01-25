package practice_Programm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login_ToDemo_Webshop {
	
	@Test
	public void loginDemoWebshop() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		if(driver.getTitle().equals("Demo Web Shop"))
		{
			Reporter.log("Web Page is displayed ",true);
			
			driver.findElement(By.xpath("//a[@href='/login']")).click();
			if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login"))
			{
				Reporter.log("Login  Page is displayed ",true);
				
				driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anshultradddvner887088@gmail.com");
				driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ANSHUL");
				driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
				driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();
				if(driver.getTitle().equals("Demo Web Shop"))
				{
					Reporter.log("Home page is displayed",true);
					Thread.sleep(2000);
					driver.quit();
				}
				else
				{
					Reporter.log("Home page is not displayed",true);
				}
			}
			else
			{
				Reporter.log("Login  Page is not displayed ",true);
			}
			
			
		}
		else
		{
			Reporter.log("Web Page is not displayed ",true);
		}
		
	}

}
