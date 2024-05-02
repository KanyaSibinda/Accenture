package web_ui_tests.takealot_tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import web_ui_tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class TakealotTests extends BaseTest {

    @Test
    public void validateThatItemIsSuccessfulyAddedToBasket() {
        applications.shopLandingPage.goToTakealot();
        applications.shopLandingPage.searchForItem("Volkano Bluetooth Headphones - Cosmic Series - Red");
        applications.searchListingPage.goToVolkanoDetailsPage();
        applications.searchListingPage.goToNextWindow();
        applications.productDetailsPage.addItemToBasket();
        applications.productDetailsPage.goToCart();
        boolean itemInCart = applications.cartPage.checkIfItemAddedToCart("Volkano Bluetooth Headphones - Cosmic Series - Red");
        Assert.assertTrue(itemInCart);
    }
}
