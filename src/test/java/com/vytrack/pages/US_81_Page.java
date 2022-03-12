package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_81_Page {

        @FindBy (xpath = "//div[@id=\"main-menu\"]/ul/li[1]")
        public WebElement fleetButton;

        @FindBy (xpath = "//span[.='Vehicles']")
        public WebElement vehicleButton;

        @FindBy (xpath = "//tr[5]/td[20]")
        public WebElement lastColumn;

        @FindBy (xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']/li")
        public List<WebElement> dotsButton;


}
