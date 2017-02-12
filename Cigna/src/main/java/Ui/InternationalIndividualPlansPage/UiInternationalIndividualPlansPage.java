package Ui.InternationalIndividualPlansPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 2/12/2017.
 */
public class UiInternationalIndividualPlansPage {
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[1]/div/div[1]/div/div/ul/li[2]")
    public WebElement pageHeading;
    public String pageHeadingText = "Individual Plans";

    public void assertPage(){
        String s=pageHeading.getText();
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}
