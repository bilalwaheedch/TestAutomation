package CreateGroup;

import Homepage.UiYourAccountMenuTab;
import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiCreateGroup extends CommonMethods{
    @FindBy(how = How.XPATH,using = ".//*[@id='groupsCreateName']")
    public WebElement pageHeading;

    public String pageHeadingText = "Name";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
