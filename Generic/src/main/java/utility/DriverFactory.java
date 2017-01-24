package utility;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bilal on 23-01-2017.
 */
public class DriverFactory extends CommonAPI{
    private DriverFactory()
    {
        //Do-nothing..Do not allow to initialize this class from outside
    }
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance()
    {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue() {
            if (useCloudEnv) {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("platform", os);
                cap.setBrowserName(browserName);
                cap.setCapability("version",browserVersion);
                cap.setCapability("os", os);
                cap.setCapability("name", testName);
                if(cloudEnv.equalsIgnoreCase("saucelabs")){
                    try {
                       return new RemoteWebDriver(new URL("http://"+SAUCE_USERNAME+":"+SAUCE_ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub"), cap);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }else if (cloudEnv.equalsIgnoreCase("browserstack")){
                    cap.setCapability("os_version", os_version);
                    cap.setCapability("resolution", resolution);
                    try {
                        return new RemoteWebDriver(new URL("http://" + BROWSERSTACK_USERNAME + ":" + BROWSERSTACK_ACCESS_KEY +"@hub-cloud.browserstack.com/wd/hub"), cap);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }

            }
            else{
                if (browserName.equalsIgnoreCase("chrome")) {
                    if (os.equalsIgnoreCase("Mac")) {
                        System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
                    } else if (os.equalsIgnoreCase("Win")) {
                        System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
                    }
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("profile.default_content_setting_values.notifications", 2);
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setExperimentalOption("prefs", prefs);
                    return new ChromeDriver(chromeOptions);
                } else if (browserName.equalsIgnoreCase("firefox")) {
                    if (os.equalsIgnoreCase("Mac")) {
                        System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");
                    } else if (os.equalsIgnoreCase("Win")) {
                        System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
                    }
                    return new FirefoxDriver();

                } else if (browserName.equalsIgnoreCase("ie")) {
                    System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
                    return new InternetExplorerDriver();
                }
            }
            return null;
        }
    };

    public WebDriver getDriver() // call this method to get the driver object and launch the browser
    {
        return driver.get();
    }

    public void removeDriver() // Quits the driver and closes the browser
    {
        driver.get().quit();
        driver.remove();
    }
}

