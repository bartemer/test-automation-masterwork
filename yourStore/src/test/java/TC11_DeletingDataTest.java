import static org.assertj.core.api.Assertions.*;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("Data handling")
public class TC11_DeletingDataTest extends BaseTest{

    @Story("Address delete from user account")
    @Description("Address delete from a registered user account")
    @Test
    public void deletingAddress(){
        homePage.open();
        loginPage.open();
        loginPage.login("tesztelek21@mail.com", "Elek31");
        myAccountPage.open();

        myAccountPage.goToAddressBook();
        assertThat(driver.getTitle()).isEqualTo("Address Book");

        addressInputPage.getDeleteButton().click();
        assertThat(addressInputPage.getDeletingSuccessMessage().getText())
                .isEqualTo("Your address has been successfully deleted");
    }
}
