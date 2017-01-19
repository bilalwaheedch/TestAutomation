package methods;

import LandingPage.UiLandingPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Bilal on 18-01-2017.
 */
public class CommonMethods extends CommonAPI {
    public static final String FacebookUsername = System.getenv("FacebookUsername");
    public static final String FacebookPassword = System.getenv("FacebookPassword");
    public static final String FacebookFullName = System.getenv("FacebookFullName");

    public void signIn(){
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.login(FacebookUsername,FacebookPassword);
        uiLandingPage.assertSuccessfulLogin();
    }
}


