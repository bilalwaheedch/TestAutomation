package TestLandingPage;

import LandingPage.UiLandingPage;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Bilal on 18-01-2017.
 */
public class TestLogin extends CommonMethods{
    @Test(priority = 1)
    public void testLoginIncorrectCredentials(){
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        uiLandingPage.assertIncorrectCredential("incorrectUsername");
    }
    @Test(priority = 2)
    public void testLoginBlankPassword(){
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.login(FacebookUsername, "");
        uiLandingPage.assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword(){
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.login(FacebookUsername, "incorrectPassword");
        uiLandingPage.assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws IOException {
        signIn();
    }
}
