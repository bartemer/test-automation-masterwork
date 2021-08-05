import Pages.*;
import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

    @Epic("Your store webshop user using")
    @Feature("Data handling")
public class TC10_ExistingDataModification extends BaseTest{

    @Story("Change login password")
    @Description("Change successfully the login password for a registered user")
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
