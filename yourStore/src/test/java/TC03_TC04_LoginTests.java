import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

   @Epic("Your store webshop user using")
   @Feature("User login")
public class TC03_TC04_LoginTests extends BaseTest {

    @Story("Successful Login")
    @Description("Successful user login with valid data")
    @Test
    public void successfulLogin() {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek21");

        assertThat(driver.getTitle()).isEqualTo("My Account");
    }

    @Story("Unsuccessful Login")
    @Description("Unsuccessful user login with wrong email form")
    @Test
    public void unsuccessfulLogin() {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21mail.com", "Elek21");

        assertThat(loginPage.getWarningNoMatchForEmail().getText())
                .isEqualTo("Warning: No match for E-Mail Address and/or Password.");
    }
}
