package step.definition;

import java.util.List;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;

public class DesktopsStepDefinition extends Base {
	
	DesktopPageObject desktopsPageObject = new DesktopPageObject();
	//Scenario: User verify all items are present in Desktops tab
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopsPageObject.clickonDesktopButtone();
		logger.info("User clicked on Desktop button successfully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopsPageObject.clickonShowAllDesktops();
		logger.info("User clicked on Show All Desktops link successfully");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopelements = desktopsPageObject.returnAllDesktopItemsList();
		for (WebElement elements: desktopelements) {
			Assert.assertTrue(elements.isDisplayed());
			logger.info(elements.getAttribute("title") + " is present.");
		}
				
	}
	//Scenario: User add HP LP 3065  from Desktops tab to the cart
	@When("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopsPageObject.clickOnaddToCartHPLP3065BeforeQty();;
		logger.info("User clicked on add to cart HP LP3065");
	
			
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopsPageObject.selectQtyHPLP3065("1");
		logger.info("User select 1 as quanitity successfully");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopsPageObject.clickonAddtoCartafterQty();
		logger.info("User added the HPLP 3065 to the cart successfully");
	}

	@Then("User should see a message for HPLP {string}")
	public void User_should_see_a_message_for_HPLP (String string) {
		String SuccessMsgFromUI = desktopsPageObject.getSuccesstextHPLP3065();
		String actualSuccessMsgAfterSubstring = SuccessMsgFromUI.substring(0, 56);
		//System.out.println(expctedSuccessMsg);
		String expctedSuccessMsg = "Success: You have added HP LP3065 to your shopping cart!";
		Assert.assertEquals(expctedSuccessMsg, actualSuccessMsgAfterSubstring);
		logger.info("User saw the success message sucessfully");
	}

	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	
	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopsPageObject.clickonAddToCartCanonEOS5D();
		logger.info("User click on add to cart for Canon EOS5D Successfully");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopsPageObject.clickonAvailableOptionCanonEOS5D();
		desktopsPageObject.clickonRedOptionforCanonEOS5D();
		logger.info("User clicked on dropdown and slelected red color successfully");
	}
	
	@When("User select quantity {int} for Canon EOS5D")
	public void user_select_quantity_for_canon_eos5d(Integer int1) {
		desktopsPageObject.clearAndSelectQTYforCanonEOS5D("1");
		logger.info("User selected quantity 1 for Canon EOS 5D Successfully");
		
	}

	@When("User click add to Cart button for Canon EOS5D")
	public void user_click_add_to_cart_button_for_canon_eos5d() {
		desktopsPageObject.clickonAddToCartafterQTYCaonon5D();
	}


	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		String SuccessCanonEOS5DFromUI = desktopsPageObject.getSuccessTextForCanonEOS5D();
		String actualSuccessTxtCanonEOS5DAfterSubString = SuccessCanonEOS5DFromUI.substring(0, 66);
		String expectedSuccessCanonEOS5D = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
	    Assert.assertEquals(expectedSuccessCanonEOS5D, actualSuccessTxtCanonEOS5DAfterSubString);
	    logger.info("User saw the success message for Canon 5D  Successfully");
	}
	 //Scenario: User add a review to Canon EOS 5D item inDesktops tab
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsPageObject.clickOnCanon5DItem();
		logger.info("User clicked on Canon EOS 5D item successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopsPageObject.clickOnWriteReviewLink();
		logger.info("User clicked on Write a Review Link successfully");
	}
   
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTableforReview) {
	  List<Map<String, String>> addReviewData = dataTableforReview.asMaps(String.class, String.class);
	  desktopsPageObject.addNametoReview(addReviewData.get(0).get("yourname"));
	  desktopsPageObject.addReviewText(addReviewData.get(0).get("yourReview"));
	  desktopsPageObject.selectRateValue2();
	  logger.info("User wrote the review and selected rating successfully");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopsPageObject.clickonContinueAfterRating();
		logger.info("User click on Continue Button after rating successfully");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		String expectedThankYouText = desktopsPageObject.getThankYouMessageAfterReview();
		String actualThankYouText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Assert.assertEquals(expectedThankYouText, actualThankYouText);
		logger.info("User got the Thank you message after rating successfully");
		
	}
	


}
