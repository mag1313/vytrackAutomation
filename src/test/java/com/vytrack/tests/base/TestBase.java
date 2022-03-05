package com.vytrack.tests.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class TestBase {

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
