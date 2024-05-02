package web_ui.takealot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web_ui.SeleniumWraper;

public class ProductDetailsPage extends SeleniumWraper {

    private By addToBasketLocator = By.xpath("//a[@class = 'button expanded add-to-cart-button-module_add-to-cart-button_1a9gT']");
    private By goToCartButton = By.xpath("//button[@class = 'button checkout-now dark']");
    private By modalLocator = By.xpath("//div[@class = 'ab-in-app-message  ab-background ab-modal-interactions ab-modal ab-centered']");
    private By closeModalLocator = By.xpath("//button[contains(text(), 'NOT NOW')]");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }



    public void addItemToBasket(){
        click(addToBasketLocator);
    }

    public void goToCart() {
        dismissModal(modalLocator, closeModalLocator);
        click(goToCartButton);


    }


}
