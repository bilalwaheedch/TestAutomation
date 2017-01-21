package ui.ListPage;

import data.MailingList;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/19/2017.
 */
public class UiList extends CommonMethods {

    @FindBy(how = How.XPATH, using = "//*[@aria-label='Lists: Create lists, add subscribers, create sign up forms']")
    public WebElement hrList;

    @FindBy(how = How.XPATH, using = ".//*[@id='content']/div[1]/a")//.//*[@id='add-list-btn']")
    public WebElement hrCreateList;

    @FindBy(how = How.XPATH, using = ".//*[@id='list-or-group']/div/div/a[1]")//.//*[@id='content']/div[1]/a
    public WebElement hrCreateList1;

    @FindBy(how = How.XPATH, using = ".//*[@id='name']")
    public WebElement txtListName;

    @FindBy(how = How.XPATH, using = ".//*[@id='default-fromemail']")
    public WebElement txtDefaultFromEmail;

    @FindBy(how = How.XPATH, using = ".//*[@id='from_name']")
    public WebElement txtDefaulFromName;

    @FindBy(how = How.XPATH, using = ".//*[@id='description']")
    public WebElement txtDesciption;

    @FindBy(how = How.XPATH, using = ".//*[@id='email_subs']")
    public WebElement chkEmailSubs;

    @FindBy(how = How.XPATH, using = ".//*[@id='email_unsubs']")
    public WebElement chkEmailUnSubs;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list-save']")
    public WebElement btnSave;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list-response']/p")
    public WebElement pCreateListMessage;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list']/div/div[1]/div[1]/span")
    public WebElement errorListName;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list']/div/div[1]/div[2]/span")
    public WebElement errorFromEmail;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list']/div/div[1]/div[3]/span")
    public WebElement errorFromName;

    @FindBy(how = How.XPATH, using = ".//*[@id='new-list']/div/div[1]/div[4]/span")
    public WebElement errorDescription;


    @FindBy(how = How.XPATH, using = ".//*[@id='dojox_form_TriStateCheckBox_0']")
    public WebElement chkDeleteLists;

    @FindBy(how = How.XPATH, using = ".//*[@id='delete-btn']")
    public WebElement btnDeleteLists;

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit_form_Button_1_label']")
    public WebElement btnDeleteListsConfirm;

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit__Templated_2-confirm-text']")
    public WebElement txtConfirmText;



    public void clickUiList() {
        hrList.click();
    }

    public void clickCreateList() {

        clickByElement(hrCreateList);
    }
    public void clickCreateList1() {
        if (isElementPresent(hrCreateList1)) {
            clickByElement(hrCreateList1);
        }
    }
    public void typeOnUiListName(String listName) {
        typeByElement(txtListName, listName);
    }

    public void typeOnUidefaultFromEmail(String defaultFromEmail) {
        typeByElement(txtDefaultFromEmail, defaultFromEmail);
    }

    public void typeOnUidefaulFromName(String defaulFromName) {
        typeByElement(txtDefaulFromName, defaulFromName);
    }

    public void typeOnUidesciption(String desciption) {
        typeByElement(txtDesciption, desciption);
    }

    public void clickUiEmailSubs() {
        chkEmailSubs.click();
    }

    public void clickUiChkEmailUnSubs() {
        chkEmailUnSubs.click();
    }

    public void clickUiSave() {
        btnSave.click();
    }

    public void clickChkDeleteLists() {
        chkDeleteLists.click();
    }

    public void clickDeleteLists() {
        btnDeleteLists.click();
    }

    public void clickConfirmDeleteLists() {
        btnDeleteListsConfirm.click();
    }

    public void clickDeleteListsConfirm() {
        btnDeleteListsConfirm.click();
    }

    public void assertIncorrectCreateList(String condition) {
        switch (condition) {
            case "emptyListName":
                Assert.assertTrue(getTextByWebElement(errorListName).contains("Please enter a value"));
                break;
            case "emptyFromEmail":
                Assert.assertTrue(getTextByWebElement(errorFromEmail).contains("Please enter a value"));
                break;
            case "emptyFromName":
                Assert.assertTrue(getTextByWebElement(errorFromName).contains("Please enter a value"));
                break;
            case "emptyDescription":
                Assert.assertTrue(getTextByWebElement(errorDescription).contains("Please enter a value"));
                break;
        }

    }

    public void assertSuccessCreatelist() {
        Assert.assertTrue(getTextByWebElement(pCreateListMessage).equalsIgnoreCase("Excellent! You have a brand new list"));
    }

    public void CreateList(MailingList mailingList) throws InterruptedException {

        clickUiList();
        sleepFor(1);
        clickCreateList();
        sleepFor(1);
        clickCreateList1();
        typeOnUiListName(mailingList.name);
        sleepFor(1);
        typeOnUidefaultFromEmail(mailingList.fromEmail);
        sleepFor(1);
        typeOnUidefaulFromName(mailingList.fromName);
        sleepFor(1);
        typeOnUidesciption(mailingList.description);
        sleepFor(1);
        if (mailingList.emailSub) clickUiEmailSubs();
        if (mailingList.emailUnSubs) clickUiChkEmailUnSubs();


        sleepFor(1);
        clickUiSave();
    }


    public void DeleteLists() throws InterruptedException {
        clickUiList();
        sleepFor(1);
        if (isElementPresent(chkDeleteLists)) {
            clickChkDeleteLists();
            sleepFor(1);

            clickDeleteLists();
            sleepFor(2);
            typeByElement(txtConfirmText, "DELETE");
            clickDeleteListsConfirm();
            sleepFor(2);
        }
    }
}
