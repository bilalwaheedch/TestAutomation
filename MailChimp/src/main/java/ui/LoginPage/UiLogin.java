package ui.LoginPage;


import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



/**
 * Created by izran on 1/18/2017.
 */
public class UiLogin extends CommonMethods {

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

    @FindBy(how = How.XPATH, using =".//a[contains(text(),'Create Campaign')]")// ".//*[@id='uniqName_1_0']/div/nav[1]/ul/li[3]/a")
    public WebElement homeCampaigns;


    public void clickUiBtnLogin() {
        btnSigndin.click();
    }

    public void btnLoginSignin() {
        clickByElement(btnLoginSignin);
    }

    public void typeOnUiUserName(String userName) {
        typeByElement(txtUserName, userName);
    }

    public void typeOnUiPassword(String password) {
        typeByElement(txtpassword, password);
    }

    public void assertIncorrectCredential(String condition) {
        switch (condition) {
            case "incorrectUsername":
                Assert.assertTrue(getTextByWebElement(errorCredentials).contains("Sorry, we couldn't find an account with that username"));
                break;
            case "incorrectPassword":
                Assert.assertTrue(getTextByWebElement(errorCredentials).contains("Sorry, that password isn't right"));
                break;

        }

    }

    public void assertSuccessfulLogin() {
        Assert.assertTrue(getTextByWebElement(homeCampaigns).equalsIgnoreCase("Create Campaign"));
    }

    public void login(String userName, String userPassword) throws InterruptedException {
        clickUiBtnLogin();
        sleepFor(2);
        typeOnUiUserName(userName);
        sleepFor(2);
        typeOnUiPassword(userPassword);
        sleepFor(2);
        btnLoginSignin();
    }
}
