package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AddressInputPage extends BasePage {

    String baseURL = "http://test-automation-shop2.greenfox.academy/index.php?route=account/address/add";

    public AddressInputPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseURL);
    }

    @FindBy(linkText = "New Address")
    public WebElement newAddressButton;

    @FindBy(id = "input-firstname")
    WebElement firstnameInputField;

    @FindBy(id = "input-lastname")
    WebElement lastnameInputField;

    @FindBy(id = "input-address-1")
    WebElement addressInputField;

    @FindBy(id = "input-city")
    WebElement cityInputField;

    @FindBy(id = "input-postcode")
    WebElement postcodeInputField;

    @FindBy(id = "input-country")
    WebElement countryToSelect;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"account-address\"]/div[1]/text()")
    WebElement successMessage;

    @FindBy(xpath = "//tbody/tr[3]/td[2]/a[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='account-address']/div[1]")
    WebElement deletingSuccessMessage;

    public void addNewAddress(String firstName, String lastName, String address, String city, String postcode, String country) {
        firstnameInputField.sendKeys(firstName);
        lastnameInputField.sendKeys(lastName);
        addressInputField.sendKeys(address);
        cityInputField.sendKeys(city);
        postcodeInputField.sendKeys(postcode);
        Select selectCountry = new Select(driver.findElement(By.id("input-country")));
        selectCountry.selectByVisibleText(country);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getDeletingSuccessMessage() {
        return deletingSuccessMessage;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }
}
