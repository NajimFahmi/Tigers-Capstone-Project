@AllinOne
Feature: Login to Retail Website 

Background: 

Given User is on Retail website
And User click  on MyAccount
And User click on Login
And User enter username 'username' and password 'password'
And User click on Login button
Then User should be logged in to MyAccount dashboard

@RetailLoginTest

 Scenario: Register as an Affiliate user with Cheque Payment Method
 When User click on Register for an Affiliate Account link 
 And User fill affiliate form with below information
 |company|website|taxID|paymentMethod|ChequePayeeName|
 |Tek-School|tek-School.com|412412|Cheque|Ahmad|
 And User check on About us check box 
 And User click on Continue button 
 Then User should see a success message
 
 @RetailLoginTest
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link
 And user click on Bank Transfer radio button
 And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|abc|123123|15220|ahmadMahmood|1111220003334444|
 And User click on Continue button after entering bank info
 Then User should see a success message after entering bank info
 @RetailLoginTest
 Scenario: Edit your account Information 
 When User click on Edit your account information link
 And User modify below information 
 |newFirstName|newLastName|newEmail|newPhoneNumber|
 |Farid|Sharifi|farid07@gmail.com|38888243455|
 And User click on continue button after editing account info
Then User should see a success message 'Success: Your account has been successfully updated.'
 