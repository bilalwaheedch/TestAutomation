package TestHomePage;

import Ui.ArchivePage.UiArchivePage;
import Ui.DraftsPage.UiDraftsPage;
import Ui.HomePage.UiLeftMenu;
import Ui.InboxPage.UiInboxPage;
import Ui.SentPage.UiSentPage;
import Ui.SpamPage.UiSpamPage;
import Ui.TrashPage.UiTrashPage;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by izran on 1/23/2017.
 */
public class TestLeftMenu extends CommonMethods {


    public UiLeftMenu getLeftMenu(WebDriver driver) throws InterruptedException, IOException{
        return PageFactory.initElements(driver,UiLeftMenu.class);
    }

    @Test(priority = 1)
    public void testInboxPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiInboxPage uiInboxPage = getLeftMenu(driver).getInboxPage(driver);
        uiInboxPage.SetDriver(driver);
        uiInboxPage.assertPage();
        tearDown(driver);
    }

    @Test(priority = 2)
    public void testDraftsPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiDraftsPage uiDraftsPage=getLeftMenu(driver).getDraftsPage(driver);
        uiDraftsPage.SetDriver(driver);
        uiDraftsPage.assertPage();
        tearDown(driver);
    }

    @Test(priority = 3)
    public void testSendPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiSentPage uiSendPage=getLeftMenu(driver).getSendPage(driver);
        uiSendPage.SetDriver(driver);
        uiSendPage.assertPage();
        tearDown(driver);
    }

    @Test(priority = 4)
    public void testArchivePage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiArchivePage uiArchivePage=getLeftMenu(driver).getArchivePage(driver);
        uiArchivePage.SetDriver(driver);
        uiArchivePage.assertPage();
        tearDown(driver);
    }

    @Test(priority = 5)
    public void testSpamPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiSpamPage uiSpamPage=getLeftMenu(driver).getSpamPage(driver);
        uiSpamPage.SetDriver(driver);
        uiSpamPage.assertPage();
        tearDown(driver);
    }

    @Test(priority = 6)
    public void testCreatePage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiTrashPage uiTrashPage=getLeftMenu(driver).getTrashPage(driver);
        uiTrashPage.SetDriver(driver);
        uiTrashPage.assertPage();
        tearDown(driver);
    }

}
