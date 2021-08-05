import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC05_UsingPrivacyStatementTest extends BaseTest {

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
