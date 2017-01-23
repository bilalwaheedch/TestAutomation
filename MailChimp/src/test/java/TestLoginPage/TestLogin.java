package TestLoginPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.ListPage.UiHomeList;
import ui.LoginPage.UiLogin;

/**
 * Created by izran on 1/18/2017.
 */
public class TestLogin extends CommonMethods{
    public UiLogin getPage() throws InterruptedException {
        return PageFactory.initElements(driver, UiLogin.class);
    }

    @Test(priority = 1)
    public void testLoginIncorrectCredentials() throws InterruptedException{
        UiLogin uiLogin = getPage();
        uiLogin.login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectUsername");
    }
    @Test(priority = 2)
    public void testLoginBlankPassword() throws InterruptedException{
        UiLogin uiLogin = getPage();
        uiLogin.login(CommonMethods.MailChipUserName, "");
        uiLogin.assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword() throws InterruptedException{
        UiLogin uiLogin = getPage();
        uiLogin.login(CommonMethods.MailChipUserName, "incorrectPassword");
        uiLogin.assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws InterruptedException {
        UiLogin uiLogin = getPage();
        uiLogin.login(CommonAPI.MailChipUserName,CommonAPI.MailChipPassword);
    }
}
