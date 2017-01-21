package ReportProblem;

import Homepage.UiYourAccountMenuTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiReportProblem extends UiYourAccountMenuTab{
    @FindBy(how = How.XPATH,using = ".//*[@id='bug_or_feedback']/a[1]")
    public WebElement pageHeading;
    public String pageHeadingText = "General Feedback";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }

}
