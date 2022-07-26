package page.objects;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject (){
		
		PageFactory.initElements(driver, this);
	}
	
	//Scenario: User verify all items are present in Desktops tab
    @FindBy (xpath = "//a[text()='Desktops']")
    private WebElement desktopButtonLink;
    
    @FindBy (xpath = "//a[text() = 'Show All Desktops']")
    private WebElement showAllDesktopsLink;
    
    @FindBy (tagName = "img")
    private List<WebElement> allDestktopItemslist;
    
    public void clickonDesktopButtone() {
    	desktopButtonLink.click();
    }
    
    public void clickonShowAllDesktops() {
    	showAllDesktopsLink.click();
    }
    
    public List<WebElement> returnAllDesktopItemsList() {
    	List<WebElement> allDeskItems = allDestktopItemslist;
    	return allDeskItems;
    }
    
    //Scenario: User add HP LP 3065  from Desktops tab to the cart
    @FindBy (xpath = "//button[contains(@onclick, '47')]//child::i[@class='fa fa-shopping-cart']")
    private WebElement addtoCartButtonHPLP3065;
    
    @FindBy (xpath = "//input[@name='quantity']" )
    private WebElement quanitityinputfield;
    
    @FindBy (xpath = "//button[@id='button-cart']")
    private WebElement addToCartAfterQty;
    
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessageHPLP3065;
    
    public void clickOnaddToCartHPLP3065BeforeQty() {
    	addtoCartButtonHPLP3065.click();
    }
    
    public void selectQtyHPLP3065(String quantity) {
    	quanitityinputfield.clear();
    	quanitityinputfield.sendKeys(quantity);
    }
    
    public void clickonAddtoCartafterQty() {
    	addToCartAfterQty.click();
    }
    
    public String getSuccesstextHPLP3065 () {
    	String successMsg = successMessageHPLP3065.getText();
    	return successMsg;
    }
    //Scenario: User add Canon EOS 5D from Desktops tab to the cart
    @FindBy (xpath = "//button[contains(@onclick, '30')]//child::i[@class='fa fa-shopping-cart']")
    private WebElement canonEOS5DAddToCart;
    
    @FindBy (xpath = "//select[@id='input-option226']")
    private WebElement availableOptDropDown;
    
    @FindBy (xpath = "//option[@value='15']")
    private WebElement redColorOption;
    
    @FindBy (xpath = "//input[@name='quantity']")
    private WebElement cameraQtyField;
    
    @FindBy (xpath = "//button[text()='Add to Cart']")
    private WebElement cameraAddToCartAfterQty;
    
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement cameraSuccessMsg;
    
    public void clickonAddToCartCanonEOS5D() {
    	canonEOS5DAddToCart.click();
    }
    
    public void clickonAvailableOptionCanonEOS5D() {
    	availableOptDropDown.click();
    }
    
    public void clickonRedOptionforCanonEOS5D() {
    	redColorOption.click();
    }
    
    public void clearAndSelectQTYforCanonEOS5D(String caoonQty) {
    	cameraQtyField.clear();
    	cameraQtyField.sendKeys(caoonQty);
    }
    
    public void clickonAddToCartafterQTYCaonon5D() {
    	cameraAddToCartAfterQty.click();
    }
    
    public String getSuccessTextForCanonEOS5D() {
    	String successTxtCanon5D = cameraSuccessMsg.getText();
    	return successTxtCanon5D;
    }
    
    //Scenario: User add a review to Canon EOS 5D item in Desktops tab
    
    @FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
    private WebElement canonEOS5DCameraItem;
    
    @FindBy (xpath = "//a[text() = 'Write a review']")
    private WebElement writeReviewLink;
    
    @FindBy (xpath ="//input[@id='input-name']")
    private WebElement nameFieldforReview;
    
    @FindBy (xpath = "//textarea[@id='input-review']")
    private WebElement reviewTextArea;
    
    @FindBy (xpath = "//input[@value='2']")
    private WebElement ratingValue2;
    
    @FindBy (xpath = "//button[@id='button-review']")
    private WebElement continueButtonAfterReview;

    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement thankYouTextAfterReview;

    public void clickOnCanon5DItem() {
    	canonEOS5DCameraItem.click();
    }
    
    public void clickOnWriteReviewLink() {
    	writeReviewLink.click();
    }
    
    public void addNametoReview(String yourname) {
    	nameFieldforReview.sendKeys(yourname);
    }
    
    public void addReviewText(String yourReview) {
    	reviewTextArea.sendKeys(yourReview);
    }
    
    public void selectRateValue2() {
    	ratingValue2.click();
    }
    
    public void clickonContinueAfterRating() {
    	continueButtonAfterReview.click();
    }
    
    public String getThankYouMessageAfterReview() {
    	String thankYouTextAfterRating = thankYouTextAfterReview.getText();
    	return thankYouTextAfterRating;
    }
    
    
    
    
    
    
    
    
}
