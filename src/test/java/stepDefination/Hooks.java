package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    TestContext objTestContext;

    public Hooks(TestContext context){
        objTestContext = context;
    }

    @After
    public void tearDown() throws IOException {
        objTestContext.getDriverManager().teardown();
}
}