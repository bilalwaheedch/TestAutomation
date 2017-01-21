package ManageAds;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiManageAds extends UiYourAccountMenuTab{
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div/div[3]/form/div[1]")
    public WebElement pageHeading;
    public String pageHeadingText = "Ad Accounts";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
