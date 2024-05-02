package web_ui.takealot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web_ui.SeleniumWraper;

public class SearchListingPage extends SeleniumWraper {

    private By volkanoHeadphonesLocator = By.xpath("//a[@class = 'product-anchor product-card-module_product-anchor_TUCBV' and @title = 'Volkano Bluetooth Headphones - Cosmic Series - Red']");
    private By modalLocator = By.xpath("//div[@class = 'ab-in-app-message  ab-background ab-modal-interactions ab-modal ab-centered']");
    private By closeModalLocator = By.xpath("//button[contains(text(), 'NOT NOW')]");

    public SearchListingPage(WebDriver driver) {
        super(driver);
    }

    public void goToVolkanoDetailsPage() {
        click(volkanoHeadphonesLocator);
        dismissModal(modalLocator, closeModalLocator);
    }

    public void goToNextWindow(){
        for (String handle : getHandles()){
            if (handle.equals(getHandles().get(1))){
                driver.switchTo().window(handle);
            }
        }
    }


}
