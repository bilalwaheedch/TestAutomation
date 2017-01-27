package ui.ListPage;

import data.Subscribers;
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by izran on 1/25/2017.
 */
public class UiAddSubscriber  extends CommonMethods {
    @FindBy(how = How.XPATH, using = "//a[@aria-label='Lists: Create lists, add subscribers, create sign up forms']")
    public WebElement hrList;

    @FindBy(how = How.XPATH, using = ".//*[@id='lists']/li/div[1]/div[2]/a/span")
    public List<WebElement> hrLists = new ArrayList<>();

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit__FocusMixin_0']/li/span/span")
    public List<WebElement> hrTabs = new ArrayList<>();

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit__FocusMixin_3']/li[1]/a")
    public static WebElement hrAddSubscriber;

    @FindBy(how = How.XPATH, using = ".//*[@id='MERGE0']")
    public static WebElement txtEmail;

    @FindBy(how = How.XPATH, using = ".//*[@id='MERGE1']")
    public static WebElement txtFirstName;

    @FindBy(how = How.XPATH, using = ".//*[@id='MERGE2']")
    public static WebElement txtLastName;

    @FindBy(how = How.XPATH, using = ".//*[@id='optin-confirm']")
    public static WebElement chkOptinConfirm;

    @FindBy(how = How.XPATH, using = ".//*[@id='update-existing']")
    public static WebElement chkupDateExisting;

    @FindBy(how = How.XPATH, using = ".//*[@id='add-member-form-button']")
    public static WebElement btnAddMemberForm;

    public void clickUiList() {
        //waitUntilClickAble(By.xpath("//a[@aria-label='Lists: Create lists, add subscribers, create sign up forms']"));
        hrList.click();
    }

    public void AddSubscribe() throws  InterruptedException,IOException {
        clickUiList();

        Subscribers[] oSubscribersList= Subscribers.Load();
        for(WebElement list : hrLists) {
           // System.out.println(list.getText());

            clickByElement(list);
            //WebElement t = hrTabs.get(2);
           // System.out.println(t.getText());
            sleepFor(1);
            for (Subscribers subscribers:oSubscribersList) {
                String s=subscribers.email();
                txtEmail.clear();
                typeByElement(txtEmail,subscribers.email());
                sleepFor(1);
                txtFirstName.clear();
                typeByElement(txtFirstName,subscribers.firstname());
                sleepFor(1);
                txtLastName.clear();
                typeByElement(txtLastName,subscribers.lastname());
                sleepFor(1);
                clickByElement(chkOptinConfirm);
                clickByElement(chkupDateExisting);
                clickByElement(btnAddMemberForm);
                sleepFor(2);
            }
         }
    }
}
