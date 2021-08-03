import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class TC03_TC04_Login extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeEach
    public void setupLoginPage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.open();
    }

    @Test
    public void successfulLogin() {
        loginPage.login("tesztelek@mail.com", "Elek31");

        assertThat(driver.getTitle()).isEqualTo("My Account");
    }

    @Test
    public void unsuccessfulLogin() {
        loginPage.login("tesztelekmail.com", "Elek31");

        assertThat(loginPage.getWarningNoMatchForEmail().getText())
                .isEqualTo("Warning: No match for E-Mail Address and/or Password.");
    }
}
