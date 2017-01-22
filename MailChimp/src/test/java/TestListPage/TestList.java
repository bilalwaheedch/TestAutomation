package TestListPage;

import data.MailingList;
import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.ListPage.UiList;
import ui.LoginPage.UiLogin;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/19/2017.
 */
public class TestList extends CommonMethods {

    @Test(priority = 1)
    public void testDeleteList() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.DeleteLists();

    }

    @Test(priority = 2)
    public void testCreateEmptyName() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        MailingList mailingList = new MailingList();
        mailingList.name("");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyListName");
    }

    @Test(priority = 3)
    public void testCreateEmptyFromEmail() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyFromEmail");
    }

    @Test(priority = 4)
    public void testCreateEmptyFromName() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyFromName");
    }

    @Test(priority = 5)
    public void testCreateEmptyDescription() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyDescription");
    }


    @Test(priority = 6, dataProvider = "getListData")
    public void testCreateList(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        MailingList mailingList = new MailingList();
        mailingList.name(plistName);
        mailingList.fromEmail(pfromEmail);
        mailingList.fromName(pfromName);
        mailingList.description(pdescription);
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList(mailingList);
        //uiList.assertSuccessCreatelist();
    }

    @DataProvider
    public Object[][] getListData() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\MailChimp.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        return ExcelReader.ListToTwoDimensionArray(list);
    }
}