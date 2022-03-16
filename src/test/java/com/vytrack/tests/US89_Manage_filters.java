package com.vytrack.tests;

import com.google.common.base.Verify;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US89_Manage_filters extends TestBase {

    @Test
    public void manageFilters_SalesManager() {
        VyTrack_Utilities.loginAsSalesManager();


        WebElement marketingBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[6]"));
        //Create actions to navigate and click the Campaigns under the Marketing
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(marketingBtn).perform();
        BrowserUtils.sleep(2);
        WebElement campaignsBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/div/div/ul/li[4]/a/span"));
        campaignsBtn.click();
        //navigate on filter button and click
        WebElement filterBtn = Driver.getDriver().findElement(By.xpath("//*[@title = 'Filters']"));
        filterBtn.click();

        //navigate on a manage filter button and click
        WebElement manageFilterBtn = Driver.getDriver().findElement(By.xpath("//*[@class= 'add-filter-button']/span"));
        manageFilterBtn.click();
        //Verify 6 options are checked by default
        List<WebElement> allOptions = Driver.getDriver().findElements(By.xpath("//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/ul/li/label/input"));
        for (WebElement option : allOptions) {
            Assert.assertTrue(option.isSelected());
        }

        BrowserUtils.sleep(2);
        WebElement option1 = Driver.getDriver().findElement(By.xpath("(//*[@title='Code'])[3]"));
        option1.click();

        WebElement option2 = Driver.getDriver().findElement(By.xpath("(//*[@title='End Date'])[3]"));
        option2.click();

        BrowserUtils.sleep(1);

        WebElement option3 = Driver.getDriver().findElement(By.xpath("(//*[@title='Budget'])[3]"));
        option3.click();


        //Verify one or more options are unchecked
        List<WebElement> allOptions1 = Driver.getDriver().findElements(By.xpath("//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/ul/li/label/input"));
        for (WebElement uncheckOption : allOptions1) {
            System.out.println("uncheckOption.isSelected() = " + uncheckOption.isSelected());
        }

    }

}

