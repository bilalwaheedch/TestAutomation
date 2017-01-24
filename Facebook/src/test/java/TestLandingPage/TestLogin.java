package TestLandingPage;

import LandingPage.UiLandingPage;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 18-01-2017.
 */
public class TestLogin extends CommonMethods{
    public UiLandingPage uiLandingPage(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver,UiLandingPage.class);
    }
    @Test
    public void testLoginIncorrectCredentials(){
        uiLandingPage().login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        uiLandingPage().assertIncorrectCredential("incorrectUsername");
    }
    @Test
    public void testLoginBlankPassword(){
        uiLandingPage().login(FacebookUsername, "");
        uiLandingPage().assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword(){
        uiLandingPage().login(FacebookUsername, "incorrectPassword");
        uiLandingPage().assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws IOException {
        uiLandingPage().login(FacebookUsername,FacebookPassword);
    }
}
