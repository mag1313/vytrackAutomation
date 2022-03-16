package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class US2_77_AccessOroineDocument_Eli extends TestBase{


    @Test
    public void verifyAccessAsSalesManager(){
        VyTrack_Utilities.loginAsSalesManager();

        VyTrack_Utilities.waitTillLoaderMaskDisappear();

        //Click the question icon on the top right of the page
        WebElement clickQuestionIcon = Driver.getDriver().findElement(By.xpath("//a[@title='Get help']"));
        clickQuestionIcon.click();

        //Verify the users access to the Oronic Documentation page


    }

    @Test
    public void verifyAccessAsStoreManager(){
        VyTrack_Utilities.loginAsSalesManager();

        VyTrack_Utilities.waitTillLoaderMaskDisappear();

        //Click the question icon on the top right of the page
        WebElement clickQuestionIcon = Driver.getDriver().findElement(By.xpath("//a[@title='Get help']"));
        clickQuestionIcon.click();

        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);

        //Verify the users access to the Oronic Documentation page

    }

    @Test
    public void verifyAccessAsDriver(){
        VyTrack_Utilities.loginAsDriver();

        VyTrack_Utilities.waitTillLoaderMaskDisappear();

        //Click the question icon on the top right of the page
        WebElement clickQuestionIcon = Driver.getDriver().findElement(By.xpath("//a[@title='Get help']"));
        clickQuestionIcon.click();

        //Verify the users access to the Oronic Documentation page


    }

}

//User Story: As a user, I should be able to access the Oroinc Documentation page.

//AC #1: Users access the Oronic Documentation page by clicking the question icon. The page URL: https://doc.oroinc.com/