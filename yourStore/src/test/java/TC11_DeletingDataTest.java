import Pages.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class TC11_DeletingDataTest extends BaseTest{

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
