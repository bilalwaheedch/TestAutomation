package methods;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import ui.LoginPage.UiLogin;

/**
 * Created by izran on 1/18/2017.
 */
public class CommonMethods extends CommonAPI  {
    public static final String MailChipUserName = System.getenv("MailChipUserName");
    public static final String MailChipPassword = System.getenv("MailChipPassword");

    public void signIn() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(MailChipUserName,MailChipPassword);
        uiLogin.assertSuccessfulLogin();
    }
}
