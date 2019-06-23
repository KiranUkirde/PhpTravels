package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.Customer.CustomerHomePage;
import pageObjects.Customer.CustomerLoginPage;

import java.util.Properties;

public class LoginSteps {

    TestContext testContext;
    CustomerLoginPage objCustomerLoginPage;
    CustomerHomePage objCustomerHomePage;

    public LoginSteps(TestContext context) {
        testContext = context;
        objCustomerLoginPage = testContext.getPageObjectManager().getCustomerLoginPage();
    }

    @Given("^Customer is on login page$")
    public void customerIsOnLandingPage() throws Throwable {
        objCustomerLoginPage.navigateToHomePage();
    }

    @When("^Customer logged in with valid credentials$")
    public void customerLoggedInWithValidCredentials() throws Throwable {
        objCustomerHomePage = objCustomerLoginPage.Login();
    }

    @And("^Customer logged out and re login$")
    public void customerLoggedOutRelogin() throws Throwable {
        objCustomerHomePage.logout();
        objCustomerLoginPage.Login();
    }

    @Then("^Customer name \"([^\"]*)\" is displayed on homepage$")
    public void customerIsOnHomePage(String name) throws Throwable {
        objCustomerHomePage.validateNameInNavigation(name);
    }
}
