package Settings;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiSettings extends UiYourAccountMenuTab {
    @FindBy(how = How.XPATH,using = ".//*[@id='headerArea']/div/div/div[2]/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "Settings";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
