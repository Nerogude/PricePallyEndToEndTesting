package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LoginPage extends BasePage{
	
	public WebDriver driver;
	
	By createAccountLink = By.cssSelector(".btn-effects");
	By emailAddressField = By.cssSelector("input#email");
	By passwordField = By.cssSelector("input#password");
	By forgotPasswordText = By.cssSelector("[data-toggle]");
	By loginBtn = By.cssSelector(".gotocart-btn");

	public LoginPage() throws IOException {
		super();
	}
	
	public WebElement getCreateAccountLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(createAccountLink);
	}
	public WebElement getEmailAddressField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(emailAddressField);
	}
	public WebElement getPasswordField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(passwordField);
	}
	public WebElement getForgotPasswordText() throws IOException {
		this.driver = getDriver();
		return driver.findElement(forgotPasswordText);
	}
	public WebElement getLoginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginBtn);
	}

}
