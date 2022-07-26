package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	
	//Scenario: Add and Remove a Mac book from Cart 
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksLink;
	
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookItemLink;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement addToCartForMacBookItem;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgAfterAddToCartForMacBook;
	
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement OneItemOnTheCartandCartOption;
	
	@FindBy (xpath = "//button[@title='Remove']")
	private WebElement removeXButton;
	
	public void clickOnLaptopsAntNotebooks() {
		laptopsAndNotebooksTab.click();
	}
	
	public void clickOnShowAllLaptopsandNotebooks() {
		showAllLaptopsAndNotebooksLink.click();
	}
	
	public void clickOnMacBookItem() {
		macBookItemLink.click();
	}
	
	public void clickOnAddToCartForMacBook() {
		addToCartForMacBookItem.click();
	}
	
	public String getSuccessTextForMacBook () {
		String successTextForMacBook = successMsgAfterAddToCartForMacBook.getText();
		return successTextForMacBook;
	}
	
	public String get1ItemOnCartText() {
		String oneItemOnCart = OneItemOnTheCartandCartOption.getText();
		return oneItemOnCart;
	}
	
	public void clickOnCartOptions() {
		OneItemOnTheCartandCartOption.click();
	}
	
	public void clickOnXToRemoveTheItem() {
		removeXButton.click();
	}
	
	public String getZeroItemOnCartText() {
		String zeroItemOnCart = OneItemOnTheCartandCartOption.getText();
		return zeroItemOnCart;
	}
	
	//Scenario: Product Comparison
	
	@FindBy(xpath = "//button[contains(@onclick, '43')]//child::i[@class='fa fa-exchange']")
	private WebElement macBookCompareLink;
	
	@FindBy (xpath ="//button[contains(@onclick, '44')]//child::i[@class='fa fa-exchange']")
	private WebElement macBookAirCompareLink;
	
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgforMcbookAirCompareLink;
	
	@FindBy (xpath ="//a[@id='compare-total']")
	private WebElement productCompareLink;
	
	@FindBy (xpath = "//td[@colspan='3']//child::strong[text()='Product Details']")
	private WebElement productDetailsOnProductComparisonChart;
	
	@FindBy (xpath ="//strong[text()='MacBook']")
	private WebElement MacBookOnProductComparisonChart;
	
	@FindBy (xpath = "//strong[text()='MacBook Air']")
	private WebElement McBookAirOnProductComparisonChart;
	
	public void clickOnPrdctComprsonForMcBk() {
		macBookCompareLink.click();
	}
	
	public void clickOnPrdctComprsonFORMCBKAir() {
		macBookAirCompareLink.click();
	}
	
	public String getSuccessTxtForMcBkAirComprson() {
		String successMsgForMCBKAirComprson = successMsgforMcbookAirCompareLink.getText();
		return successMsgForMCBKAirComprson;
	}
	
	public void clickOnProductComparisonLink() {
		productCompareLink.click();
	}
	
	public String getProductDetailsText() {
		String productDetaislTextChart = productDetailsOnProductComparisonChart.getText();
		return productDetaislTextChart;
	}
	
	public String getMcBookTextFromChart() {
		String mcBookTextinChart = MacBookOnProductComparisonChart.getText();
		return mcBookTextinChart;
	}
	
	public String getMcBookAirTextFromChart () {
		String mcBookAirTextinChart = McBookAirOnProductComparisonChart.getText();
		return mcBookAirTextinChart;
	}
	
	//Scenario: Adding an item to Wish list 
	@FindBy (xpath = "//button[contains(@onclick, '46')]//child::i[@class='fa fa-heart']")
	private WebElement heartIconForSonyVaIO;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageforWishListSonyVaIO;
	
	public void clickOnHeartIconSonyVaIO() {
		heartIconForSonyVaIO.click();
	}
	public String getMssgForSonyVaIOWishListClick() {
		String mssgYouMustLoginForSonyVaIOWishList = messageforWishListSonyVaIO.getText();
		return mssgYouMustLoginForSonyVaIOWishList;
	}
	
	//Scenario: Validate the price of MacBook Pro is 2000 
	
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	
	
	@FindBy (xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPriceTag;
	
	public void clickOnMacBookProItem() {
		macBookProItem.click();
	}
	
	public String getMacBookProPriceTag() {
		String macBookProPriceTagText = macBookProPriceTag.getText();
		return macBookProPriceTagText;
	}
	
	
	
	
	
}
