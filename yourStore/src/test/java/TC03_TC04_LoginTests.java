import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TC03_TC04_LoginTests extends BaseTest {

    @Test
    public void successfulLogin() {
        loginPage.login("tesztelek21@mail.com", "Elek21");

        assertThat(driver.getTitle()).isEqualTo("My Account");
    }

    @Test
    public void unsuccessfulLogin() {
        loginPage.login("tesztelek21mail.com", "Elek21");

        assertThat(loginPage.getWarningNoMatchForEmail().getText())
                .isEqualTo("Warning: No match for E-Mail Address and/or Password.");
    }
}
