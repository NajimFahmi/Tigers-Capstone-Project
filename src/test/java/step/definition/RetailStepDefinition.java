package step.definition;

import java.util.List;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.RetailPageObject;




public class RetailStepDefinition extends Base {
	
	
	
	RetailPageObject retailPageObject = new RetailPageObject ();
	
	//Background
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    String textfromRetailWebsite = retailPageObject.getTestEnvironmentText();
	    String expectedText = "TEST ENVIRONMENT";
	    Assert.assertEquals(expectedText, textfromRetailWebsite);
	    logger.info("Test Environment Text Was Verified Successfully");
	    
	}

	@And("User click  on MyAccount")
	public void User_click_on_my_account() {
	  retailPageObject.clickonMyAccountButton();
	  
	  logger.info("My Account Button Was Clicked Successfuly");
	}
	
   
	
	@And("User click on Login")
	public void User_click_on_login() {
	  retailPageObject.clickonLoginButton();
	 
	  logger.info("Login Button Was Clicked Successfully");
	}

    @And("User enter username {string} and password {string}")
	   public void User_enter_username_and_password(String string, String string2) {
	    retailPageObject.enterUserName("ahmadmahmood20@gmail.com");
	    retailPageObject.enterPassword("ahmadmahmood20");
	    logger.info("Username and Password Were Entered Successfuly");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObject.clickOnLoginafterEnteringUsernameandPassword();
		logger.info("Loggin Button Was Click of Entering Username and Password Successfuly");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String dashboardtext = retailPageObject.getMyAccountDashboradText();
		String expectedTextfromDashboard = "My Account";
		Assert.assertEquals(expectedTextfromDashboard, dashboardtext);
		logger.info("My Account Dashboard Text Was Verified Successfully");
	}
	
	//Scenario: Register as an Affiliate user with Cheque Payment Method
	
	@When("User click on Register for an Affiliate Account link")
	public void User_click_on_Register_for_an_Affiliate_Account_link() {
		retailPageObject.clickOnRegisterforAffiliate();
		logger.info("user clicked on register as an affiliate suceesfully");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	List <Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPageObject.enterCompanyName(data.get(0).get("company"));
	retailPageObject.enterWebsiteName(data.get(0).get("website"));
	retailPageObject.enterTaxID(data.get(0).get("taxID"));
	retailPageObject.clickonChequeRadioButton();
	retailPageObject.enterChequePayeeName(data.get(0).get("ChequePayeeName"));
	logger.info("The affiliate registeration form was filled successfully");
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.clickOnAgreementButton();
		logger.info("The agreement radio button was clicked successfully");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickOnContinueButton();
		logger.info("Continue button was clicked successfuly");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    String expectedText = "Success: Your account has been successfully updated.";
	    String actualSuccessText = retailPageObject.getSuccessText();
		Assert.assertEquals(actualSuccessText, expectedText);	
		logger.info("User saw the success message successfully");
	}
	
	//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer

	@When("User click on Edit your affiliate information link")
	public void User_click_on_Edit_your_affiliate_information_link() {
		retailPageObject.clickOnEditeAffilaiteInfo();
		logger.info("User clicked on Edit Affiliate Information Link Successfully");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.clickOnBankRadioButton();
		logger.info("User clicked on Bank Radio Button Successfully");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable bankAccountInfodataTable) {
	    List<Map<String, String>> bankData = bankAccountInfodataTable.asMaps(String.class, String.class);
	    retailPageObject.enterBankName(bankData.get(0).get("bankName"));
	    retailPageObject.enterBrunchName(bankData.get(0).get("abaNumber"));
	    retailPageObject.enterSwiftCode(bankData.get(0).get("swiftCode"));
	    retailPageObject.enterBankAccountName(bankData.get(0).get("accountName"));
	    retailPageObject.enterBankAccountNumber(bankData.get(0).get("accountNumber"));
		logger.info("User enterd bank account information successefully");
	}

	@And ("User click on Continue button after entering bank info") 
	public void User_click_on_Continue_button_after_entering_bank_info() {
		retailPageObject.clickOnContinueSubmitBankAccountInfo();
		logger.info("User clicked on continue button to submit bank info successefully");
	}
	
	@Then ("User should see a success message after entering bank info")
	public void User_should_see_a_success_message_after_entering_bank_info() {
		String expectedMessageforBankAccountInfoSubmit = retailPageObject.getSuccesMessageForBankAccountUpdate();
		String actualSuccessMessageafterBankInfoSubmit = "Success: Your account has been successfully updated.";
		Assert.assertEquals(expectedMessageforBankAccountInfoSubmit, actualSuccessMessageafterBankInfoSubmit);
		logger.info("User got the sucess message after updating the bank ifno successfully");
	}
	//Scenario: Edit your account Information
	
	@When("User click on Edit your account information link")
	public void User_click_on_Edit_your_account_information_link() {
		retailPageObject.clickOnEditeAccountInfoLink();
		logger.info("User clicked on Edit Account Info Link Succesfully");
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTableToEditeAccounInfo) {
		List<Map<String, String>> newDatatoEditAccountInfor = dataTableToEditeAccounInfo.asMaps(String.class, String.class);
		retailPageObject.editFirstName(newDatatoEditAccountInfor.get(0).get("newFirstName"));
		retailPageObject.editLastName(newDatatoEditAccountInfor.get(0).get("newLastName"));
		retailPageObject.editEmailAddress(newDatatoEditAccountInfor.get(0).get("newEmail"));
		retailPageObject.editPhoneNumber(newDatatoEditAccountInfor.get(0).get("newPhoneNumber"));
	 logger.info("User modified the Information Successfully");
	}

	@And("User click on continue button after editing account info")
	public void user_click_on_continue_button_after_editing_account_info() {
		retailPageObject.clickOnContinueToEditAccountInfo();
		logger.info("User clicked on continue button after editing account info successfully");
	}

	@Then("User should see a success message {string}")
	public void User_should_see_a_message(String string) {
		 String expectedSuccessforAccountInfo = retailPageObject.getSuccessTextAfterAccountInfoEdit();
		String actualSuccessforAccountInfo = "Success: Your account has been successfully updated.";
	    Assert.assertEquals(expectedSuccessforAccountInfo, actualSuccessforAccountInfo);
	    logger.info("User got the success message after editing account info successfully");
	}

	
}
