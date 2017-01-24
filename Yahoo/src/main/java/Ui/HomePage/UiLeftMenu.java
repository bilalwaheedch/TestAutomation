package Ui.HomePage;

import Ui.ArchivePage.UiArchivePage;
import Ui.DraftsPage.UiDraftsPage;
import Ui.InboxPage.UiInboxPage;
import Ui.SentPage.UiSentPage;
import Ui.SpamPage.UiSpamPage;
import Ui.TrashPage.UiTrashPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by izran on 1/23/2017.
 */
public class UiLeftMenu {
    @FindBy(how = How.XPATH,using="//ul[@id='storm-listnav']/li/a")
    List<WebElement> elements = new ArrayList<>();

    public UiInboxPage getInboxPage(WebDriver driver){
        elements.get(1).click();
        return PageFactory.initElements(driver, UiInboxPage.class);
    }

    public UiDraftsPage getDraftsPage(WebDriver driver){
        elements.get(3).click();
        return PageFactory.initElements(driver, UiDraftsPage.class);
    }

    public UiSentPage getSendPage(WebDriver driver){
        elements.get(4).click();
        return PageFactory.initElements(driver, UiSentPage.class);
    }

    public UiArchivePage getArchivePage(WebDriver driver){
        elements.get(5).click();
        return PageFactory.initElements(driver, UiArchivePage.class);
    }

    public UiSpamPage getSpamPage(WebDriver driver){
        elements.get(6).click();
        return PageFactory.initElements(driver, UiSpamPage.class);
    }

    public UiTrashPage getTrashPage(WebDriver driver){
        elements.get(7).click();
        return PageFactory.initElements(driver, UiTrashPage.class);
    }

}
