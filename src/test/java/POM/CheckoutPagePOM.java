package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPagePOM {
	public WebDriver driver;

	public CheckoutPagePOM(WebDriver driver) {
		this.driver = driver;
	}

	By cartBag=By.cssSelector("[alt='Cart']");
	By checkOutBtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn=By.cssSelector(".promoBtn");
	By placeOrderBtn=By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutBtn).click();
	}
	public boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
		
	}
	public boolean verifyPlaceOrderBtn() {
		return driver.findElement(placeOrderBtn).isDisplayed();
		
	}
	
	}





