import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.assertj.core.api.Assertions.*;

    @Epic("Your store webshop user using")
    @Feature("Input repetitiv data")
public class TC09_RepetitivDataInputTest extends BaseTest {

    @Story("Add more address to user")
    @Description("Add more new addresses to an existing user account from an external file")
    @ParameterizedTest
    @CsvFileSource(resources = "/addresses.csv", numLinesToSkip = 1)
    public void addNewAddresses(String firstName, String lastName, String address, String city, String postcode, String country) {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek@mail.com", "Elek31");
        myAccountPage.open();
        myAccountPage.goToAddressBook();
        addressBookPage.open();
        addressBookPage.goToNewAddressLink();

        addressesInputPage.addNewAddresses(firstName, lastName, address, city, postcode, country);

        assertThat(addressesInputPage.getSuccessMessage().getText())
                .isEqualTo("Your address has been successfully added");
    }
}
