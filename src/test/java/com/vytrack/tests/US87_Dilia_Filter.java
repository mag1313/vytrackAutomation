package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


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


            //click to filter button
            WebElement filterOption = Driver.getDriver().findElement(By.xpath("//a[@href='#'][@title='Filters']"));
            filterOption.click();

            //Verify there are 8 filter options
            String expectedPath = "Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At";
            //String actualPath = Driver.getDriver().getText();


           // if(expectedPath != actualPath){
                System.out.println("All filter are here");
            //}else{
                System.out.println("Filters are not displayed please check code");
            }

            //Done
        }









