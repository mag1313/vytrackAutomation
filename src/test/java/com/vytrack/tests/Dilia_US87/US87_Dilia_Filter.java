package com.vytrack.tests.Dilia_US87;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US87_Dilia_Filter extends TestBase {

    @Test
    public void US87(){

        //Log in as store or sales managers

        //Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At
        VyTrack_Utilities.loginAsSalesManager();

        //Click the “Accounts” under the Customers
        WebElement customerTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));


        WebElement account = Driver.getDriver().findElement(By.xpath("//a[@href='/account']//span[@class='title title-level-2']\n"));

        Actions actions = new Actions(Driver.getDriver());

        WebElement customersAccount = Driver.getDriver().findElement(By.xpath("//span[.='Accounts']"));


        actions.moveToElement(customersAccount).perform();
        customersAccount.click();

        WebElement filterOption = Driver.getDriver().findElement(By.xpath("//a[@class='action btn mode-icon-only pressed']"));
        filterOption.click();

        //Verify there are 8 filter options
        WebElement eightElements = (WebElement) Driver.getDriver().findElements(By.xpath("//*[contains(@id,grid-accounts-grid)]//ul/li/label/span"));


        List<String> expectedListOfFilters = new ArrayList<>(Arrays.asList("Account Name", "Contact Name", "Contact Email", "Contact Phone", "Owner", "Business Unit", "Created At", "Updated At"));
        List<String> actualListOfFilters = new ArrayList<>();
        for (int i = 0; i < Driver.getDriver().findElements(By.xpath("//*[contains(@id,grid-accounts-grid)]//ul/li/label/span")).size(); i++) {
            actualListOfFilters.add(Driver.getDriver().findElements(By.xpath("//*[contains(@id,grid-accounts-grid)]//ul/li/label/span")).get(i).getText());
        }
        System.out.println("actualListOfFilters = " + actualListOfFilters);
        Assert.assertEquals(actualListOfFilters, expectedListOfFilters);
    }
}






