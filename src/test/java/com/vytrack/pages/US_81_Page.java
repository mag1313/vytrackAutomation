package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_81_Page {

        public US_81_Page(){
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy (xpath = "//div[@id]/ul/li[1]/a/span")
        public WebElement fleetButton;

        @FindBy (xpath = "//span[.='Vehicles']")
        public WebElement vehicleButton;

        @FindBy (xpath = "//tr[5]/td[20]")
        public WebElement lastColumn;

        @FindBy (xpath = "//tr[1]//div[@class='more-bar-holder']/div")
        public WebElement dotsButton;

        @FindBy (xpath = "//li[@class='launcher-item']/a")
        public List<WebElement> popUpIcon;


}
