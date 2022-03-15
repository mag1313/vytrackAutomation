package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// User Story: As a user, I should be accessing all the main modules of the app.

public class US76_Ramia_MainTab extends TestBase {
 @Test
 public void verifyModulesAsSalesManager(){
  VyTrack_Utilities.loginAsSalesManager();
  List<WebElement> allMainModules   =Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
  List<String>actualTexts=new ArrayList<>();
  allMainModules.forEach(module-> actualTexts.add(module.getText()));
  System.out.println("actualTexts = " + actualTexts);
  System.out.println("number of modules is: "+actualTexts.size());
  List<String>expectedTexts=new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
  Assert.assertEquals(actualTexts,expectedTexts);
 }
@Test
public void verifyModulesAsStoreManager(){
 VyTrack_Utilities.loginAsStoreManger();
 List<WebElement> allMainModules   =Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
 List<String>actualTexts=new ArrayList<>();
 allMainModules.forEach(module-> actualTexts.add(module.getText()));
 System.out.println("actualTexts = " + actualTexts);
 System.out.println("number of modules is: "+actualTexts.size());
 List<String>expectedTexts=new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
 Assert.assertEquals(actualTexts,expectedTexts);
}
@Test
public void verifyModulesAsDriver(){
 VyTrack_Utilities.loginAsDriver();
 List<WebElement> allMainModules   =Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
 List<String>actualTexts=new ArrayList<>();
 allMainModules.forEach(module-> actualTexts.add(module.getText()));
 System.out.println("actualTexts = " + actualTexts);
 System.out.println("number of modules is: "+actualTexts.size());
 List<String>expectedTexts=new ArrayList<>(Arrays.asList("Fleet", "Customers","Activities", "System"));
 Assert.assertEquals(actualTexts,expectedTexts);
}



 }


  // User Story: As a user, I should be accessing all the main modules of the app.
    //
    //AC #1: ** store and sales managers should view 8 module names.
    //
    //Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
    //
    //AC #2: ** drivers should view 4 module names
    //
    //Expected module names: Fleet, Customers, Activities, System

