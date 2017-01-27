package methods;

import base.CommonAPI;
import utility.DriverFactory;
import utility.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import ui.LoginPage.UiLogin;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by izran on 1/18/2017.
 */
public class CommonMethods extends CommonAPI {
    public static final String MailChipUserName = System.getenv("MailChipUserName");
    public static final String MailChipPassword = System.getenv("MailChipPassword");

    private WebDriver driver = DriverFactory.getInstance().getDriver();


    public void signIn(WebDriver driver) throws InterruptedException, IOException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(MailChipUserName, MailChipPassword);
    }
}
