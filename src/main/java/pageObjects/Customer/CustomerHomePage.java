package pageObjects.Customer;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHomePage {

    WebDriver driver;

    public CustomerHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@class,'user_menu')]/li[1]/a")
    private WebElement userOptions;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/account/logout/']")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@class='RTL']")
    private WebElement homePageHeader;

    @FindBy(xpath = "//a[@href='#profile']")
    private WebElement myProfile;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(xpath = "//form[@id='profilefrm']//button")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successfulAlertMessage;

    public void logout() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userOptions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutButton);
    }

    public void validateNameInNavigation(String name) {

        Assert.assertTrue(homePageHeader.getText().contains(name));
    }

    public void updateUserProfile(String phoneNumber) {
        myProfile.click();
        phone.clear();
        phone.sendKeys(phoneNumber);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        submitButton.click();
    }

    public void validateUpdatePhone() {
        Assert.assertTrue(successfulAlertMessage.isDisplayed());
    }
}
