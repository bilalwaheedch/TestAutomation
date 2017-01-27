package TestListPage;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ui.ListPage.UiHomeList;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by izran on 1/22/2017.
 */
public class TestHomeList extends CommonMethods {

    public UiHomeList getPage(WebDriver driver) throws InterruptedException,IOException {
        signIn(driver);
        return PageFactory.initElements(driver, UiHomeList.class);
    }
    @Test(priority = 1)
    public void testHomeList() throws InterruptedException,IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();;
        UiHomeList uiHomeList = getPage(driver);
        uiHomeList.clickUiList();

    }


}
