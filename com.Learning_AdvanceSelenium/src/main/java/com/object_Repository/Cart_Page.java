package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBlueJeansAddToCartButton() {
		return blueJeansAddToCartButton;
	}

	public WebElement getBlueJeansRemoveCheckBox() {
		return blueJeansRemoveCheckBox;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	@FindBy(xpath = "//img[@alt='Picture of Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")
	private WebElement blueJeansAddToCartButton;
	
	@FindBy(xpath="//img[@alt='Picture of Blue Jeans']/ancestor::tr[@class='cart-item-row']/descendant::input[@type='checkbox']")
	private WebElement blueJeansRemoveCheckBox;
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement updateShoppingCartButton;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']")
	private WebElement shoppingCartLogo;

	public WebElement getShoppingCartLogo() {
		return shoppingCartLogo;
	}

}
