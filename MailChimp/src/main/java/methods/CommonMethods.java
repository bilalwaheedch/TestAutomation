package methods;

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
public class CommonMethods extends GetDriver {
    public static final String MailChipUserName = System.getenv("MailChipUserName");
    public static final String MailChipPassword = System.getenv("MailChipPassword");

    public WebDriver getDriver()throws IOException {
        WebDriver locDriver = null;

        if (useCloudEnv == true) {
            //run in cloud
            locDriver=getCloudDriver(cloudEnv, os, browserName, browserVersion, testName, os_version, resolution);

        } else {
            //run in local
            locDriver=getLocalDriver(os, browserName);

        }

        locDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        locDriver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        locDriver.get(url);
        //locDriver.manage().window().maximize();

        return locDriver;
    }

    public WebDriver getLocalDriver(@Optional("mac") String OS,String browserName){
        WebDriver locDriver = null;
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Win")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            }
            locDriver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
            }else if(OS.equalsIgnoreCase("Win")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            }
            locDriver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
            locDriver = new InternetExplorerDriver();
        }
        return locDriver;

    }
    public WebDriver getLocalGridDriver(String browserName) {
        WebDriver locDriver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            locDriver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
            locDriver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/browser-driver/IEDriverServer.exe");
            locDriver = new InternetExplorerDriver();
        }
        return locDriver;
    }


    public WebDriver getCloudDriver(String env,String os, String browserName,
                                    String browserVersion, String testName, String os_version,String resolution)throws IOException {
        WebDriver locDriver = null;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", os);
        cap.setBrowserName(browserName);
        cap.setCapability("version",browserVersion);
        cap.setCapability("os", os);
        if(env.equalsIgnoreCase("Saucelabs")){
            cap.setCapability("name", testName);
            locDriver = new RemoteWebDriver(new URL("http://"+SAUCE_USERNAME+":"+SAUCE_ACCESS_KEY+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(env.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("os_version", os_version);
            cap.setCapability("resolution", resolution);
            locDriver = new RemoteWebDriver(new URL("http://" + BROWSERSTACK_USERNAME + ":" + BROWSERSTACK_ACCESS_KEY +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return locDriver;
    }

    public void closeDriver(WebDriver driver)  {
        driver.quit();
        driver = null;
    }


    public void signIn(WebDriver driver) throws InterruptedException,IOException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.SetDriver(driver);
        uiLogin.login(MailChipUserName,MailChipPassword);
    }
}
