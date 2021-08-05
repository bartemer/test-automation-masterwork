import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TC01_TC02_RegistrationTests extends BaseTest {

    String email = "tesztelek" + ((int) (Math.random() * 10000)) + "@mail.com";

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

