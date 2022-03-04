package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US3_Pinbar {
    WebDriver driver;
    WebElement verify;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void deskTopOptionTest(){
        driver.get("https://app.vytrack.com/user/login");
        WebElement inputUserName = driver.findElement(By.xpath("//*[@id=\"prependedInput\"]"));
        inputUserName.sendKeys("user166");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]"));
        inputPassword.sendKeys("UserUser123");

       WebElement login = driver.findElement(By.xpath("//*[@id=\"_submit\"]"));

       login.click();

       WebElement learnHowToBar = driver.findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));

       learnHowToBar.click();

       WebElement PinBar = driver.findElement(By.xpath("//*[@id=\"bookmark-buttons\"]/div/div/button[2]"));

       PinBar.click();

       verify = driver.findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/ul/li/a"));

       verify.isDisplayed();

    }

}