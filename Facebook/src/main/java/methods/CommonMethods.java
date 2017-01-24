package methods;

import LandingPage.UiLandingPage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 18-01-2017.
 */
public class CommonMethods extends CommonAPI {
    public static final String FacebookUsername = System.getenv("FacebookUsername");
    public static final String FacebookPassword = System.getenv("FacebookPassword");
    public static final String FacebookFullName = System.getenv("FacebookFullName");

    public void signIn(WebDriver driver) throws IOException {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.login(FacebookUsername,FacebookPassword);
        uiLandingPage.assertSuccessfulLogin();
    }
}


