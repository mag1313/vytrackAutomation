package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.vytrack.utilities.VyTrack_Utilities.crm_login;
import static com.vytrack.utilities.utilities_for_login.*;

public class US_06_81 {

    List<String> expectedDotText=new ArrayList<>(Arrays.asList("view", "edit", "delete"));
    @BeforeMethod
    public void setUp() {


    }

    @Test
    public void verify() {
        for (String username : userList) {
            Driver.getDriver();
            Driver.openUrl("https://qa1.vytrack.com/user/login");
            crm_login(Driver.getDriver(), username, password);
            Driver.getDriver().findElement(By.xpath("//div[@id]/ul/li[1]/a/span")).click();
            Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();
            List<WebElement> links = Driver.getDriver().findElements(By.xpath("//tr/td[20]/div/div/a"));
            int count=0;
            for (WebElement driver : links) {
            driver.click();
           }
            List<WebElement> dots=Driver.getDriver().findElements(By.xpath("//*[@id]/div/div//div/div/ul/li/ul/li/a"));
                for (WebElement eachDot : dots) {
                    count++;
                    System.out.println(count+":-"+eachDot.getAttribute("title"));
                }
            Assert.assertEquals((links.size()*3),dots.size());
            System.out.println(links.size());
            Driver.close();
                }
            }




    @Test
    public void verify2() {
        for (String username : salesmanager) {
            Driver.getDriver();
            Driver.openUrl("https://qa1.vytrack.com/user/login");
            crm_login(Driver.getDriver(), username, password);
           try{
               Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]")).click();
           }catch (ElementClickInterceptedException e){
               Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]")).click();
           }catch (ElementNotInteractableException e){}
            Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();
            List<WebElement> links = Driver.getDriver().findElements(By.xpath("//tr/td[20]/div/div/a"));
            int count = 0;
            for (WebElement driver : links) {
                count++;
                System.out.println(count + ": " + driver.getText());
                driver.click();
                List<WebElement> dots = Driver.getDriver().findElements(By.xpath("//tr[1]/td[20]//li/a"));
                for (WebElement eachDot : dots) {
                    count++;
                    System.out.println(count + ": " + eachDot.getAttribute("title"));
                }
            }
            Driver.close();
        }
    }
}

//*[@id="main-menu"]/ul/li[2]/a/span
//div[@id]/ul/li[2]/a/span
//*[@id="main-menu"]/ul/li[2]

//div[@id]/ul/li[1]/a/span"