package step.definition;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopNotebooksPageObject = new LaptopNoteBooksPageObject();

	//Scenario: Add and Remove a Mac book from Cart
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNotebooksPageObject.clickOnLaptopsAntNotebooks();
		logger.info("User clicked on Laptops & Notebooks tab successfully");
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void User_click_on_Show_all_Laptop_NoteBook_option() {
		laptopNotebooksPageObject.clickOnShowAllLaptopsandNotebooks();
		logger.info("User clicked on Show All Laptops and Notebooks successfully");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNotebooksPageObject.clickOnMacBookItem();
		logger.info("User clicked on MacBook item successfully");
	}
	
	@When("User click add to Cart button for MacBook")
	public void user_click_add_to_cart_button_for_mac_book() {
		laptopNotebooksPageObject.clickOnAddToCartForMacBook();
		logger.info("User clicked on add to the cart button successfully");
	}
	
	@Then("User should see a message for MacBook {string}")
	public void user_should_see_a_message_for_mac_book(String string) {
	   String expectedSuccessTextForMacBook = "Success: You have added MacBook to your shopping cart!";
	   String successTextForMacBookFromUI = laptopNotebooksPageObject.getSuccessTextForMacBook();
	   String actualsuccessforMacBookAfterSubString= successTextForMacBookFromUI.substring(0, 54);
	  Assert.assertEquals(expectedSuccessTextForMacBook, actualsuccessforMacBookAfterSubString);
	  logger.info("User got the success message for adding MacBook to the cart");
	   
	}


	@Then("User should see {int} item\\(s){int}.00showed to the cart")
	public void user_should_see_item_s_00showed_to_the_cart(Integer int1, Integer int2) {
	   String actualOneItemText = laptopNotebooksPageObject.get1ItemOnCartText();
	   String expectedOneItemText = "1 item(s) - $602.00";
	   Assert.assertEquals(expectedOneItemText, actualOneItemText);
	   logger.info("User saw that one item is added on the cart");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNotebooksPageObject.clickOnCartOptions();
		logger.info("User clicked on cart optioins successfully");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNotebooksPageObject.clickOnXToRemoveTheItem();
		logger.info("User clicked on X button to remove the item successfully");
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		String expectedZeroItemOnTheCart = laptopNotebooksPageObject.getZeroItemOnCartText();
		String actualZeroItemOnTheCart = "0 item(s)-$0.00";
		logger.info("User removed the item from the cart and saw the zero item allert");

	}
	//Scenario: Product Comparison 


	@And("User click on product comparison icon on onMacbk {string}")
	public void User_click_on_product_comparison_icon_on_onMacbk(String string) {
		laptopNotebooksPageObject.clickOnPrdctComprsonForMcBk();
		logger.info("User clicked on product comparason link for MacBook Successfully");
	}
	
	@And("User click on product comparison icon on MacBookAir {string}")
	public void user_click_on_product_comparison_icon_on_MacBookAir(String string) {
		laptopNotebooksPageObject.clickOnPrdctComprsonFORMCBKAir();
		logger.info("User clicked on product comparason link for MacBook Air Successfully");
		
	}
	
	@Then("User should see a message for MacBookAir {string}")
	public void user_should_see_a_message_for_MacBookAir (String string) {
		Utils.hardWait(3000);
		String expectedSuccessMasForMcBookAirComparison = "Success: You have added MacBook Air to your product comparison!";
		String successMsgForMcBookAirComparisonFromUI = laptopNotebooksPageObject.getSuccessTxtForMcBkAirComprson();
		String actualSuccessMsgForMcBkAirComprsonAfterSubString = successMsgForMcBookAirComparisonFromUI.substring(0, 63);
		Assert.assertEquals(expectedSuccessMasForMcBookAirComparison, actualSuccessMsgForMcBkAirComprsonAfterSubString);
		logger.info("User saw the success message for adding MacBook Air in comparison list successfully");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-250)", "");
		laptopNotebooksPageObject.clickOnProductComparisonLink();
		logger.info("User clicked on Product Compare Link successfully");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	   String actualProductDetailsTxtonChart = laptopNotebooksPageObject.getProductDetailsText();
	   String expectPrdctDetailsTxtOnChart = "Product Details";
	   Assert.assertEquals(expectPrdctDetailsTxtOnChart, actualProductDetailsTxtonChart);
	   String actualMcBookTxtOnChart = laptopNotebooksPageObject.getMcBookTextFromChart();
	   String expectedMcBookTxtOnChart = "MacBook";
	   Assert.assertEquals(expectedMcBookTxtOnChart, actualMcBookTxtOnChart);
	   String actualMcBookAirTextOnChart = laptopNotebooksPageObject.getMcBookAirTextFromChart();
	   String expectedMcBookAirTxtOnChart = "MacBook Air";
	   Assert.assertEquals(expectedMcBookAirTxtOnChart, actualMcBookAirTextOnChart);
	   logger.info("User saw the product comparison chart successfully");
	}
	
	//Scenario: Adding an item to Wish list 
	
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopNotebooksPageObject.clickOnHeartIconSonyVaIO();
		logger.info("User clicked on Heart Icon for adding Sony VaIO to wish list successfully");
	}

	@Then("User should get a message  for SonyVAIO {string}")
	public void user_should_get_a_message_for_sony_vaio(String string) {
		String mssgeForSonyVaIOWishList = laptopNotebooksPageObject.getMssgForSonyVaIOWishListClick();
		String actualMsgForSonyVioWishListAfterSbString = mssgeForSonyVaIOWishList.substring(0, 72);
		String expectedMssgeForSonyVaIOWishList = "You must login or create an account to save Sony VAIO to your wish list!";
		Assert.assertEquals(expectedMssgeForSonyVaIOWishList, actualMsgForSonyVioWishListAfterSbString);
		logger.info("User saw the message for Sony VaIO Wish List successfully");
	   
	}
	//Scenario: Validate the price of MacBook Pro is 2000 
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopNotebooksPageObject.clickOnMacBookProItem();
		logger.info("User clicked on MacBook Pro item successfully");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		String actualMacBookProPriceTag = laptopNotebooksPageObject.getMacBookProPriceTag();
		String expectedMacBookProPriceTag = "$2,000.00";
		Assert.assertEquals(expectedMacBookProPriceTag, actualMacBookProPriceTag);
		logger.info("User saw the $2,000.00 price tag for MacBook Pro sucessfully");
	}



}
