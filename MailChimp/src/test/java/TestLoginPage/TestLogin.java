package TestLoginPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.LoginPage.UiLogin;
import utility.DriverFactory;

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
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectUsername");
    }
    @Test(priority = 2)
    public void testLoginBlankPassword() throws InterruptedException,IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.login(CommonMethods.MailChipUserName, "");
        uiLogin.assertIncorrectCredential("blankassword");
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword() throws InterruptedException,IOException{
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.login(CommonMethods.MailChipUserName, "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws InterruptedException,IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.login(CommonAPI.MailChipUserName,CommonAPI.MailChipPassword);
      //  uiLogin.assertSuccessfulLogin();
    }
}
