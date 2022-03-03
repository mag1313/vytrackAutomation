package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(WebDriver driver ,String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

}
