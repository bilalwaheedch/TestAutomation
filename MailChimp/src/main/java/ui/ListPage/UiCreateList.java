package ui.ListPage;

import base.CommonAPI;
import data.MailingList;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by izran on 1/22/2017.
 */
public class UiCreateList  extends CommonMethods {
    CommonAPI commonAPI;
    WebDriver locDriver = null;

    final String shrList="//*[@aria-label='Lists: Create lists, add subscribers, create sign up forms']";
    @FindBy(how = How.XPATH, using = shrList)
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


    public void SetDriver(WebDriver locDriver) throws IOException {
        commonAPI=new  CommonAPI();
        commonAPI.setDriver(locDriver);
    }

    public void clickUiList() {
        hrList.click();
    }

    public void clickCreateList() {

        commonAPI.clickByElement(hrCreateList);
    }

    public void clickCreateList1() {
        if (commonAPI.isElementPresent(hrCreateList1)) {
            commonAPI.clickByElement(hrCreateList1);
        }
    }

    public void typeOnUiListName(String listName) {
        commonAPI.typeByElement(txtListName, listName);
    }

    public void typeOnUidefaultFromEmail(String defaultFromEmail) {
        commonAPI.typeByElement(txtDefaultFromEmail, defaultFromEmail);
    }

    public void typeOnUidefaulFromName(String defaulFromName) {
        commonAPI.typeByElement(txtDefaulFromName, defaulFromName);
    }

    public void typeOnUidesciption(String desciption) {
        commonAPI.typeByElement(txtDesciption, desciption);
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

    public void assertIncorrectCreateList(String condition) {
        switch (condition) {
            case "emptyListName":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorListName).contains("Please enter a value"));
                break;
            case "emptyFromEmail":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorFromEmail).contains("Please enter a value"));
                break;
            case "emptyFromName":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorFromName).contains("Please enter a value"));
                break;
            case "emptyDescription":
                Assert.assertTrue(commonAPI.getTextByWebElement(errorDescription).contains("Please enter a value"));
                break;
        }

    }

    public void assertSuccessCreatelist() {
        Assert.assertTrue(commonAPI.getTextByWebElement(pCreateListMessage).equalsIgnoreCase("Excellent! You have a brand new list"));
    }

    public void CreateList(MailingList mailingList) throws InterruptedException {
        clickUiList();
        commonAPI.sleepFor(1);
        clickCreateList();
        commonAPI.sleepFor(1);
        clickCreateList1();
        typeOnUiListName(mailingList.name());
        commonAPI.sleepFor(1);
        typeOnUidefaultFromEmail(mailingList.fromEmail());
        commonAPI.sleepFor(1);
        typeOnUidefaulFromName(mailingList.fromName());
        commonAPI.sleepFor(1);
        typeOnUidesciption(mailingList.description());
        commonAPI.sleepFor(1);
        if (mailingList.emailSub()) clickUiEmailSubs();
        if (mailingList.emailUnSubs()) clickUiChkEmailUnSubs();

        commonAPI.sleepFor(1);
        clickUiSave();

    }
}
