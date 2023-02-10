package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{
	
	public WebDriver driver;
	
	
	By productOne = By.cssSelector(".row > div:nth-of-type(1) img[alt='Product-img1']");
	By productTwo = By.cssSelector("div:nth-of-type(2) img[alt='Product-img1']");
	By productThree = By.cssSelector(".row > div:nth-of-type(3) img[alt='Product-img1']");
	By productFour = By.cssSelector("div:nth-of-type(4) img[alt='Product-img1']");
	By productFive = By.cssSelector("div:nth-of-type(5) img[alt='Product-img1']");
	By productSix = By.cssSelector("div:nth-of-type(6) img[alt='Product-img1']");
	By productSeven = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(7) [alt]");
	By productEight = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(8) [alt]");
	By productNine = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(9) [alt]");
	By productTen = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(10) [alt]");
	By productEleven = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(11) [alt]");
	By productTwelve = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(12) [alt]");
	By productThirteen = By.cssSelector("[class='col-md-6 col-lg-3']:nth-of-type(14) [alt]");
	
	public ShopProductPage() throws IOException {
		super();
	}
	public WebElement getProductOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productOne);
	}public WebElement getProductTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productTwo);
	}public WebElement getProductThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThree);
	}public WebElement getProductFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFour);
	}public WebElement getProductFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFive);
	}public WebElement getProductSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSix);
	}public WebElement getProductSeven() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSeven);
	}public WebElement getProductEight() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productEight);
	}public WebElement getProductNine() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productNine);
	}public WebElement getProductTen() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productTen);
	}public WebElement getProductEleven() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productEleven);
	}public WebElement getProductTwelve() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productTwelve);
	}public WebElement getProductThirteen() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThirteen);
	}

}
