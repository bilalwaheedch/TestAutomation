package ui.ListPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/22/2017.
 */
public class UiHomeList  extends CommonMethods {
    WebDriver locDriver = null;

    @FindBy(how = How.XPATH, using = "//a[@aria-label='Lists: Create lists, add subscribers, create sign up forms']")
    public WebElement hrList;

    @FindBy(how = How.XPATH, using = ".//*[@id='content']/div[1]/a")
    public WebElement btnCreateList;



    public void clickUiList() {
        //waitUntilClickAble(By.xpath("//a[@aria-label='Lists: Create lists, add subscribers, create sign up forms']"));
        hrList.click();
    }

    public void assertSuccessHomeList() {
        Assert.assertTrue(getTextByWebElement(btnCreateList).equalsIgnoreCase("Create list"));
    }
}
