package TestHomepage;

import ActivityLog.UiActivityLog;
import CreateAds.UiCreateAds;
import CreateGroup.UiCreateGroup;
import CreatePage.UiCreatePage;
import Help.UiHelp;
import Homepage.UiMenuBar;
import Homepage.UiYourAccountMenuTab;
import LandingPage.UiLandingPage;
import ManageAds.UiManageAds;
import ManagePages.UiManagePages;
import NewGroups.UiNewGroups;
import NewsFeedPreferences.UiNewsFeedPreferences;
import ReportProblem.UiReportProblem;
import Settings.UiSettings;
import SupportInbox.UiSupportInbox;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 19-01-2017.
 */
public class TestYourAccountMenu extends CommonMethods{
    public void getYourAccountMenu(){
        signIn();
        UiMenuBar uiMenuBar = PageFactory.initElements(driver,UiMenuBar.class);
        uiMenuBar.getYourAccountMenuTab();
    }
    @Test(priority = 1)
    public void testCreatePage(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getCreatePage();
        UiCreatePage uiCreatePage = PageFactory.initElements(driver,UiCreatePage.class);
        uiCreatePage.assertPage();
    }
    @Test(priority = 2)
    public void testManagePages(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getManagePages();
        UiManagePages uiManagePages = PageFactory.initElements(driver,UiManagePages.class);
        uiManagePages.assertPage();
    }
    @Test(priority = 3)
    public void testCreateGroup() throws InterruptedException {
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getCreateGroup();
        UiCreateGroup uiCreateGroup = PageFactory.initElements(driver,UiCreateGroup.class);
        uiCreateGroup.assertPage();
    }
    @Test(priority = 4)
    public void testNewGroups(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getNewGroups();
        UiNewGroups uiNewGroups = PageFactory.initElements(driver,UiNewGroups.class);
        uiNewGroups.assertPage();
    }
    @Test(priority = 5)
    public void testCreateAds(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getCreateAds();
        UiCreateAds uiCreateAds = PageFactory.initElements(driver,UiCreateAds.class);
        uiCreateAds.assertPage(getTitle());
    }
    @Test(priority = 6)
    public void testManageAds(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getManageAds();
        UiManageAds uiManageAds = PageFactory.initElements(driver,UiManageAds.class);
        uiManageAds.assertPage();
    }
    @Test(priority = 7)
    public void testActivityLog(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getActivityLog();
        UiActivityLog uiActivityLog = PageFactory.initElements(driver, UiActivityLog.class);
        uiActivityLog.assertPage();
    }
    @Test(priority = 8)
    public void testNewsFeedPreferences() throws InterruptedException {
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getNewsFeedPreferences();
        UiNewsFeedPreferences uiNewsFeedPreferences = PageFactory.initElements(driver,UiNewsFeedPreferences.class);
        uiNewsFeedPreferences.assertPage();
    }
    @Test(priority = 9)
    public void testSettings(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getSettings();
        UiSettings uiSettings = PageFactory.initElements(driver,UiSettings.class);
        uiSettings.assertPage();
    }
    @Test(priority = 10)
    public void testLogout(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.Logout();
        UiLandingPage uiLandingPage = PageFactory.initElements(driver, UiLandingPage.class);
        uiLandingPage.assertPage();
    }
    @Test(priority = 11)
    public void testHelp(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getHelp();
        UiHelp uiHelp = PageFactory.initElements(driver,UiHelp.class);
        uiHelp.assertPage();
    }
    @Test(priority = 12)
    public void testSupportInbox(){
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getSupportInbox();
        UiSupportInbox uiSupportInbox = PageFactory.initElements(driver, UiSupportInbox.class);
        uiSupportInbox.assertPage();
    }
    @Test(priority = 13)
    public void testReportProblem() throws InterruptedException {
        getYourAccountMenu();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getReportProblem();
        UiReportProblem uiReportProblem = PageFactory.initElements(driver,UiReportProblem.class);
        uiReportProblem.assertPage();
    }

}
