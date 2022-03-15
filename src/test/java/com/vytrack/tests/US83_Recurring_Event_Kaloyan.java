package com.vytrack.tests;


import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US83_Recurring_Event_Kaloyan {


    @Test
    public void us83_recurring_events_tc1(){

        VyTrack_Utilities.login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password"));


        // //span[@class='title title-level-1']/i[@class='fa-puzzle-piece menu-icon']

        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Activities' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(activitiesModule).perform();

        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calendarEvents.click();

        WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarEvent.click();

        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'recurrence-repeat-view')]"));
        repeatCheckBox.click();

        WebElement repeatEveryInput = Driver.getDriver().findElement(By.xpath("(//div[@class='recurrence-subview-control__item']//input[@type='text'])[1]"));

        String expectedValue = "1";
        String actualValue = repeatEveryInput.getAttribute("value");

        Assert.assertEquals(actualValue, expectedValue, "Text didn't match");

        Driver.closeDriver();


    }

    @Test
    public void us83_recurring_events_tc2(){

        VyTrack_Utilities.login(ConfigurationReader.getProperty("username1"), ConfigurationReader.getProperty("password"));


        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Activities' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(activitiesModule).perform();

        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calendarEvents.click();

        WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarEvent.click();

        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'recurrence-repeat-view')]"));
        repeatCheckBox.click();

        WebElement repeatEveryInput = Driver.getDriver().findElement(By.xpath("(//div[@class='recurrence-subview-control__item']//input[@type='text'])[1]"));

        repeatEveryInput.click();
        repeatEveryInput.clear();
        repeatEveryInput.submit();



        WebElement errorTextMessage = Driver.getDriver().findElement(By.xpath("//span[contains(@id,'temp-validation-name')]"));

        String expectedErrorMessageText = "This value should not be blank.";
        String actualErrorMessageText = errorTextMessage.getText();

        Assert.assertEquals(actualErrorMessageText, expectedErrorMessageText, "Error message text Didn't match");

        Driver.closeDriver();

    }

}
