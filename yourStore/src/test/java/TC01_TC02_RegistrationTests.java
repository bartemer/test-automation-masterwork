import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("User registration")
    public class TC01_TC02_RegistrationTests extends BaseTest {

    String email = "tesztelek" + ((int) (Math.random() * 10000)) + "@mail.com";

    @Story("Successful Registration")
    @Description("Successful user account registration with valid data")
    @Test
    public void successfulRegister() {
        homePage.open();
        registrationPage.open();
        registrationPage.register("Elek", "Teszt", email, "06202342340",
                "Elek41", "Elek41");

        assertThat(driver.getTitle()).isEqualTo("Your Account Has Been Created!");
    }

    @Story("Unsuccessful Registration")
    @Description("Unsuccessful user account registration with existing email address")
    @Test
    public void unsuccessfulRegister() {
        homePage.open();
        registrationPage.open();
        registrationPage.register("Elek", "Teszt", "tesztelek21@mail.com", "06202342340",
                "Elek31", "Elek31");

        assertThat(registrationPage.getWarningAlreadyRegisteredEmail().getText())
                .isEqualTo("Warning: E-Mail Address is already registered!");
    }
}

