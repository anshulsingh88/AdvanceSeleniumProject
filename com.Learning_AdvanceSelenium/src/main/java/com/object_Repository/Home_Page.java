package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getApparelAndShoesButton() {
		return apparelAndShoesButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelAndShoesButton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//h1[text()='Search']")
	private WebElement searchLogo;

	public WebElement getSearchLogo() {
		return searchLogo;
	}
	

}
