package Ui.ArchivePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/23/2017.
 */
public class UiArchivePage {
    CommonAPI commonAPI;

    @FindBy(how = How.XPATH,using = "//div[@data-title='Archive']")
    public WebElement pageHeading;
    public String pageHeadingText = "Archive";

    public void SetDriver(WebDriver locDriver){
        commonAPI=new CommonAPI();
        commonAPI.setDriver(locDriver);
    }

    public void assertPage(){
        Assert.assertTrue(pageHeading.getAttribute("data-title").contains(pageHeadingText));
    }
}
