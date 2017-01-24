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

    @Test
    public void testInboxPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiInboxPage uiInboxPage = getLeftMenu(driver).getInboxPage(driver);
        uiInboxPage.SetDriver(driver);
        uiInboxPage.assertPage();
        tearDown(driver);
    }

    @Test
    public void testDraftsPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiDraftsPage uiDraftsPage=getLeftMenu(driver).getDraftsPage(driver);
        uiDraftsPage.SetDriver(driver);
        uiDraftsPage.assertPage();
        tearDown(driver);
    }

    @Test
    public void testSendPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiSentPage uiSendPage=getLeftMenu(driver).getSendPage(driver);
        uiSendPage.SetDriver(driver);
        uiSendPage.assertPage();
        tearDown(driver);
    }

    @Test
    public void testArchivePage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiArchivePage uiArchivePage=getLeftMenu(driver).getArchivePage(driver);
        uiArchivePage.SetDriver(driver);
        uiArchivePage.assertPage();
        tearDown(driver);
    }

    @Test
    public void testSpamPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiSpamPage uiSpamPage=getLeftMenu(driver).getSpamPage(driver);
        uiSpamPage.SetDriver(driver);
        uiSpamPage.assertPage();
        tearDown(driver);
    }

    @Test
    public void testTrashPage() throws InterruptedException, IOException{
        WebDriver driver = getDriver();
        LogIn(driver);
        HomePage(driver);
        UiTrashPage uiTrashPage=getLeftMenu(driver).getTrashPage(driver);
        uiTrashPage.SetDriver(driver);
        uiTrashPage.assertPage();
        tearDown(driver);
    }

}
