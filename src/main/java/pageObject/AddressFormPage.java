package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AddressFormPage extends BasePage{
	
	public WebDriver driver;
	
	By labelInputField = By.id("lable");
	By houseNumberInputField = By.id("house_name");
	By directionInputField = By.id("town");
	By phoneNumberInputField = By.id("phone_number");
	By streetAddressInputField = By.id("street");
	By areaInputField = By.id("area_id");
	By saveAddressBtn = By.id(".yellow-bg.text-uppercase[href='javascript:void(0);']");

	public AddressFormPage() throws IOException {
		super();	
	}
	public WebElement getLabelInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(labelInputField);
	}
	public WebElement getHouseNumberInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(houseNumberInputField);
	}
	public WebElement getDirectionInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(directionInputField);
	}
	public WebElement getPhoneNumberInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(phoneNumberInputField);
	}
	public WebElement getStreetAddressInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(streetAddressInputField);
	}
	public WebElement getAreaInputField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(areaInputField);
	}
	public WebElement getSaveAddressBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(saveAddressBtn);
	}
	

}
