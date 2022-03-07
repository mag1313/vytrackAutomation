package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack_Utilities {

        //WE HAVE TO CREATE OUR CUSTOM LOGIN METHOD FOR THIS PROJECT!


    public static void crm_login(WebDriver driver) {
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    public static void crm_login(WebDriver driver, String username, String password) {
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys(password);
        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();


    }

    public static void sleep(double second){
        try {
            Thread.sleep((long) (second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
