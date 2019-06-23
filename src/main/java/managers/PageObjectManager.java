package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.Customer.CustomerHomePage;
import pageObjects.Customer.CustomerLoginPage;


public class PageObjectManager {
    private WebDriver driver;
    private CustomerLoginPage objCustomerLoginPage;
    private CustomerHomePage objCustomerHomePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerLoginPage getCustomerLoginPage() {
        return (objCustomerLoginPage == null) ? objCustomerLoginPage = new CustomerLoginPage(driver) : objCustomerLoginPage;
    }

    public CustomerHomePage getCustomerHomePage() {
        return (objCustomerHomePage == null) ? objCustomerHomePage = new CustomerHomePage(driver) : objCustomerHomePage;
    }
}
