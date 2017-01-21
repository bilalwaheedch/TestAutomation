package NewsFeedPreferences;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiNewsFeedPreferences extends UiYourAccountMenuTab{
    @FindBy(how = How.XPATH,using = ".//*[@data-intl-translation='Preferences']")
    public WebElement pageHeading;
    public String pageHeadingText = "Preferences";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
