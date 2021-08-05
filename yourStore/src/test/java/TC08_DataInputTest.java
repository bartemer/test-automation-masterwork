import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TC08_DataInputTest extends BaseTest{

    @Test
    public void addNewAddress() {
        homePage.open();
        loginPage.open();
        loginPage.login("teszteszter@mail.com", "Eszter31");
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

