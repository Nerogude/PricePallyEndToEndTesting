package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ManageAddressPage extends BasePage{
	
	public WebDriver driver;
	
	By addNewAddressLink = By.cssSelector(".d-flex.justify-content-end [data-toggle]");
	By useAddressBtn = By.cssSelector("main [tabindex='-1']:nth-child(15) .select-address");
	By closeBtn = By.cssSelector("main [tabindex='-1']:nth-child(15) [data-dismiss]");

	public ManageAddressPage() throws IOException {
		super();	
	}
	public WebElement getAddNewAddressLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addNewAddressLink);
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
