package web_ui.takealot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web_ui.SeleniumWraper;

public class CartPage extends SeleniumWraper {

    private By itemLocator = By.xpath("//div[@class = 'cell cart-item-module_title-cell_1MHmD']");
    private By modalLocator = By.xpath("//div[@class = 'ab-in-app-message  ab-background ab-modal-interactions ab-modal ab-centered']");
    private By closeModalLocator = By.xpath("//button[contains(text(), 'NOT NOW')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getName(){
        return getText(itemLocator);
    }
    public boolean checkIfItemAddedToCart(String str) {
        dismissModal(modalLocator, closeModalLocator);
        boolean outcome;
        if (getText(itemLocator).equals(str)) {
            outcome = true;
        } else {
            outcome = false;
        }
        return outcome;
    }
}
