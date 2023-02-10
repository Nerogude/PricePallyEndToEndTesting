package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductContentPanel extends BasePage{
	
	public WebDriver driver;
	
	By pallyBtn = By.cssSelector("[for='radio1']");
	By payByMyselfBtn = By.cssSelector("[for='radio2']");
	By inputBox = By.cssSelector("input#number_of_person");
	By addToCartBtn = By.cssSelector(".btn-save-cart");
	By closeBtn = By.cssSelector(".addclose.mb-4.mt-2.pointer.text-center > .text-danger.text-uppercase");

	public ProductContentPanel() throws IOException {
		super();	
	}
	public WebElement getPallyBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(pallyBtn);
	}
	public WebElement getPayByMyselfBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByMyselfBtn);
	}
	public WebElement getInputBox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(inputBox);
	}
	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	public WebElement getCloseBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(closeBtn);
	}

}
