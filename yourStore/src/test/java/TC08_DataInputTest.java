import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;


public class TC08_DataInputTest extends BaseTest{

    @Test
    @Feature()
    public void addNewAddress() {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek31");
        myAccountPage.open();
        myAccountPage.goToAddressBook();
        addressBookPage.open();
        addressBookPage.goToNewAddressLink();

        addressInputPage.addNewAddress("Elek", "Teszt", "Egyenes ter 7", "Budapest",
                "1143", "Hungary");

        assertThat(addressInputPage.getSuccessMessage().getText())
                .isEqualTo("Your address has been successfully added");
    }
}

