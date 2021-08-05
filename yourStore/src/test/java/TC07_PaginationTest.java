import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("Data listing")
public class TC07_PaginationTest extends BaseTest {

    @Story("Listing more products using pagination")
    @Description("Listing all products available in webshop using pagination")
    @Test
    public void goTo2ndPage() {
        homePage.open();
        desktopsListPage.open();
        desktopsListPage.getGoToNextPageButton().click();

        assertThat(driver.getCurrentUrl()).isEqualTo("http://test-automation-shop2.greenfox.academy/desktops?page=2");
    }

}