package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordModificationPage extends BasePage {

    public PasswordModificationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-password")
    WebElement passwordInputField;

    @FindBy(id = "input-confirm")
    WebElement passwordConfirmInputField;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    WebElement continueButton;

    public void submitNewPassword(String password, String passwordConfirm) {
        passwordInputField.sendKeys(password);
        passwordConfirmInputField.sendKeys(passwordConfirm);
        continueButton.click();
    }
}
