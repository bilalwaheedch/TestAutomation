package ui.LoginPage;


import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



/**
 * Created by izran on 1/18/2017.
 */
public class UiLogin extends CommonMethods {
    CommonAPI commonAPI;

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

    @FindBy(how = How.CSS, using ="recaptcha-checkbox.goog-inline-block.recaptcha-checkbox-unchecked.rc-anchor-checkbox.recaptcha-checkbox-clearOutline")
    public WebElement divrecaptcha;

    public void SetDriver(WebDriver locDriver){
        commonAPI=new  CommonAPI();
        commonAPI.setDriver(locDriver);
    }

    public void clickUiBtnLogin() {
        btnSigndin.click();
    }
    public void clickUiDivRecaptcha() {
        divrecaptcha.click();
    }

    public void btnLoginSignin() {
        commonAPI.clickByElement(btnLoginSignin);
    }

    public void typeOnUiUserName(String userName) {
        commonAPI.typeByElement(txtUserName, userName);
    }

    public void typeOnUiPassword(String password) {
        commonAPI.typeByElement(txtpassword, password);
    }

    public void assertIncorrectCredential(String condition) {
        switch (condition) {
            case "incorrectUsername":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorCredentials).contains("Sorry, we couldn't find an account with that username"));
                break;
            case "incorrectPassword":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorCredentials).contains("Sorry, that password isn't right"));
            case "blankassword":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorCredentials).contains("Looks like you forgot your password there"));

                break;

        }

    }

    public void assertSuccessfulLogin() {
        Assert.assertTrue(commonAPI.getTextByWebElement(homeCampaigns).equalsIgnoreCase("Create Campaign"));
    }

    public void login(String userName, String userPassword) throws InterruptedException {
        clickUiBtnLogin();
        commonAPI.sleepFor(1);
        typeOnUiUserName(userName);
        commonAPI.sleepFor(1);
        typeOnUiPassword(userPassword);
        commonAPI.sleepFor(1);
        clickUiDivRecaptcha();
        commonAPI.sleepFor(2);
        btnLoginSignin();
    }
}
