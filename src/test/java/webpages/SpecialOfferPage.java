package webpages;

import org.openqa.selenium.By;

public class SpecialOfferPage extends BasePage {
	private By QURANTHEKENEOA = By.cssSelector("li[class='layout-v2 product-thumbnails-vertical product-add-to-cart-ajax product-tabs-under-summary product type-product post-36456 status-publish instock product_cat-cyclone product_cat-flash product_cat-islamic_sahitto product_cat-sottayonprokashon product_tag-quran-theke-neya-jiboner-path product_tag-6776 has-post-thumbnail sale shipping-taxable purchasable product-type-simple woovr-active woovr-show-price'] div[class='product-summary'] a[class='woocommerce-LoopProduct-link woocommerce-loop-product__link']");

	
	public void clickOnBook() {
		clickOnElement(QURANTHEKENEOA);
	}
}
