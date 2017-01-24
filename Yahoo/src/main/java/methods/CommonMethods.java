package methods;

import Ui.ComposePage.UiCompose;
import Ui.LoginPage.UiLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by izran on 1/9/2017.
 */
public class CommonMethods extends GetDriver {
    public static final String YahooUserName = System.getenv("YahooUserName");
    public static final String YahooPassword = System.getenv("YahooPassword");


    public void LogIn(WebDriver driver) throws InterruptedException,IOException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.SetDriver(driver);
        uiLogin.LogIn(YahooUserName,YahooPassword);
    }

    public void HomePage(WebDriver driver) throws InterruptedException {
        //Thread.sleep(1 * 1000);
        try {
            driver.findElement(By.id("uh-mail")).click();
        }catch (Exception ex){
            driver.findElement(By.id("uh-mail")).click();
        }
    }
}
