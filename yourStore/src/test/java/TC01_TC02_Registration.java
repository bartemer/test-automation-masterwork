import Pages.HomePage;
import Pages.RegistrationPage;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class TC01_TC02_Registration extends BaseTest {
    HomePage homePage;
    RegistrationPage registrationPage;
    String email = "tesztelek" + ((int) (Math.random() * 10000)) + "@mail.com";

    @BeforeEach
    public void setupRegistrationPage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.open();
    }

    @Test
    public void successfulRegister() {
        registrationPage.register("Elek", "Teszt", email, "06202342340",
                "Elek21", "Elek21");

        assertThat(driver.getTitle()).isEqualTo("Your Account Has Been Created!");
    }

    @Test
    public void unsuccessfulRegister() {
        registrationPage.register("Elek", "Teszt", "tesztelek@mail.com", "06202342340",
                "Elek21", "Elek21");

        assertThat(registrationPage.getWarningAlreadyRegisteredEmail().getText())
                .isEqualTo("Warning: E-Mail Address is already registered!");
    }
}

