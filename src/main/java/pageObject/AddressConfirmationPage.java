package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AddressConfirmationPage extends BasePage{
	
	public WebDriver driver;
	
	By radioBtn = By.cssSelector("label[for='homeadd12993']");
	By useAddressBtn = By.cssSelector("button[class=\"'yellow-bg text-uppercase select-address\"]");
	By closeBtn = By.cssSelector("body > main:nth-child(3) > div:nth-child(15) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > small:nth-child(1)");
	

	public AddressConfirmationPage() throws IOException {
		super();
	}
	public WebElement getRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(radioBtn);
	}
	public WebElement getUseAddressBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(useAddressBtn);
	}
	public WebElement getCloseBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(closeBtn);
	}

}
