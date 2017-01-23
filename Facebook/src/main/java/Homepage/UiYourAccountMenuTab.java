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
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiYourAccountMenuTab extends UiMenuBar {

    @FindBy(how = How.XPATH,using=".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[position()>last()-17]/a")
    List<WebElement> elements = new ArrayList<>();

    public UiCreatePage getCreatePage(WebDriver driver){
        elements.get(0).click();
        //UiCreatePage uiCreatePage = PageFactory.initElements(driver, UiCreatePage.class);
        return PageFactory.initElements(driver, UiCreatePage.class);
    }
    public UiManagePages getManagePages(WebDriver driver){
        elements.get(1).click();
        return PageFactory.initElements(driver, UiManagePages.class);
    }
    public UiCreateGroup getCreateGroup(WebDriver driver) throws InterruptedException {
        elements.get(2).click();
        sleepFor(1);
        return PageFactory.initElements(driver, UiCreateGroup.class);
    }
    public UiNewGroups getNewGroups(WebDriver driver){
        elements.get(3).click();
        return PageFactory.initElements(driver, UiNewGroups.class);
    }
    public UiCreateAds getCreateAds(WebDriver driver){
        elements.get(4).click();
        return PageFactory.initElements(driver, UiCreateAds.class);
    }
    public UiManageAds getManageAds(WebDriver driver){
        elements.get(5).click();
        return PageFactory.initElements(driver, UiManageAds.class);
    }
    public UiActivityLog getActivityLog(WebDriver driver){
        elements.get(6).click();
        return PageFactory.initElements(driver, UiActivityLog.class);
    }
    public UiNewsFeedPreferences getNewsFeedPreferences(WebDriver driver) throws InterruptedException {
        elements.get(7).click();
        sleepFor(1);
        return PageFactory.initElements(driver, UiNewsFeedPreferences.class);
    }
    public UiSettings getSettings(WebDriver driver){
        elements.get(8).click();
        return PageFactory.initElements(driver, UiSettings.class);
    }
    public UiLandingPage getLogout(WebDriver driver){
        elements.get(9).click();
        return PageFactory.initElements(driver,UiLandingPage.class);
    }
    public UiHelp getHelp(WebDriver driver){
        elements.get(10).click();
        return PageFactory.initElements(driver, UiHelp.class);
    }
    public UiSupportInbox getSupportInbox(WebDriver driver){
        elements.get(11).click();
        return PageFactory.initElements(driver, UiSupportInbox.class);
    }
    public UiReportProblem getReportProblem(WebDriver driver) throws InterruptedException {
        elements.get(12).click();
        sleepFor(1);
        return PageFactory.initElements(driver, UiReportProblem.class);
    }


}
