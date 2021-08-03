package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    String baseURL = "http://test-automation-shop2.greenfox.academy/";

    @FindBy(linkText = "My account")
    WebElement myAccountMenuElement;

    @FindBy(linkText = "Register")
    WebElement registerMenuElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }
}
