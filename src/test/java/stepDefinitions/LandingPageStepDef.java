package stepDefinitions;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.LandingPagePOM;
import io.cucumber.java.en.*;
import utils.TestContextSetup;
public class LandingPageStepDef {
	public WebDriver driver;
	public String LandingPageProductName;
	public String OfferPageProductName;
	TestContextSetup testContextSetup;
	LandingPagePOM landingpage;
	
	public LandingPageStepDef(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		this.landingpage=testContextSetup.pageObjectManager.getLandingPage();  
	}
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));
	}
	@When("^User  searched  with Short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		landingpage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.LandingPageProductName=landingpage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.LandingPageProductName +"=extracted from the homepage");
	}
	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		landingpage.incrementQuantity(Integer.parseInt(quantity));
		landingpage.addToCart();
	   	}

	@And("User adds items in cart")	
	public void user_adds_items_in_cart() throws InterruptedException {
		LandingPagePOM landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingpage.selectItem();
		
	}
}
