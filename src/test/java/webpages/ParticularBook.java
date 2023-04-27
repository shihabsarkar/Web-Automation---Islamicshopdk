package webpages;

import org.openqa.selenium.By;

public class ParticularBook extends BasePage {
	private By BUYNOW = By.xpath("//button[normalize-space()='Buy Now']");
	
	
	public void buyBook() {
		clickOnElement(BUYNOW);
	}
	

}
