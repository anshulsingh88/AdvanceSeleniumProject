package practice_Programm;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generic_Library.WebDriver_Utility;

public class Calendar_Popup_Pom_Class_Stale_Resolve {

	@Test
	public void calendar_Popup() throws InterruptedException {

		WebDriver driver = WebDriver_Utility.callingWebDriver("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Calendar_Popup_Pom_Page cal = new Calendar_Popup_Pom_Page(driver);

		WebElement dateFrame = cal.getDateFrame();
		driver.switchTo().frame(dateFrame);

		cal.getDatePickerTextField().click();
		System.out.println(cal.getTitle().getText());
		WebElement title = cal.getTitle();
		WebElement date = cal.getDate();
		WebElement arrow = cal.getArrow();
		String titlex = title.getText(); // basically these title get stale too

		while (!(titlex.equals("August 2006"))) {

			arrow.click();
			titlex = title.getText();

		}
		Thread.sleep(1000);
		date.click();

		Thread.sleep(1000);
		driver.quit();
	}

}
