package page.objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject () {
		
		PageFactory.initElements(driver, this);
	}
	
	//Background
	@FindBy (xpath = "//a[text() = 'TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy (xpath = "//span[text()='My Account']")
	private WebElement myaccountButton;
	
	@FindBy (xpath = "//li//a[text()='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//div[@class='form-group']//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy (xpath = "//input[@id = 'input-password']")
	private WebElement passwordField;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement submitLogin;
	
	@FindBy (xpath = "//h2[text() = 'My Account']")
	private WebElement myAccountPageDashboard;
	
	
	public String getTestEnvironmentText () {
		String textfromUI = testEnvironmentText.getText();
		return textfromUI;
	}
	
	public void clickonMyAccountButton () {
		myaccountButton.click();
	}
	
	public void clickonLoginButton() {
		loginButton.click();
	}
	
	public void enterUserName(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword (String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginafterEnteringUsernameandPassword () {
		submitLogin.click();
	}
	public String getMyAccountDashboradText () {
		String dashboardText = myAccountPageDashboard.getText();
		return dashboardText;
	}
	
	//Scenario: Register as an Affiliate user with Cheque Payment Method
	@FindBy (xpath = "//a[text() = 'Register for an affiliate account']")
	private WebElement rigisterLink;
	
	@FindBy (xpath = "//input[@id='input-company']")
	private WebElement companyNameField;
	
	@FindBy (xpath = "//input[@name='website']")
	private WebElement websiteField;
	
	@FindBy (xpath = "//input[@id='input-tax']")
	private WebElement taxField;
	
	@FindBy (xpath = "//input[@value='cheque']")
	private WebElement chequeRadioButton;
	
	@FindBy (xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeNameField;
	
	@FindBy (xpath = "//input[@name='agree']")
	private WebElement agreementtoAboutUs;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	public void clickOnRegisterforAffiliate () {
		rigisterLink.click();
	}
	public void enterCompanyName (String companyname) {
		companyNameField.sendKeys(companyname);
	}
	
	public void enterWebsiteName (String websiteName) {
		websiteField.sendKeys(websiteName);
	}
	public void clickonChequeRadioButton () {
		chequeRadioButton.click();
	}
	
	public void enterTaxID (String taxID) {
		taxField.sendKeys(taxID);
	}
	
	public void enterChequePayeeName (String chequePayeeName) {
	chequePayeeNameField.sendKeys(chequePayeeName);
	}
	public void clickOnAgreementButton () {
		agreementtoAboutUs.click();
	}
	public void clickOnContinueButton () {
		continueButton.click();
	}
	public String getSuccessText() {
		String actualSuccessText = successMessage.getText();
		return	actualSuccessText;
		
	}
	//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	@FindBy (xpath = "//a[text() = 'Edit your affiliate information']")
	private WebElement editAffiliateInformationLink;
	
	@FindBy (xpath = "//input[@value='bank']")
	private WebElement bankRadioButton;
	
	@FindBy (xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;
	
	@FindBy (xpath ="//input[@name='bank_branch_number']")
	private WebElement branchNumberField;
	
	@FindBy (id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	
	@FindBy (id ="input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy (id = "input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy (xpath = "//div//input[@type='submit']")
	private WebElement continueSubmitBankAccountInfo;
	
	@FindBy (xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessageBankAccountUpdate;
	
	public void clickOnEditeAffilaiteInfo() {
		editAffiliateInformationLink.click();
	}
	
	public void clickOnBankRadioButton() {
		bankRadioButton.click();
	}	
	public void enterBankName(String bankName) {
			bankNameField.sendKeys(bankName);
	}
	public void enterBrunchName (String brunchName) {
		branchNumberField.sendKeys(brunchName);
	}
	public void enterSwiftCode (String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}
	public void enterBankAccountName (String bankAccountName) {
		accountNameField.sendKeys(bankAccountName);
	}
	
	public void enterBankAccountNumber (String bankAccountNumber) {
		accountNumberField.sendKeys(bankAccountNumber);
	}
	public void clickOnContinueSubmitBankAccountInfo() {
		continueSubmitBankAccountInfo.click();
	}
	public String getSuccesMessageForBankAccountUpdate() {
		String actualSuccessMessageforBankAccount = successMessageBankAccountUpdate.getText();
		return actualSuccessMessageforBankAccount;
	}
	//Scenario: Edit your account Information
	
	@FindBy (xpath ="//li//a[text()='Edit your account information']")
	private WebElement editAccountInfoLink;
	
	@FindBy (xpath ="//input[@id='input-firstname']")
	private WebElement firstNameEditField;
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lastNameEditField;
	
	@FindBy (xpath ="//input[@id='input-email']")
	private WebElement emailAddressEditField;
	
	@FindBy (id="input-telephone")
	private WebElement phoneNumberEditField;
	
	@FindBy (xpath= "//input[@type='submit']")
	private WebElement continueBttntoEditAccountInfo;
	
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMssgAfterAccountInfoEdit;
	
	
	public void clickOnEditeAccountInfoLink() {
		editAccountInfoLink.click();
	}
	
	public void editFirstName(String newFirstName) {
		firstNameEditField.clear();
		firstNameEditField.sendKeys(newFirstName);
	}
	
	public void editLastName (String newLastName) {
		lastNameEditField.clear();
		lastNameEditField.sendKeys(newLastName);
	}
	
	public void editEmailAddress(String newEmailAddress) {
		emailAddressEditField.clear();
		emailAddressEditField.sendKeys(newEmailAddress);
	}
	public void editPhoneNumber (String newPhoneNumber) {
		phoneNumberEditField.clear();
		phoneNumberEditField.sendKeys(newPhoneNumber);
	}
	
	public void clickOnContinueToEditAccountInfo() {
	continueBttntoEditAccountInfo.click();
	}
	public String getSuccessTextAfterAccountInfoEdit() {
		String expectedSuccessAccountInfoEdit = successMssgAfterAccountInfoEdit.getText();{
			return expectedSuccessAccountInfoEdit;
		}
	}
	
} 
