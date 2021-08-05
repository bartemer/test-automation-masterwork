package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage{

        String baseURL = "http://test-automation-shop2.greenfox.academy/index.php?route=account/address";

        @FindBy(linkText = "New Address")
        WebElement addNewAddressLink;

    public AddressBookPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
            driver.get(baseURL);
        }

        public void goToNewAddressLink() {
            addNewAddressLink.click();
        }

    public void goToAddressInputPage() {
        return;
    }
}

