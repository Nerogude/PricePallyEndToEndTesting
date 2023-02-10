package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartNotificationPage extends BasePage{
	
	WebDriver driver;
	
	By continueShoppingBtn = By.cssSelector("[class='btneffects-bg text-center mb-3'] [data-dismiss]");
	By goToCartBtn = By.cssSelector("[class='btneffects-bg text-center mb-3'] [data-dismiss]");
	By closeBtn = By.cssSelector("[class='m-auto mb-3'] .text-uppercase");

	public CartNotificationPage() throws IOException {
		super();	
	}
	public WebElement getContinueShoppingBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	public WebElement getGoToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(goToCartBtn);
	}
	public WebElement getCloseBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(closeBtn);
	}

}
