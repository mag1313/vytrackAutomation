package com.vytrack.utilities;
import org.openqa.selenium.By;

public class VyTrack_Utilities {

    public static void login(String username, String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(password);
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginAsDriver() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsStoreManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsSalesManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

}
