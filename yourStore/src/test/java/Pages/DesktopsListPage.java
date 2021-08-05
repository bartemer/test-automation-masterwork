package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DesktopsListPage extends BasePage {
    String baseURL = "http://test-automation-shop2.greenfox.academy/desktops";

    @FindBy(xpath = "//*[@id=\"input-sort\"]/option[1]")
    WebElement sortByDefault;

    @FindBy(xpath = "//*[@id=\"content\"]/div[5]/div[1]/ul/li[3]/a")
    WebElement goToNextPageButton;

    @FindBy(tagName = "h4")
    List <WebElement> elements;

    public DesktopsListPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }

    public WebElement getSortByDefault() {
        return sortByDefault;
    }

    public WebElement getGoToNextPageButton() {
        return goToNextPageButton;
    }

    public List<WebElement> getListOfProducts() {
        return driver
                .findElements(By.xpath("//*[@id=\"content\"]/div[4]/div[*]/div/div[2]/div[1]/h4/a"));
    }

    public List<WebElement> getElements() {
        return elements;
    }


    public void saveDesktopProductsName() {

        String file = "src/test/resources/listOfDesktopProducts.txt";
        Path filePath = Paths
                .get(file);

        List<String> productsList = new ArrayList<>();

        try {
            Files.write(filePath, productsList);
        } catch (IOException e) {
            System.out.println("Cannot write the file");
        }
        for (WebElement eachProduct : getListOfProducts()) {
            productsList.add(eachProduct.getText());
        }
        try {
            Files.write(filePath, productsList);
        } catch (IOException e) {
            System.out.println("Cannot write the file");
        }
    }

}

