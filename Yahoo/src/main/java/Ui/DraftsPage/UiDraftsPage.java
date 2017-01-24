package Ui.DraftsPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/23/2017.
 */
public class UiDraftsPage  extends CommonMethods {

    @FindBy(how = How.XPATH,using = "//div[@data-title='Drafts']")
    public WebElement pageHeading;
    public String pageHeadingText = "Drafts";


    public void assertPage(){
        Assert.assertTrue(pageHeading.getAttribute("data-title").contains(pageHeadingText));
    }
}
