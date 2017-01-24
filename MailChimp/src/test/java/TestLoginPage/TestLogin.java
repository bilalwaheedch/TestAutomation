package TestLoginPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.LoginPage.UiLogin;

import java.io.IOException;

/**
 * Created by izran on 1/18/2017.
 */
public class TestLogin extends CommonMethods{

    public UiLogin getPage(WebDriver driver) throws InterruptedException {
        return PageFactory.initElements(driver, UiLogin.class);
    }

    @Test(priority = 1)
    public void testLoginIncorrectCredentials() throws InterruptedException,IOException{
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectUsername");
        closeDriver(driver);
    }
    @Test(priority = 2)
    public void testLoginBlankPassword() throws InterruptedException,IOException {
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.login(CommonMethods.MailChipUserName, "");
        uiLogin.assertIncorrectCredential("blankassword");
        closeDriver(driver);
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword() throws InterruptedException,IOException{
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.login(CommonMethods.MailChipUserName, "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectPassword");
        closeDriver(driver);
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws InterruptedException,IOException {
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.login(CommonAPI.MailChipUserName,CommonAPI.MailChipPassword);
        uiLogin.assertSuccessfulLogin();
        closeDriver(driver);
    }
}
