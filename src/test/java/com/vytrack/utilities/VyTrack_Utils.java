package com.vytrack.utilities;

import com.vytrack.pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrack_Utils {
    private static String username = ConfigurationReader.getProperty("username2");
    private static String password = ConfigurationReader.getProperty("password");

    static LoginPage loginPage;
    //This method will log in to CRM, if no username and password provided will use Data from Configuration properties

    public static void login(){
        // Calling webElements from Login Page
        loginPage = new LoginPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //3. Enter valid username
        wait.until(ExpectedConditions.visibilityOf(loginPage.usernameInput));
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(username);

        //4. Enter valid password
        wait.until(ExpectedConditions.visibilityOf(loginPage.passwordInput));
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(password);

        //5. Click to Log In button
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginButton));
        loginPage.loginButton.click();

        // Verify login successful


    }

    public static void login(String username, String password){
        // Calling webElements from Login Page
        loginPage = new LoginPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //3. Enter valid username
        //wait.until(ExpectedConditions.visibilityOf(LoginPage.usernameInput));
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(username);

        //4. Enter valid password
        //4. Enter valid password
        wait.until(ExpectedConditions.visibilityOf(loginPage.passwordInput));
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(password);

        //5. Click to Log In button
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginButton));
        loginPage.loginButton.click();



    }

    public static void login(String username){
        // Calling webElements from Login Page
        loginPage = new LoginPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // Enter valid username
        wait.until(ExpectedConditions.visibilityOf(loginPage.usernameInput));
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(username);

        // Enter valid password
        wait.until(ExpectedConditions.visibilityOf(loginPage.passwordInput));
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(password);;

        // Click to Log In button
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginButton));
        loginPage.loginButton.click();

    }

}

