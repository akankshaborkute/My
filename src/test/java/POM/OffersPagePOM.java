package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPagePOM { 
	public WebDriver driver;
	
	public OffersPagePOM(WebDriver driver) {
		this.driver = driver;
	}
By Search=By.xpath("//input[@type='search']");
By Productname=By.cssSelector("tr td:nth-child(1)");

public void searchItem(String shortName) {
	driver.findElement(Search).sendKeys(shortName);
	 }

public void getSearchText() {
	driver.findElement(Search).getText();
}
public String getProductName() {
	return driver.findElement(Productname).getText();
}
}
