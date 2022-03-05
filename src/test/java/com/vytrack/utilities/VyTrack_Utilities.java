package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack_Utilities {

    public static void login(String username, String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(password);
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginAsDriver() {


    }

    public static void loginAsStoreManager() {
    }

    public static void loginAsSalesManager() {
    }

}
