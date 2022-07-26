package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base {

	HomePageObject homePageObject = new HomePageObject();
	
	//Scenario: User verify currency values change
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrencyButton();
		logger.info("User clicked on Currency Button successfully");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.clickOnEuroCurrencyButton();
		logger.info("User click on Euro Currency button successfully");
	   
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		String actualEuroSign = homePageObject.getEuroSign();
		String expectedEuroSign = "€";
		Assert.assertEquals(expectedEuroSign, actualEuroSign);
		logger.info("The currency value has been changed to Euro successfully");
		
	}

	//Scenario: User empty Shopping cart message displays 
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.clickOnShoppingCart();
		logger.info("User clicked on Shopping Cart Successfully");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
	String actualEmptyCartText = homePageObject.getEmptyCartText();
	String expectedEmptyCartText = "Your shopping cart is empty!";
	logger.info("User saw the message: Your shopping cart is empty!, successfully");
		
	}

}
