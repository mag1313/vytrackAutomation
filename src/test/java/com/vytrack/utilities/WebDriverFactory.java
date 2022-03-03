package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver (String browserType){

        if(browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver=null");
            return null;
        }
    }
}
