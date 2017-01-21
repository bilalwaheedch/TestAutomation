package ActivityLog;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiActivityLog extends UiYourAccountMenuTab {
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "Activity Log";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
