package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Page {
	
	@FindBy(xpath = "//a[@role='button' and contains(@class,'selected')]")
	private WebElement createNewAccountButton;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	
	@FindBy(name = "reg_email__")
	private WebElement emailTextField;
	
	
	@FindBy(xpath = "//input[@data-type='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	private WebElement dayDropdown;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement monthDropdown;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement yearDropdown;
	
	@FindBy(xpath = "//input[@type='radio' and @value='2']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signUpButton;
	
	@FindBy(id ="email")
	private WebElement emailAddressTextField_LoginPage;
	
	@FindBy(id  = "pass")
	private WebElement passwordTextField_LoginPage;
	
	@FindBy(id  = "loginbutton")
	private WebElement loginButton_LoginPage;
	
	

	public WebElement getEmailAddressTextField_LoginPage() {
		return emailAddressTextField_LoginPage;
	}

	public WebElement getPasswordTextField_LoginPage() {
		return passwordTextField_LoginPage;
	}

	public WebElement getLoginButton_LoginPage() {
		return loginButton_LoginPage;
	}

	public Facebook_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewAccountButton() {
		return createNewAccountButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getDayDropdown() {
		return dayDropdown;
	}

	public WebElement getMonthDropdown() {
		return monthDropdown;
	}

	public WebElement getYearDropdown() {
		return yearDropdown;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}
	
	
	

}
