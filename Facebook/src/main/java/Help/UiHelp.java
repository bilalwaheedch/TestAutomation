package Help;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiHelp extends UiYourAccountMenuTab {
    @FindBy(how = How.CSS,using = ".fsl.fwb")
    public WebElement pageHeading;
    public String pageHeadingText = "help";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}
