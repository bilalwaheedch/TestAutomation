package Homepage;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Bilal on 20-01-2017.
 */
public class UiHomePage extends CommonMethods {
    @FindBy(how = How.XPATH,using = ".//*[@id='u_c_1']/div/div[1]/em")
    public WebElement headingSettings;

    @FindBy(how = How.XPATH,using = ".//*[@id='u_g_0']")
    public WebElement headingCreateGroup;

    @FindBy(name = "xhpc_message")
    public WebElement barPostStatus;

    @FindBy(className = "_1mf _1mj")
    public WebElement tfPostStatus;
    @FindBy(xpath = ".//*[@data-testid='react-composer-post-button']")
    public WebElement btnReactionComposerPost;

    public void typeReactionComposer(String text, WebDriver driver){
        clickIfElementPresent(barPostStatus);
        new Actions(driver).sendKeys(text).build().perform();
        btnReactionComposerPost.click();

    }
}
