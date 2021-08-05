import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("Logout")

public class TC13_LogoutTest extends BaseTest {
    @Story("Logout of use")
    @Description("Successful logout of the user, after login.")
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

