package webtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import utilities.DriverSetup;
import webpages.IslamicshopHomePage;
import webpages.ParticularBook;
import webpages.PlaceorderPage;
import webpages.SpecialOfferPage;


public class TestExecution extends DriverSetup {
	IslamicshopHomePage islamicshopHomePage = new IslamicshopHomePage();
	SpecialOfferPage specialOfferPage = new SpecialOfferPage();
	ParticularBook particularBook = new ParticularBook();
	PlaceorderPage placeorderPage = new PlaceorderPage();
	
	@Test(priority = 0, description = "Home Page Loading Test with base URL")
	@Description("Test Description: Load website with base URL and maximize the window")
	public void testHomePageUrl() {
		getDriver().get("https://islamicshopdk.com");
		assertEquals(getDriver().getCurrentUrl(), "https://islamicshopdk.com/");
		islamicshopHomePage.takeScreenShot("HomePage");
	}
	@Test
	public void testHomePageTitle() {
		getDriver().get("https://islamicshopdk.com");
		assertEquals(getDriver().getTitle(), "Buy Islamic Books Online Bangladesh | Islamic Shop Dhaka | Online book store inBangladesh");	
		islamicshopHomePage.takeScreenShot("HomePage1");
	}
	
	
	
	
	
	@Test
	public void PurchaseBook() throws InterruptedException {
		getDriver().get("https://islamicshopdk.com");
		islamicshopHomePage.clickOnSpecialOffer();
	    specialOfferPage.scrollDown();
	    specialOfferPage.scrollUp();
	    Thread.sleep(300);
		specialOfferPage.clickOnBook();
		particularBook.buyBook();
		placeorderPage.provideName("shihab");
		placeorderPage.provideMobile("01760000000");
		placeorderPage.clickOnPlaceOrder();
	    
	}

}
