import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TC07_PaginationTest extends BaseTest {

    @Test
    public void goTo2ndPage() {
        homePage.open();
        desktopsListPage.open();
        desktopsListPage.getGoToNextPageButton().click();

        assertThat(driver.getCurrentUrl()).isEqualTo("http://test-automation-shop2.greenfox.academy/desktops?page=2");
    }

}