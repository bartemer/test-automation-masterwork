import Pages.AddressesInputPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.assertj.core.api.Assertions.*;

    @Epic("Your store webshop user using")
    @Feature("Input repetitiv data")
    @Story("Add more address to user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TC09_RepetitivDataInputTest extends BaseTest {

    @Description("Add more new addresses to an existing user account from an external file")
    @ParameterizedTest
    @CsvFileSource(resources = "/addresses.csv", numLinesToSkip = 1)

    public void addNewAddresses(String firstName, String lastName, String address, String city, String postcode, String country) {

        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek21");
        myAccountPage.open();
        myAccountPage.goToAddressBook();
        addressBookPage.open();
        addressBookPage.goToNewAddressLink();

        addressesInputPage.addNewAddresses(firstName, lastName, address, city, postcode, country);

        assertThat(addressInputPage.getSuccessMessage().isDisplayed()).isTrue();
    }
}
