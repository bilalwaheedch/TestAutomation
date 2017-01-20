package Homepage;

import ActivityLog.UiActivityLog;
import CreateAds.UiCreateAds;
import CreateGroup.UiCreateGroup;
import CreatePage.UiCreatePage;
import Help.UiHelp;
import ManageAds.UiManageAds;
import ManagePages.UiManagePages;
import NewGroups.UiNewGroups;
import NewsFeedPreferences.UiNewsFeedPreferences;
import ReportProblem.UiReportProblem;
import Settings.UiSettings;
import SupportInbox.UiSupportInbox;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiYourAccountMenuTab extends CommonMethods {
    @FindBy(how = How.XPATH,using=".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[position()>last()-17]/a")
    List<WebElement> elements = new ArrayList<>();


    public UiCreatePage getCreatePage(){
        elements.get(0).click();
        return new UiCreatePage();
    }
    public UiManagePages getManagePages(){
        elements.get(1).click();
        return new UiManagePages();
    }
    public UiCreateGroup getCreateGroup(){
        elements.get(2).click();
        return new UiCreateGroup();
    }
    public UiNewGroups getNewGroups(){
        elements.get(3).click();
        return new UiNewGroups();
    }
    public UiCreateAds getCreateAds(){
        elements.get(4).click();
        return new UiCreateAds();
    }
    public UiManageAds getManageAds(){
        elements.get(5).click();
        return new UiManageAds();
    }
    public UiActivityLog getActivityLog(){
        elements.get(6).click();
        return new UiActivityLog();
    }
    public UiNewsFeedPreferences getNewsFeedPreferences(){
        elements.get(7).click();
        return new UiNewsFeedPreferences();
    }
    public UiSettings getSettings(){
        elements.get(8).click();
        return new UiSettings();
    }
    public void Logout(){
        elements.get(9).click();
    }
    public UiHelp getHelp(){
        elements.get(10).click();
        return new UiHelp();
    }
    public UiSupportInbox getSupportInbox(){
        elements.get(11).click();
        return new UiSupportInbox();
    }
    public UiReportProblem getReportProblem(){
        elements.get(12).click();
        return new UiReportProblem();
    }


}
