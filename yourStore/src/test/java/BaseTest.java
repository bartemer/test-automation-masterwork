import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    AddressBookPage addressBookPage;
    AddressInputPage addressInputPage;
    DesktopsListPage desktopsListPage;
    AddressesInputPage addressesInputPage;
    PasswordModificationPage passwordModificationPage;

    @BeforeAll
    public void setup() throws IOException {
        String browser;
        Properties properties = new Properties();
        InputStream propertiesStream = this.getClass().getResourceAsStream("/test.properties");
        properties.load(propertiesStream);
        browser = properties.getProperty("browser");

        if(browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);
    }

    @BeforeEach
    public void setupRegistrationPage() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        desktopsListPage = PageFactory.initElements(driver, DesktopsListPage.class);
        myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
        addressBookPage = PageFactory.initElements(driver, AddressBookPage.class);
        addressInputPage = PageFactory.initElements(driver, AddressInputPage.class);
        addressesInputPage = PageFactory.initElements(driver, AddressesInputPage.class);
        passwordModificationPage = PageFactory.initElements(driver, PasswordModificationPage.class);
    }

    @AfterAll
    public void teardown() {
        driver.quit();
    }

}

