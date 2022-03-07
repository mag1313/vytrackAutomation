package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */
    public Driver() {
    }

    /*
    we make webdriver private. because we want to close access from outside the class
    we make it static because we will use it in a static method.
     */
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            /*
            we read our browserType from configuration.properties.
            This way, we can control which browser is open from outside code,
            from from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        return driver;
    }

    public static void close() {
        driver.close();
        driver = null;  // we destroy the driver object after quit operation
    }

    public static void openUrl(String URL) {
        driver.get(URL);
    }

}
