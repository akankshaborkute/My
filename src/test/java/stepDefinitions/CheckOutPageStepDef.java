package stepDefinitions;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.CheckoutPagePOM;
import POM.LandingPagePOM;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class CheckOutPageStepDef {

		public WebDriver driver;
		public CheckoutPagePOM checkoutPage;
		TestContextSetup testContextSetup;
		
		public CheckOutPageStepDef(TestContextSetup testContextSetup){
			this.testContextSetup=testContextSetup;
			this.checkoutPage= testContextSetup.pageObjectManager.getcheckOutPage();
		}
	
		@Then("^User proceeds to checkout and validate the (.+) in checkout page$")
		public void user_proceeds_to_checkout_and_validate_the_tom_in_checkout_page(String name) throws InterruptedException {
			checkoutPage.checkOutItems();
	
		}

		@Then("verify User has ability to enter promo code and place the order")
		public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
			Assert.assertTrue(checkoutPage.verifyPromoBtn());
			Assert.assertTrue(checkoutPage.verifyPlaceOrderBtn());
		    
		}
		}

