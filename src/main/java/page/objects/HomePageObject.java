package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currencyDropDown;
	
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement euroCurrencyButton;
	
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement euroCurrencyValueCharacter;
	
	public void clickOnCurrencyButton() {
		currencyDropDown.click();
	}
	public void clickOnEuroCurrencyButton() {
		euroCurrencyButton.click();
	}
	public String getEuroSign() {
		String euroSign = euroCurrencyValueCharacter.getText();
		return euroSign;
	}
	//Scenario: User empty Shopping cart message displays 
	
	@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCart;
	
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyShoppingCartText;
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public String getEmptyCartText() {
		String emptyCartText = emptyShoppingCartText.getText();
		return emptyCartText;
	}
	
	
	
}
