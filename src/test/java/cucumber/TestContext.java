package cucumber;

import dataProvider.ConfigFileReader;
import managers.DriverManager;
import managers.PageObjectManager;
import stepDefination.Hooks;

import java.io.IOException;

public class TestContext {
    private DriverManager objDriverManager;
    private ConfigFileReader objConfigFileReader;
    private PageObjectManager objPageObjectManager;

    public TestContext() throws IOException {
        objDriverManager = new DriverManager();
        objConfigFileReader = new ConfigFileReader();
        objPageObjectManager = new PageObjectManager(objDriverManager.initializerDriver());
    }

    public DriverManager getDriverManager(){
        return objDriverManager;
    }

    public ConfigFileReader getCOnfigFileReader(){
        return objConfigFileReader;
    }

    public PageObjectManager getPageObjectManager(){
        return objPageObjectManager;
    }
}
