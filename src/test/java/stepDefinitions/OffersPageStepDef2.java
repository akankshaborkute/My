package stepDefinitions;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.LandingPagePOM;
import POM.OffersPagePOM;
import POM.PageObjectManager;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class OffersPageStepDef2 {
	public WebDriver driver;
	public String LandingPageProductName;
	public String OfferPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager; 
	
	public OffersPageStepDef2(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		}
	
	@Then("^User searched for (.+) shortname in offers page$")
		public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchToOfferPage();	
		OffersPagePOM offersPage=testContextSetup.pageObjectManager.offersPage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		OfferPageProductName=offersPage.getProductName();
		System.out.println(OfferPageProductName+"=extracted from offer page");
		}
 	public void switchToOfferPage() {
//		if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		LandingPagePOM landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.switchWindowToChild();
	}
	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(OfferPageProductName,testContextSetup.LandingPageProductName);
	}
}
