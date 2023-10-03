package POM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPagePOM landingPage;
	public OffersPagePOM offersPage;
	public CheckoutPagePOM checkOutPage;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public LandingPagePOM getLandingPage() { 
		landingPage = new LandingPagePOM(driver);
	return landingPage;
	}
	public OffersPagePOM offersPage() {
	offersPage = new OffersPagePOM(driver);
	return offersPage;
	}	
	public CheckoutPagePOM getcheckOutPage() {
		checkOutPage=new CheckoutPagePOM(driver);
		return checkOutPage;
	
	}
}
