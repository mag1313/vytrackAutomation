package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.vytrack.utilities.VyTrack_Utilities.login;
import static com.vytrack.utilities.utilities_for_login.*;

public class US_06_81 {

    List<String> expectedDotText=new ArrayList<>(Arrays.asList("view", "edit", "delete"));


    @Test
    public void verifyUser() {
        for (String username : userList) {
            Driver.getDriver();
            Driver.getDriver().get("https://qa1.vytrack.com/user/login");
            login( username, password);
            Driver.getDriver().findElement(By.xpath("//div[@id]/ul/li[1]/a/span")).click();
            Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();
            List<WebElement> links = Driver.getDriver().findElements(By.xpath("//tr/td[20]/div/div/a"));
            for (WebElement driver : links) {
            driver.click();
            }
            int count=0;
           List<WebElement> dots=Driver.getDriver().findElements(By.xpath("//*[@id]/div/div//div/div/ul/li/ul/li/a"));
                for (WebElement eachDot : dots) {
                    count++;
                    System.out.println(count+":-"+eachDot.getAttribute("title"));
                }
            Assert.assertEquals((links.size()* expectedDotText.size()),dots.size());
            Driver.closeDriver();
                }
            }




    @Test
    public void verifySalesManager() {
        for (String username : salesmanager) {
            Driver.getDriver();
            Driver.getDriver().get("https://qa1.vytrack.com/user/login");
            login( username, password);

            try{
               Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]")).click();
           }catch (ElementClickInterceptedException e){
               Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]")).click();
           }catch (ElementNotInteractableException e){}
            Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();

            List<WebElement> links = Driver.getDriver().findElements(By.xpath("//tr/td[20]/div/div/a"));
            for (WebElement driver : links) {
                driver.click();
            }
            List<WebElement> dots=Driver.getDriver().findElements(By.xpath("//*[@id]/div/div//div/div/ul/li/ul/li/a"));
            int count=0;
            for (WebElement eachDot : dots) {
                count++;
                System.out.println(count+":-"+eachDot.getAttribute("title"));
            }
            Assert.assertEquals((links.size()* expectedDotText.size()),dots.size());
            Driver.closeDriver();
        }
    }

    @Test
    public void verifyStoreManager() {
        for (String username : storemanger) {
            Driver.getDriver();
            Driver.getDriver().get("https://qa1.vytrack.com/user/login");
            login( username, password);
            try{
                Driver.getDriver().findElement(By.xpath("//*[@id]/ul/li[2]/a/span")).click();
            }catch (ElementClickInterceptedException e){
                Driver.getDriver().findElement(By.xpath("//*[@id]/ul/li[2]/a/span")).click();
            }catch (ElementNotInteractableException e){}
            Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();

                List<WebElement> links = Driver.getDriver().findElements(By.xpath("//*//tr/td[21]/div/div/a"));
                for (WebElement driver : links) {
                    driver.click();
                }

            int count=0;
            List<WebElement> dots=Driver.getDriver().findElements(By.xpath("//*[@id]/div/div//div/div/ul/li/ul/li/a"));
            for (WebElement eachDot : dots) {
                count++;
                System.out.println(count+":-"+eachDot.getAttribute("title"));
            }
            Assert.assertEquals((links.size()* expectedDotText.size()),dots.size());
            Driver.closeDriver();
        }
    }
}

//*[@id="main-menu"]/ul/li[2]/a/span
//div[@id]/ul/li[2]/a/span
//*[@id="main-menu"]/ul/li[2]

//div[@id]/ul/li[1]/a/span"