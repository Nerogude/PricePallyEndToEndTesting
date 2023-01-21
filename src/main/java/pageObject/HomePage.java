package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	By loginBtn = By.linkText("people_outline Users");
	By cartBtn = By.cssSelector("div:nth-of-type(3) > .nav-link");
	By ordersBtn = By.cssSelector(".list-btn-login.nav-link");
	By searchBar = By.cssSelector(".list-btn-login.nav-link");
	

	public HomePage() throws IOException {
		super();
	}
	public WebElement getLoginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginBtn);
	}
	public WebElement getCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cartBtn);
	}
	public WebElement getOrdersBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ordersBtn);
	}
	public WebElement getSearchBar() throws IOException {
		this.driver = getDriver();
		return driver.findElement(searchBar);
	}

}
