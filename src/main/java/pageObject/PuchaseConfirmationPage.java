package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PuchaseConfirmationPage extends BasePage{
	
	WebDriver driver;
	
	By viewYourOrdersBtn = By.cssSelector(".m-auto.mb-3.modal-w.mt-4 .text-uppercase.yellow-bg");
	By confirmationMessage = By.cssSelector(".modal-content  h4");

	public PuchaseConfirmationPage() throws IOException {
		super();	
	}
	
	public WebElement getViewYourOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(viewYourOrdersBtn);
	}
	public WebElement getConfirmationMessage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(confirmationMessage);
	}

}
