package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import managers.PageObjectManager;
import pageObjects.Customer.CustomerHomePage;
import pageObjects.Customer.CustomerLoginPage;

public class ProfileUpdate {

    TestContext objTestContext;

    CustomerHomePage objCustomerHomePage;

    public ProfileUpdate(TestContext context) {
        objTestContext = context;
        objCustomerHomePage = objTestContext.getPageObjectManager().getCustomerHomePage();
    }

    @And("^Customer update phone number as \"([^\"]*)\"$")
    public void customerUpdatePhoneNumberAsSomething(String phoneNumber) throws Throwable {
        objCustomerHomePage.updateUserProfile(phoneNumber);
    }

    @Then("^Customer is able to see new updates$")
    public void customerIsAbleToSeeNewUpdates() throws Throwable {
        objCustomerHomePage.validateUpdatePhone();
    }
}
