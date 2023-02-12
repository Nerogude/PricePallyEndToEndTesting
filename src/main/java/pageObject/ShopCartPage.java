package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopCartPage extends BasePage{
	
	public WebDriver driver;
	
	By qtyReduceBtn = By.cssSelector(".rowCount98551368 [onclick='decrease\\(\\'1563204830\\' \\, \\'98551368\\'\\)'] .material-icons");
	By qtyIncreaseBtn = By.cssSelector(".rowCount98551368 [onclick='increase\\(\\'1563204830\\' \\, \\'98551368\\'\\)'] .material-icons");
	By selectAddressLink = By.cssSelector(".light-brown.normal-address.pointer.text-uppercase");
	
	public ShopCartPage() throws IOException {
		super();	
	}
	
	public WebElement getQtyReduceBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(qtyReduceBtn);
	}
	public WebElement getQtyIncreaseBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(qtyIncreaseBtn);
	}
	public WebElement getSelectAddressLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectAddressLink);
	}

}
