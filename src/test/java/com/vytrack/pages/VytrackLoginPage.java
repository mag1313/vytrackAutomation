package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Login Label
    @FindBy(className="title")
    public WebElement loginLabel;

    // Username
    @FindBy(id="#prependedInput")
    public WebElement userNameInput;

    // Password
    @FindBy(css = "input[id='prependedInput2']")
    public WebElement passwordInput;

    // Login Button
    @FindBy(xpath="//button[@id='_submit']")
    public WebElement loginButton;

    // Remember Me Text
    @FindBy(xpath = "//span[.='Rememeber me on this computer']")
    public WebElement rememberMeText;

    public void goToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    public void login(String userName, String password){
        goToLoginPage();
        userNameInput.sendKeys();
        BrowserUtils.sleep(2);
        passwordInput.sendKeys(password);
        BrowserUtils.sleep(2);
        loginButton.click();
    }
}
