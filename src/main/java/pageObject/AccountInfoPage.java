package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AccountInfoPage extends BasePage{
	
	WebDriver driver;
	
	By orderNowBtn = By.xpath("//button[@class='yellow-bg text-uppercase purchase-btn']");
	

	public AccountInfoPage() throws IOException {
		super();	
	}
	public WebElement getOrderNowBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orderNowBtn);
	}

}
