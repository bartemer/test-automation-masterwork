import org.junit.jupiter.api.Test;

public class TC12_SavingDataFromApplication extends BaseTest{

      @Test
      public void savingProductsName() {
            homePage.open();
            desktopsListPage.open();

            desktopsListPage.saveDesktopProductsName();

      }
}
