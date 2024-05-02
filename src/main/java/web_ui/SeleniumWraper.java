package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumWraper {

    protected WebDriver driver;

    public SeleniumWraper(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findOne(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void goToWebsite(String url) {
        driver.get(url);
    }

    protected void click(By by) {
        findOne(by).click();
    }

    protected void sendKeys(By by, String str) {
        findOne(by).sendKeys(str);
    }

    protected String getText(By by) {
        return findOne(by).getText();
    }

    protected List<String> getHandles() {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowHandles);
        return list;
    }


    protected void dismissModal(By by, By closeB) {
        try {
            boolean modal = driver.findElement(by).isDisplayed();
            if (modal) {
                click(closeB);
            }
        }catch (Exception E){
            System.out.println("Encountered An Error(Related to pop Up Modal) ❌");
        }

    }
}




