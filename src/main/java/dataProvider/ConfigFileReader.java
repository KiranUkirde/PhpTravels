package dataProvider;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    Properties prop = new Properties();
    FileInputStream fis = null;
    private String currentDirectory = System.getProperty("user.dir");

    {
        try {
            fis = new FileInputStream(currentDirectory + "\\src\\main\\java\\resources\\Data.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        String browser = prop.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("Browser is not specified in properties file");
    }

    public String getcustomerUrl() {
        String customerUrl = prop.getProperty("customerUrl");
        if (customerUrl != null) return customerUrl;
        else throw new RuntimeException("URL is not specified in properties file");
    }

    public String getCustomerUsername() {
        String customerUsername = prop.getProperty("customerUsername");
        if (customerUsername != null) return customerUsername;
        else throw new RuntimeException("Customer Username is not specified in properties file");
    }

    public String getCustomerPassword() {
        String customerPassword = prop.getProperty("customerPassword");
        if (customerPassword != null) return customerPassword;
        else throw new RuntimeException("Customer Password is not specified in properties file");
    }
}
