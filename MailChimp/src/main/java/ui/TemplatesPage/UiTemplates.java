package ui.TemplatesPage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by izran on 1/19/2017.
 */
public class UiTemplates extends CommonMethods {

    @FindBy(how = How.XPATH, using = ".//*[@id='page-home']/body/nav/div[1]/div[2]/a")
    public WebElement btnSigndin;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-form']/fieldset/div[4]/button")
    public WebElement btnLoginSignin;

    @FindBy(how = How.XPATH, using = ".//*[@id='username']")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = ".//*[@id='password']")
    public WebElement txtpassword;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-form']/fieldset/div[1]/div/div/div[2]/p")
    public WebElement errorCredentials;

    @FindBy(how = How.XPATH, using = ".//*[@id='uniqName_1_0']/div/nav[1]/ul/li[3]/a")
    public WebElement homeCampaigns;
}
