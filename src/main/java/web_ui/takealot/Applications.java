package web_ui.takealot;

import org.openqa.selenium.WebDriver;

public class Applications {

    public ShopLandingPage shopLandingPage;
    public SearchListingPage searchListingPage;
    public CartPage cartPage;
    public ProductDetailsPage productDetailsPage;

    public Applications(WebDriver driver) {
        shopLandingPage = new ShopLandingPage(driver);
        searchListingPage = new SearchListingPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        cartPage = new CartPage(driver);
    }
}
