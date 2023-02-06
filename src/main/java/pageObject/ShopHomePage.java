package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomePage extends BasePage {
	
	public WebDriver driver;
	
	By searchInputField = By.cssSelector("input#search_products");
	By searchBtn = By.cssSelector(".search-btn11");
	

	public ShopHomePage() throws IOException {
		super();	
	}
	public WebElement getSearchInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(searchInputField);
	}
	public WebElement getSearchBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(searchBtn);
	}

}
