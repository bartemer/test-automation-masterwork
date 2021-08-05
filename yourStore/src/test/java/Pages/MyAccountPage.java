package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    String baseURL = "http://test-automation-shop2.greenfox.academy/index.php?route=account/account";

    @FindBy(linkText = "Modify your address book entries")
    WebElement addressBookLink;

    @FindBy(linkText = "Change your password")
    public WebElement passwordChangeLink;

    @FindBy(linkText = "Logout")
    public WebElement getLogoutButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }

    public void goToAddressBook () {
        addressBookLink.click();
    }

}

