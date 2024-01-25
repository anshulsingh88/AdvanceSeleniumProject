package practice_Programm;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic_Library.WebDriver_Utility;

public class Calendar_Popup_Pom_Page {
	
	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement dateFrame;
	
	@FindBy(xpath = "//input[@id='datepicker' or @class='hasDatepicker']")
	private WebElement datePickerTextField;
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']")
	private WebElement title;
	
	@FindBy(xpath = "//a[@class='ui-state-default' and @data-date='15']")
	private WebElement date;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-w']")
	private WebElement arrow;

	public Calendar_Popup_Pom_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getDateFrame() {
		return dateFrame;
	}

	public WebElement getDatePickerTextField() {
		return datePickerTextField;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getArrow() {
		return arrow;
	}
	
	

}
