package webpages;

import org.openqa.selenium.By;

public class PlaceorderPage extends BasePage {
	private By NAME = By.xpath("//input[@id='billing_first_name']");
	private By MOBILE = By.xpath("//input[@id='billing_phone']");
	private By PLACEORDER = By.cssSelector("#place_order");
	
	public void provideName(String name) {
		writeText(NAME, name);
	}
	public void provideMobile(String number) {
		writeText(MOBILE, number);
	}
	public void clickOnPlaceOrder() {
		clickOnElement(PLACEORDER);
	}

}
