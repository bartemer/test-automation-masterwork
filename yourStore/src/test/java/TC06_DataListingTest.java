import static org.assertj.core.api.Assertions.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

    @Epic("Your store webshop user using")
    @Feature("Data listing")
public class TC06_DataListingTest extends BaseTest {

    @Story("Listing all products")
    @Description("Listing all products available in webshop, in a default mode")
    @Test
    public void listingDesktopsProducts() {
        homePage.open();
        desktopsListPage.open();

        assertThat(desktopsListPage.getSortByDefault());

    }
}


