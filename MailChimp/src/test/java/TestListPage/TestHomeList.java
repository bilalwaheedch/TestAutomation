package TestListPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ui.ListPage.UiDeleteList;
import ui.ListPage.UiHomeList;
import ui.LoginPage.UiLogin;

/**
 * Created by izran on 1/22/2017.
 */
public class TestHomeList extends CommonMethods {
    public UiHomeList getPage() throws InterruptedException {
        signIn();
        return PageFactory.initElements(driver, UiHomeList.class);
    }
    @Test(priority = 1)
    public void testHomeList() throws InterruptedException {
        getPage().clickUiList();
        sleepFor(1);
    }


}
