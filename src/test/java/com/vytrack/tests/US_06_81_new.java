package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.US_81_Page;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class US_06_81_new extends TestBase {
    //update
//
    @Test (dataProvider = "drivers")
    public void us_06_81(String username){
        VyTrack_Utils.login(username);
        US_81_Page page = new US_81_Page();
        Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.fleetButton).perform();
        page.vehicleButton.click();
        wait.until(ExpectedConditions.visibilityOf(page.lastColumn));
        actions.moveToElement(page.dotsButton).perform();
        for (WebElement dot : page.popUpIcon) {
            System.out.println(dot.getAttribute("title"));
            dot.isDisplayed();
        }

        Driver.closeDriver();
    }
}
