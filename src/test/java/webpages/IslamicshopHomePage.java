package webpages;

import org.openqa.selenium.By;

public class IslamicshopHomePage extends BasePage {
private By SPECIALOFFER = By.xpath("//a[contains(text(),'স্পেশাল অফার !')]");

public void clickOnSpecialOffer(){
	clickOnElement(SPECIALOFFER);
}

}
