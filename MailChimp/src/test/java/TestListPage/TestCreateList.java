package TestListPage;

import base.CommonAPI;
import data.MailingList;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.ListPage.UiCreateList;

import ui.LoginPage.UiLogin;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/22/2017.
 */
public class TestCreateList extends CommonMethods {

    public UiCreateList getPage() throws InterruptedException {
        signIn();
        return PageFactory.initElements(driver, UiCreateList.class);
    }

    @Test(priority = 1)
    public void testCreateEmptyName() throws InterruptedException {
        MailingList mailingList = new MailingList();
        mailingList.name("");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        getPage().CreateList(mailingList);
        getPage().assertIncorrectCreateList("emptyListName");
    }

    @Test(priority = 2)
    public void testCreateEmptyFromEmail() throws InterruptedException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        getPage().CreateList(mailingList);
        getPage().assertIncorrectCreateList("emptyFromEmail");
    }

    @Test(priority = 3)
    public void testCreateEmptyFromName() throws InterruptedException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        getPage().CreateList(mailingList);
        getPage().assertIncorrectCreateList("emptyFromName");
    }

    @Test(priority = 4)
    public void testCreateEmptyDescription() throws InterruptedException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        getPage().CreateList(mailingList);
        getPage().assertIncorrectCreateList("emptyDescription");
    }


    @Test(priority = 5, dataProvider = "getListData")
    public void testCreateList(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException {
        MailingList mailingList = new MailingList();
        mailingList.name(plistName);
        mailingList.fromEmail(pfromEmail);
        mailingList.fromName(pfromName);
        mailingList.description(pdescription);
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        getPage().CreateList(mailingList);
        //uiList.assertSuccessCreatelist();
    }

    @DataProvider
    public Object[][] getListData() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\MailChimp.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        return ExcelReader.ListToTwoDimensionArray(list);
    }
}
