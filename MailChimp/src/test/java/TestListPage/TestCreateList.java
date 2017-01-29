package TestListPage;

import Models.MailingList;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.ListPage.UiCreateList;

import utility.DriverFactory;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/22/2017.
 */
public class TestCreateList extends CommonMethods {

    public UiCreateList getPage(WebDriver driver) throws InterruptedException, IOException {
        signIn(driver);
        return PageFactory.initElements(driver, UiCreateList.class);
    }


    @Test
    public void testCreateEmptyName() throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name("");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyListName");

    }

    @Test
    public void testCreateEmptyFromEmail() throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("");
        mailingList.fromName("Testo1");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);

        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyFromEmail");

    }

    @Test
    public void testCreateEmptyFromName() throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("");
        mailingList.description("test Desctiption");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyFromName");
    }

    @Test
    public void testCreateEmptyDescription() throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name("List01");
        mailingList.fromEmail("list0@gmail.com");
        mailingList.fromName("Testo1");
        mailingList.description("");
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        uiList.assertIncorrectCreateList("emptyDescription");
    }


    @Test(dataProvider = "getListDataXLS")
    public void testCreateListXLS(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name(plistName);
        mailingList.fromEmail(pfromEmail);
        mailingList.fromName(pfromName);
        mailingList.description(pdescription);
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        //uiList.assertSuccessCreatelist();
    }

    @DataProvider
    public Object[][] getListDataXLS() throws IOException {
        //0: xls , 1: mysql , 2: mongodb
        return MailingList.getData(0);
    }

    @Test(dataProvider = "getListDataMySql")
    public void testCreateListMySql(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name(plistName);
        mailingList.fromEmail(pfromEmail);
        mailingList.fromName(pfromName);
        mailingList.description(pdescription);
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        //uiList.assertSuccessCreatelist();
    }

    @DataProvider
    public Object[][] getListDataMySql() throws IOException {
        //0: xls , 1: mysql , 2: mongodb
        return MailingList.getData(1);
    }


    @Test(dataProvider = "getListDataMongoDb")
    public void testCreateListMongoDb(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException, IOException {
        MailingList mailingList = new MailingList();
        mailingList.name(plistName);
        mailingList.fromEmail(pfromEmail);
        mailingList.fromName(pfromName);
        mailingList.description(pdescription);
        mailingList.emailSub(true);
        mailingList.emailUnSubs(true);
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCreateList uiList = getPage(driver);
        uiList.CreateList(mailingList);
        //uiList.assertSuccessCreatelist();
    }

    @DataProvider
    public Object[][] getListDataMongoDb() throws IOException {
        //0: xls , 1: mysql , 2: mongodb
        return MailingList.getData(2);
    }



}
