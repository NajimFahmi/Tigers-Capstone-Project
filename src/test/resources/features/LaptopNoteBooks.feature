@AllinOne
Feature: Laptop & NoteBooks
@LaptopsAndNotebooks
Scenario: Add and Remove a Mac book from Cart 
Given User is on Retail website
When User click on Laptop & NoteBook tab 
And User click on Show all Laptop &NoteBook option
And User click on MacBook  item 
And User click add to Cart button for MacBook
Then User should see a message for MacBook 'Success: You have added MacBook to your shopping cart!'
And User should see 1 item(s)-602.00showed to the cart 
And User click on cart option 
And user click on red X button to remove the item from cart
Then item should be removed and cart should show 0 item(s)
@LaptopsAndNotebooks
Scenario: Product Comparison 
Given User is on Retail website
When User click on Laptop & NoteBook tab 
And User click on Show all Laptop &NoteBook option 
When User click on product comparison icon on onMacbk 'MacBook'
And User click on product comparison icon on MacBookAir 'MacBook Air'
Then User should see a message for MacBookAir 'Success: You have added MacBook Air to your product comparison!'
And User click on Product comparison link 
Then User should see Product Comparison Chart
@LaptopsAndNotebooks
Scenario: Adding an item to Wish list   
Given User is on Retail website
When User click on Laptop & NoteBook tab 
And User click on Show all Laptop &NoteBook option 
And User click on heart icon to add 'Sony VaIO' laptop to wish list 
Then User should get a message  for SonyVAIO 'You must login or create an account to save Sony VAIO to your wish list!'

@LaptopsAndNotebooks
Scenario: Validate the price of MacBook Pro is 2000   
Given User is on Retail website 
When User click on Laptop & NoteBook tab 
And User click on Show all Laptop &NoteBook option 
And User click on 'MacBook Pro' item 
Then User should see  '$2,000.00' price tag is present on UI.





