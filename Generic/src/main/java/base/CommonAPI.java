package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bilal on 31-12-2016.
 */
public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url","browser"})

    @BeforeMethod
    public void setUp(String url, char browser){
        switch (browser){
            case 'c': driver = new ChromeDriver(); break;
            case 'f': driver = new FirefoxDriver();break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
