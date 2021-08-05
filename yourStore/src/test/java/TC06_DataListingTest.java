import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TC06_DataListingTest extends BaseTest {

    @Test
    public void listingDesktopsProducts() {
        homePage.open();
        desktopsListPage.open();

        assertThat(desktopsListPage.getSortByDefault());

    }
}


