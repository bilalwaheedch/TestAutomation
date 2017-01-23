package TestListPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ui.ListPage.UiDeleteList;
import ui.ListPage.UiHomeList;
import ui.LoginPage.UiLogin;

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
        WebDriver driver = getDriver();
        UiHomeList uiHomeList = getPage(driver);
        uiHomeList.SetDriver(driver);
        uiHomeList.clickUiList();
        tearDown(driver);
    }


}
