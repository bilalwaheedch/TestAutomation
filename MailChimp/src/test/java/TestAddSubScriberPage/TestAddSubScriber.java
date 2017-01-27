package TestAddSubScriberPage;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.ListPage.UiAddSubscriber;
import ui.ListPage.UiHomeList;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by izran on 1/25/2017.
 */
public class TestAddSubScriber extends CommonMethods {
    public UiAddSubscriber getPage(WebDriver driver) throws InterruptedException,IOException {
        signIn(driver);
        return PageFactory.initElements(driver, UiAddSubscriber.class);
    }
    @Test(priority = 1)
    public void testAddSubScribe() throws InterruptedException,IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();;
        UiAddSubscriber uiAddSubscriber = getPage(driver);
        uiAddSubscriber.AddSubscribe();
    }
}
