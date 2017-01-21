package CreateAds;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiCreateAds extends UiYourAccountMenuTab {
//    @FindBy(how = How.XPATH,using = "html/body/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/em/span[1]/em")
//    public WebElement pageHeading;

    public String pageHeadingText = "Ads Manager";

    public void assertPage(String pageTitle){
        Assert.assertTrue(pageTitle.contains(pageHeadingText));
    }

}
