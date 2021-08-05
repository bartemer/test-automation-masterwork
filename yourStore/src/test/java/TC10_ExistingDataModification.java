import Pages.*;
import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TC10_ExistingDataModification extends BaseTest{

    @Test
    public void loginPasswordChangeSuccessful() {
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek31");
        myAccountPage.open();

        myAccountPage.passwordChangeLink.click();
        assertThat(driver.getTitle()).isEqualTo("Change Password");

        passwordModificationPage.submitNewPassword("Elek21", "Elek21");
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]"));
        Assertions.assertThat(successMessage.getText())
                .isEqualTo("Success: Your password has been successfully updated.");

    }
}
