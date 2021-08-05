import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

      @Epic("Your store webshop user using")
      @Feature("Save data from application")
public class TC12_SavingDataFromApplication extends BaseTest{

      @Story("Save the names of the products")
      @Description("Save the names of all products into a text file")
      @Test
      public void savingProductsName() {
            homePage.open();
            desktopsListPage.open();

            desktopsListPage.saveDesktopProductsName();

      }
}
