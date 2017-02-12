package Ui.CignaMedicarePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 2/12/2017.
 */
public class UiCignaMedicarePage {
    @FindBy(how = How.XPATH,using = "html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div/div[1]/div/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "CIGNA PLAN FINDER";

    public void assertPage(){
        String s=pageHeading.getText();
        Assert.assertEquals(s,pageHeadingText);
    }
}
