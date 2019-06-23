package pageObjects.Customer;

import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CustomerLoginPage {
    public WebDriver driver;
    ConfigFileReader objConfigFileReader = new ConfigFileReader();

    public CustomerLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//form[@id='loginfrm']//button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id='li_myaccount']/a")
    WebElement myAccountButton;

    @FindBy(xpath = "//a[@href='https://www.phptravels.net/login']")
    WebElement getLoginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    WebElement loginErrorMessage;

    public void navigateToHomePage(){
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.get(objConfigFileReader.getcustomerUrl());
    }

    public CustomerHomePage Login() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", myAccountButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getLoginButton);
        emailInput.sendKeys(objConfigFileReader.getCustomerUsername());
        passwordInput.sendKeys(objConfigFileReader.getCustomerPassword());
        loginButton.click();
        return new CustomerHomePage(driver);
    }

    public void invalidLogin() {

        Assert.assertEquals(loginErrorMessage.getText(), "Invalid Email or Password");
    }

}
