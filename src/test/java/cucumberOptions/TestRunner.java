package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature", glue = {"stepDefination"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"})

public class TestRunner {
}
