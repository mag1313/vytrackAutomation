package com.vytrack.tests;

import com.vytrack.pages.VytrackLoginPage;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US05 {
    //login as sales manager
    @Test
            public void US05() {


        VytrackLoginPage.gotoLoginPage();

        //go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        List<String> actualheadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedheadersFromVehicleModelTable = new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        //verify header columns
        Assert.assertEquals(actualheadersFromVehicleModelTable, expectedheadersFromVehicleModelTable);


    }
}
