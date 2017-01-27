package TestListPage;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.ListPage.UiDeleteList;
import utility.DriverFactory;

import java.io.IOException;


/**
 * Created by izran on 1/22/2017.
 */
public class TestDeleteList  extends CommonMethods {

    public UiDeleteList getPage(WebDriver driver) throws InterruptedException,IOException {
        signIn(driver);
        return PageFactory.initElements(driver, UiDeleteList.class);
    }

    @Test(priority = 1)
    public void testDeleteList() throws InterruptedException,IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiDeleteList uiList = getPage(driver);
        uiList.DeleteLists();

    }
}
