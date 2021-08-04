package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    String baseURL = "http://test-automation-shop2.greenfox.academy/index.php?route=account/login";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }

    @FindBy(id = "input-email")
    WebElement emailInputField;

    @FindBy(id = "input-password")
    WebElement passwordInputField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
    WebElement warningNoMatchForEmail;

    public void login(String email, String password) {
        emailInputField.sendKeys(email);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

    public WebElement getWarningNoMatchForEmail() {
        return warningNoMatchForEmail;
    }
}
