import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class
TC13_LogoutTest extends BaseTest {

    @Test
    public void deletingAddress(){
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek31");
        myAccountPage.open();

        myAccountPage.getLogoutButton.click();

        assertThat(driver.getTitle()).isEqualTo("Account Logout");
    }
}

