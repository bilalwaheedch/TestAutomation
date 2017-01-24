package TestLoginPage;

import Ui.LoginPage.UiLogin;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by izran on 1/23/2017.
 */
public class TestLogin extends CommonMethods {
    public UiLogin getPage(WebDriver driver) throws InterruptedException, IOException {
        return PageFactory.initElements(driver, UiLogin.class);
    }

    @Test(priority = 1)
    public void testLoginIncorrectCredentials() throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.LogIn("incorrectUserName@yahoo.com", "incorrectPassword");
        closeDriver(driver);
    }

    @Test(priority = 2)
    public void testLoginBlankPassword() throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.LogIn(YahooUserName, "");
        closeDriver(driver);
    }

    @Test(priority = 3)
    public void loginTest() throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        UiLogin uiLogin = getPage(driver);
        uiLogin.SetDriver(driver);
        uiLogin.LogIn(YahooUserName, YahooPassword);
        uiLogin.assertSuccessfulLogin();
        closeDriver(driver);
    }
}
