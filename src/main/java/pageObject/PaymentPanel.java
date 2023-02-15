package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PaymentPanel extends BasePage{
	
	WebDriver driver;
	
	By paymentCheckbox = By.cssSelector("[class='check-bg mb-2 show-wallet-check'] .check_box_ex");
	By totalFee = By.cssSelector(".modal-body.pb-4.pl-4.pr-4.pt-0 .update_total_fee");
	By applyCoupon = By.cssSelector(".box-shadow.mb-3.pb-2.pl-3.pointer.pr-3.pt-3.show-coupon");
	By directBankTransferChckbox = By.cssSelector("[for='directbnk']");
	By payStackChckbox = By.cssSelector("[for='paystack']");
	By proceedToPayBtn = By.cssSelector(".proceedtopay");

	public PaymentPanel() throws IOException {
		super();
		
	}
	public WebElement getPaymentCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(paymentCheckbox);
	}
	public WebElement getTotalFee() throws IOException {
		this.driver = getDriver();
		return driver.findElement(totalFee);
	}
	public WebElement getApplyCoupon() throws IOException {
		this.driver = getDriver();
		return driver.findElement(applyCoupon);
	}
	public WebElement getDirectBankTransferCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(directBankTransferChckbox);
	}
	public WebElement getPayStackCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payStackChckbox);
	}
	public WebElement getProceedToPayBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(proceedToPayBtn);
	}
	
}
