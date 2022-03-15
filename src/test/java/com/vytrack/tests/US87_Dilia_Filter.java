package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtilities;
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
    public void US87() {

        //Log in as store or sales managers

        //Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At
        VytrackUtilities.loginAsSalesManager();

        //Click the “Accounts” under the Customers
        WebElement customerTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));


        WebElement account = Driver.getDriver().findElement(By.xpath("//a[@href='/account']//span[@class='title title-level-2']\n"));

        Actions actions = new Actions(Driver.getDriver());

        WebElement customersAccount = Driver.getDriver().findElement(By.xpath("//span[.='Accounts']"));


        actions.moveToElement(customersAccount).perform();
        customersAccount.click();


        //click to filter button
        WebElement filterOption = Driver.getDriver().findElement(By.xpath("//a[@href='#'][@title='Filters']"));
        filterOption.click();

        //Verify there are 8 filter options
        List<String> expectedPath = new ArrayList<>(Arrays.asList("Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At"));
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//select[@data-action='add-filter-select']/option"));
        List<String> actualTest = new ArrayList<>();
        for (WebElement each : list) {
            actualTest.add(each.getAttribute("title"));
            Assert.assertTrue(each.isEnabled());
        }
        System.out.println(actualTest);


    }
}









