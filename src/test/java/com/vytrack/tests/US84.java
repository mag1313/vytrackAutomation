package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class US84 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //We are getting the browserType dynamically from our configuration.properties file
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
