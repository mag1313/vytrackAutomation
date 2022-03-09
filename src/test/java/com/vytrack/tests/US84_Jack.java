package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.vytrack.utilities.utilities_for_login.driver;

public class US84_Jack extends TestBase {

    @Test
    public void verifying_errorMessage_driver() {
        VyTrack_Utilities.loginAsDriver();

        //Creating object of an Actions class
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
        Actions actions = new Actions(Driver.getDriver());

        //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
        //Performing the mouse hover action on the target element.
        actions.moveToElement(activities).perform();

        WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span"));
        calendarEvent.click();

        //2.Click on "Create Calendar"
        //Creat Calendar
        WebElement createCalendar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendar.click();

        //3. Check the "Repeat" checkBox
        //Repeat checkBox
        WebElement repeat = Driver.getDriver().findElement(By.xpath("//*[@id='recurrence-repeat-view243']"));
        repeat.click();

        //Error Message Less Than 1.
        WebElement inputBox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("0");

        WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
        String actualErrorMessage1 = errorText1.getText();
        System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
        String expectedErrorMessage1 = "The value have not to be less than 1.";
        Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

        //Error Message More Than 99.
        WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("100");

        WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
        String actualErrorMessage99 = errorText2.getText();
        System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
        String expectedErrorMessage99 = "The value have not to be more than 99.";
        Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);




    }

    @Test //DONE
    public void verifying_errorMessage_salesManager() {
        VyTrack_Utilities.loginAsSalesManager();

        //Creating object of an Actions class
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));
        Actions actions = new Actions(Driver.getDriver());

        //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
        //Performing the mouse hover action on the target element.
        actions.moveToElement(activities).perform();

        WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[7]/a/span"));
        calendarEvent.click();

        //2.Click on "Create Calendar"
        //Creat Calendar
        WebElement createCalendar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendar.click();

        //3. Check the "Repeat" checkBox
        //Repeat checkBox
        WebElement repeat = Driver.getDriver().findElement(By.xpath("//input[@id='recurrence-repeat-view425']"));
        repeat.click();

        //Error Message Less Than 1.
        WebElement inputBox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("0");

        WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
        String actualErrorMessage1 = errorText1.getText();
       // System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
        String expectedErrorMessage1 = "The value have not to be less than 1.";
        Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

        //Error Message More Than 99.
        WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("100");

        WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
        String actualErrorMessage99 = errorText2.getText();
       // System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
        String expectedErrorMessage99 = "The value have not to be more than 99.";
        Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);


    }

    @Test //DONE!
    public void verifying_errorMessage_storeManager() {
        VyTrack_Utilities.loginAsStoreManger();

        //Creating object of an Actions class
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));
        Actions actions = new Actions(Driver.getDriver());


        //Step1 = Login Hover Over the "Activities" -> click on "Calendar Events"
        //Performing the mouse hover action on the target element.
        actions.moveToElement(activities).perform();
        WebElement calendarEvent = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span"));
        calendarEvent.click();

        //2.Click on "Create Calendar"
        //Creat Calendar
        WebElement createCalendar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendar.click();

        //3. Check the "Repeat" checkBox
        //Repeat checkBox
        WebElement repeat = Driver.getDriver().findElement(By.xpath("//*[@id='recurrence-repeat-view430']"));
        repeat.click();

        //Error Message Less Than 1.
        WebElement inputBox = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("0");

        WebElement errorText1 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be less than 1.']/span"));
        String actualErrorMessage1 = errorText1.getText();
        System.out.println("actualErrorMessage1 = " + actualErrorMessage1);
        String expectedErrorMessage1 = "The value have not to be less than 1.";
        Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

        //Error Message More Than 99.
        WebElement inputBox2 = Driver.getDriver().findElement(By.xpath("//input[@class ='recurrence-subview-control__number']"));
        inputBox.clear();
        inputBox.sendKeys("100");

        WebElement errorText2 = Driver.getDriver().findElement(By.xpath("//span//span[.='The value have not to be more than 99.']/span"));
        String actualErrorMessage99 = errorText2.getText();
        System.out.println("actualErrorMessage99 = " + actualErrorMessage99);
        String expectedErrorMessage99 = "The value have not to be more than 99.";
        Assert.assertEquals(actualErrorMessage99, expectedErrorMessage99);

    }

}