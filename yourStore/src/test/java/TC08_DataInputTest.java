import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("Input New Data")
public class TC08_DataInputTest extends BaseTest{

    @Story("Add a new address to user")
    @Description("Add a new address to a registered user")
    @Test
    public void addNewAddress() {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek21");
        myAccountPage.open();
        myAccountPage.goToAddressBook();
        addressBookPage.open();
        addressBookPage.goToNewAddressLink();

        addressInputPage.addNewAddress("Elek", "Teszt", "Egyenes ter 7", "Budapest",
                "1143", "Hungary");

        assertThat(addressInputPage.getSuccessMessage().isDisplayed()).isTrue();
    }
}

