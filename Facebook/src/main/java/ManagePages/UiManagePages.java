package ManagePages;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiManagePages extends UiYourAccountMenuTab{
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "Pages";

    public void assertPage(){
        getLogger(UiManagePages.class).info("Execute assertPage Method for UiCreatePage Class");
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
