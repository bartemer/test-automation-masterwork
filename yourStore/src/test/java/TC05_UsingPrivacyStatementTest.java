import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

    @Epic("Your store webshop user using")
    @Feature("User registration")
public class TC05_UsingPrivacyStatementTest extends BaseTest {

    @Story("Privacy Policy handling")
    @Description("To open and check Privacy Policy")
    @Test
    public void openAndCheckPrivacyPolicy() {
        registrationPage.open();
        registrationPage.getPrivacyPolicyLink().click();
        wait.until(ExpectedConditions.visibilityOf(registrationPage.getPrivacyPolicyWindowClose()));
        registrationPage.getPrivacyPolicyWindowClose().click();
        registrationPage.getPrivacyPolicyCheckbox().click();
        assertThat(registrationPage.getPrivacyPolicyCheckbox().isSelected()).isTrue();
    }
}
