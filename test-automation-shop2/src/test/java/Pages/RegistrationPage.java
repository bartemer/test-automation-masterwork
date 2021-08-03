package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    String baseURL = "http://test-automation-shop2.greenfox.academy/index.php?route=account/register";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }

    @FindBy(id = "input-firstname")
    WebElement firstnameInputField;

    @FindBy(id = "input-lastname")
    WebElement lastnameInputField;

    @FindBy(id = "input-email")
    WebElement emailInputField;

    @FindBy(id = "input-telephone")
    WebElement telephoneInputField;

    @FindBy(id = "input-password")
    WebElement passwordInputField;

    @FindBy(id = "input-confirm")
    WebElement passwordConfirmInputField;

    @FindBy(linkText = "Privacy Policy")
    WebElement privacyPolicyLink;

    @FindBy(xpath = "//*[@id=\"modal-agree\"]/div/div/div[1]/button")
    WebElement privacyPolicyWindowClose;

    @FindBy(name = "agree")
    WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"account-register\"]/div[1]")
    WebElement warningAlreadyRegisteredEmail;

    public void register(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        firstnameInputField.sendKeys(firstName);
        lastnameInputField.sendKeys(lastName);
        emailInputField.sendKeys(email);
        telephoneInputField.sendKeys(telephone);
        passwordInputField.sendKeys(password);
        passwordConfirmInputField.sendKeys(passwordConfirm);
        privacyPolicyCheckbox.click();
        continueButton.click();
    }

    public WebElement getWarningAlreadyRegisteredEmail() {
        return warningAlreadyRegisteredEmail;
    }
}
