package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {
    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Login label
    @FindBy(className = "title")
    public WebElement loginLabel;



    //username
    @FindBy(id = "prependedInput")
    public static WebElement userNameInput;


    //password
    @FindBy(css = "input[id='prependedInput2']")
        public static WebElement passwordInput;

    //login button
    @FindBy(xpath = "//button[@id='_submit']")
    public static WebElement loginButton;


    //remember me test
    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeText;


    public static void gotoLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
    public static void login(String userName, String password){
        gotoLoginPage();
        userNameInput.sendKeys(userName);
        BrowserUtils.sleep(2);
        passwordInput.sendKeys(password);
        BrowserUtils.sleep(2);
        loginButton.click();
    }



}
