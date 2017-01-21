package NewGroups;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiNewGroups extends UiYourAccountMenuTab{
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[1]/ul/li[2]/a/div/div[1]")
    public WebElement pageHeading;
    public String pageHeadingText = "Discover";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
