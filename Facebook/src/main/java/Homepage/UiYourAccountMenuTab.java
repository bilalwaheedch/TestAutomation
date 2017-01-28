package Homepage;

import ActivityLog.UiActivityLog;
import CreateAds.UiCreateAds;
import CreateGroup.UiCreateGroup;
import CreatePage.UiCreatePage;
import Help.UiHelp;
import LandingPage.UiLandingPage;
import ManageAds.UiManageAds;
import ManagePages.UiManagePages;
import NewGroups.UiNewGroups;
import NewsFeedPreferences.UiNewsFeedPreferences;
import ReportProblem.UiReportProblem;
import Settings.UiSettings;
import SupportInbox.UiSupportInbox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiYourAccountMenuTab extends UiMenuBar {

    WebDriver locDriver = DriverFactory.getInstance().getDriver();

    @FindBy(how = How.XPATH,using=".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[position()>last()-17]/a")
    List<WebElement> elements = new ArrayList<>();

    public UiCreatePage getCreatePage(){
        elements.get(0).click();
        //UiCreatePage uiCreatePage = PageFactory.initElements(locDriver, UiCreatePage.class);
        return PageFactory.initElements(locDriver, UiCreatePage.class);
    }
    public UiManagePages getManagePages(){
        elements.get(1).click();
        return PageFactory.initElements(locDriver, UiManagePages.class);
    }
    public UiCreateGroup getCreateGroup() throws InterruptedException {
        elements.get(2).click();
        sleepFor(2);
        return PageFactory.initElements(locDriver, UiCreateGroup.class);
    }
    public UiNewGroups getNewGroups(){
        elements.get(3).click();
        return PageFactory.initElements(locDriver, UiNewGroups.class);
    }
    public UiCreateAds getCreateAds(){
        elements.get(4).click();
        return PageFactory.initElements(locDriver, UiCreateAds.class);
    }
    public UiManageAds getManageAds(){
        elements.get(5).click();
        return PageFactory.initElements(locDriver, UiManageAds.class);
    }
    public UiActivityLog getActivityLog(){
        elements.get(6).click();
        return PageFactory.initElements(locDriver, UiActivityLog.class);
    }
    public UiNewsFeedPreferences getNewsFeedPreferences() throws InterruptedException {
        elements.get(7).click();
        sleepFor(1);
        return PageFactory.initElements(locDriver, UiNewsFeedPreferences.class);
    }
    public UiSettings getSettings(){
        elements.get(8).click();
        return PageFactory.initElements(locDriver, UiSettings.class);
    }
    public UiLandingPage getLogout(){
        elements.get(9).click();
        return PageFactory.initElements(locDriver,UiLandingPage.class);
    }
    public UiHelp getHelp(){
        elements.get(10).click();
        return PageFactory.initElements(locDriver, UiHelp.class);
    }
    public UiSupportInbox getSupportInbox(){
        elements.get(11).click();
        return PageFactory.initElements(locDriver, UiSupportInbox.class);
    }
    public UiReportProblem getReportProblem() throws InterruptedException {
        elements.get(12).click();
        sleepFor(1);
        return PageFactory.initElements(locDriver, UiReportProblem.class);
    }


}
