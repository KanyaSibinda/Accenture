package web_ui.takealot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web_ui.SeleniumWraper;

public class ShopLandingPage extends SeleniumWraper {

    private By searchFieldLocator = By.xpath("//input[@name = 'search']");
    private By searchButtonLocator = By.xpath("//button[@class = 'button search-btn search-icon']");

    public ShopLandingPage(WebDriver driver) {
        super(driver);
    }

    public void goToTakealot() {
        goToWebsite("https://www.takealot.com/");
    }

    public void searchForItem(String itemName) {
        click(searchFieldLocator);
        sendKeys(searchFieldLocator, itemName);
        click(searchButtonLocator);
    }
}
