package TestListPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.ListPage.UiCreateList;
import ui.ListPage.UiDeleteList;
import ui.LoginPage.UiLogin;


/**
 * Created by izran on 1/22/2017.
 */
public class TestDeleteList  extends CommonMethods {
    public UiDeleteList getPage() throws InterruptedException {
        signIn();
        return PageFactory.initElements(driver, UiDeleteList.class);
    }

    @Test(priority = 1)
    public void testDeleteList() throws InterruptedException {
        UiDeleteList uiList = getPage();
        uiList.DeleteLists();
    }
}
