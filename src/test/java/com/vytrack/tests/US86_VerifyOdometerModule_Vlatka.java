package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US86_VerifyOdometerModule_Vlatka extends TestBase {

    @Test
    public void verify_odometer_module_as_sales_manager() {

        VytrackUtilities.loginAsSalesManager();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        String fleetLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleet = Driver.getDriver().findElement(By.xpath(fleetLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        String vehicleOdometerLocator = "//span[normalize-space()='Vehicle Odometer' and contains(@class, 'title title-level-2')]";
        WebElement vehicleOdometerElement = Driver.getDriver().findElement(By.xpath(vehicleOdometerLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        vehicleOdometerElement.click();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        WebElement Message = Driver.getDriver().findElement(By.xpath("//div[@id='flash-messages']/div/div/div[2]/div"));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = Message.getText();

        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verify_odometer_module_as_store_manager() {

        VytrackUtilities.loginAsStoreManager();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        String vehicleOdometerLocator = "//span[normalize-space()='Vehicle Odometer' and contains(@class, 'title title-level-2')]";
        WebElement vehicleOdometerElement = Driver.getDriver().findElement(By.xpath(vehicleOdometerLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        vehicleOdometerElement.click();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        WebElement FlashMessage = Driver.getDriver().findElement(By.xpath("//div[@id='flash-messages']/div/div/div[2]/div"));

        String expectedFlashMessage = "You do not have permission to perform this action.";
        String actualFlashMessage = FlashMessage.getText();

        Assert.assertEquals(actualFlashMessage,expectedFlashMessage);
    }

    @Test
    public void verify_odometer_module_as_driver() {

        VytrackUtilities.loginAsDriver();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();

        String vehicleOdometerLocator = "//span[normalize-space()='Vehicle Odometer' and contains(@class, 'title title-level-2')]";
        WebElement vehicleOdometerElement = Driver.getDriver().findElement(By.xpath(vehicleOdometerLocator));
        VytrackUtilities.waitTillLoaderMaskDisappear();

        vehicleOdometerElement.click();
        VytrackUtilities.waitTillLoaderMaskDisappear();

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//input[contains(@value,'1')]"));

        String expectedNumber = "1";
        String actualNumber = checkBox.getAttribute("value");

        Assert.assertEquals(actualNumber, expectedNumber);

        WebElement buttonDropdown = Driver.getDriver().findElement(By.xpath("//button[contains(@class,'btn dropdown-toggle ')]"));

        String expectedValue = "25";
        String actualValue = buttonDropdown.getText();

        Assert.assertEquals(actualValue, expectedValue);
    }

}
