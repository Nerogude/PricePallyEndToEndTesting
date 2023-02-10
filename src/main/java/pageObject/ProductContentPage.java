package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductContentPage extends BasePage{
	
	public WebDriver driver;
	
	By selectOrderBtn = By.cssSelector(".row .order-type-btn-popup.text-uppercase.yellow-btn");
	By likeBtn = By.cssSelector("section#overview > .container > .row > div:nth-of-type(2) .material-icons");

	public ProductContentPage() throws IOException {
		super();	
	}
	public WebElement getSelectOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectOrderBtn);
	}
	public WebElement getLikeBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(likeBtn);
	}

}
