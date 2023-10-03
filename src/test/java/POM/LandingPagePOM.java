package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePOM {
	public WebDriver driver;
	
	public LandingPagePOM(WebDriver driver) {
		this.driver = driver;
	}
By Search=By.xpath("//input[@type='search']");
By Productname=By.cssSelector("h4.product-name");
By topDeals=By.linkText("Top Deals");
By Tomato=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[6]/div[3]/button");
By Cucumber=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button");
By Carrot=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/div[3]/button");
By Cauliflower=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button");
By Increment=By.cssSelector("a.increment");
By AddToCartbtn=By.cssSelector(".product-action button");

public void searchItem(String name) {
	driver.findElement(Search).sendKeys(name);
	 }

public void getSearchText() {
	driver.findElement(Search).getText();
}
public void incrementQuantity(int quantity) {
	int i=quantity-1;
	while(i>0) {
		driver.findElement(Increment).click();
		i--;
	}
	}
	public void addToCart() {
		driver.findElement(AddToCartbtn).click(); 
	}

public String getProductName() {
	return driver.findElement(Productname).getText();
}
public void selectTopDealsPage() {
	driver.findElement(topDeals).click();
}
public void selectItem() {
	driver.findElement(Tomato).click();
	driver.findElement(Cucumber).click();
	driver.findElement(Carrot).click();
}
public String getTitleLandingPage() {
	return driver.getTitle();
}
}


