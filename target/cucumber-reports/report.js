$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/CustomerProfileUpdate.feature");
formatter.feature({
  "name": "Customer profile update",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify customer is able to update his/her profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "Customer is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.customerIsOnLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer logged in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.customerLoggedInWithValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer update phone number as \"+31619445369\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileUpdate.customerUpdatePhoneNumberAsSomething(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer is able to see new updates",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileUpdate.customerIsAbleToSeeNewUpdates()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/feature/Login.feature");
formatter.feature({
  "name": "To verify login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate customer is able to login successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Customer is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.customerIsOnLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer logged in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.customerLoggedInWithValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer logged out and re login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.customerLoggedOutRelogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer name \"Kiran\" is displayed on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.customerIsOnHomePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});