package TestHomepage;

import Help.UiHelp;
import Homepage.UiMenuBar;
import Homepage.UiYourAccountMenuTab;
import LandingPage.UiLandingPage;
import ReportProblem.UiReportProblem;
import SupportInbox.UiSupportInbox;
import methods.CommonMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 19-01-2017.
 */
public class TestYourAccountMenu extends CommonMethods{
    public UiYourAccountMenuTab getYourAccountMenu() throws IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        signIn(driver);
        UiMenuBar uiMenuBar = PageFactory.initElements(driver,UiMenuBar.class);
        uiMenuBar.getYourAccountMenuTab();
        return PageFactory.initElements(driver, UiYourAccountMenuTab.class);
    }
    @Test
    public void testCreatePage() throws IOException {
        getYourAccountMenu().getCreatePage().assertPage();

    }
    @Test
    public void testManagePages() throws IOException {
        getYourAccountMenu().getManagePages().assertPage();
    }
    @Test
    public void testCreateGroup() throws InterruptedException, IOException {
        getYourAccountMenu().getCreateGroup().assertPage();
    }
    @Test
    public void testNewGroups() throws IOException{
        getYourAccountMenu().getNewGroups().assertPage();
    }
    @Test
    public void testCreateAds() throws IOException{
        getYourAccountMenu().getCreateAds().assertPage();
    }
    @Test
    public void testManageAds() throws IOException{
        getYourAccountMenu().getManageAds().assertPage();
    }
    @Test(priority = 7)
    public void testActivityLog() throws IOException{
        getYourAccountMenu().getActivityLog().assertPage();
    }
    @Test
    public void testNewsFeedPreferences() throws InterruptedException, IOException {
        getYourAccountMenu().getNewsFeedPreferences().assertPage();
    }
    @Test
    public void testSettings() throws IOException {
        getYourAccountMenu().getSettings().assertPage();
    }
    @Test
    public void testLogout() throws IOException {
        getYourAccountMenu().getLogout().assertPage();
    }
    @Test
    public void testHelp() throws IOException {
        getYourAccountMenu().getHelp().assertPage();
    }
    @Test
    public void testSupportInbox() throws IOException {
        getYourAccountMenu().getSupportInbox().assertPage();
    }
    @Test
    public void testReportProblem() throws InterruptedException, IOException {
        getYourAccountMenu().getReportProblem().assertPage();
    }

}
