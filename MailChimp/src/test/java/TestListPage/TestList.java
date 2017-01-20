package TestListPage;

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


//    @Test(priority = 1)
//    public void testCreateEmptyName() throws InterruptedException {
//        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
//        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);
//
//        UiList uiList = PageFactory.initElements(driver, UiList.class);
//        uiList.CreateList("", "list0@gmail.com", "Testo1", "test Desctiption", true, true);
//        uiList.assertIncorrectCreateList("emptyListName");
//    }
//
//    @Test(priority = 2)
//    public void testCreateEmptyFromEmail() throws InterruptedException {
//        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
//        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);
//
//        UiList uiList = PageFactory.initElements(driver, UiList.class);
//        uiList.CreateList("List01", "", "Testo1", "test Desctiption", true, true);
//        uiList.assertIncorrectCreateList("emptyFromEmail");
//    }
//
//    @Test(priority = 3)
//    public void testCreateEmptyFromName() throws InterruptedException {
//        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
//        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);
//
//        UiList uiList = PageFactory.initElements(driver, UiList.class);
//        uiList.CreateList("List01", "list0@gmail.com", "", "test Desctiption", true, true);
//        uiList.assertIncorrectCreateList("emptyFromName");
//    }
//    @Test(priority = 4)
//    public void testCreateEmptyDescription() throws InterruptedException {
//        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
//        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);
//
//        UiList uiList = PageFactory.initElements(driver, UiList.class);
//        uiList.CreateList("List01", "list0@gmail.com", "Testo1", "", true, true);
//        uiList.assertIncorrectCreateList("emptyDescription");
//    }

    @Test(priority = 4)
    public void testDeleteList() throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.DeleteLists();

    }

    @Test(priority = 5 ,dataProvider = "getListData")
    public void testCreateList(String plistName, String pfromEmail, String pfromName, String pdescription) throws InterruptedException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.login(CommonAPI.MailChipUserName, CommonAPI.MailChipPassword);

        UiList uiList = PageFactory.initElements(driver, UiList.class);
        uiList.CreateList( plistName,  pfromEmail,  pfromName,  pdescription,  true,  true);
        //uiList.assertSuccessCreatelist();
    }
    @DataProvider
    public Object[][] getListData() throws IOException {
        String path = System.getProperty("user.dir")+"\\src\\Data\\MailChimp.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(path, 0);
        return ExcelReader.ListToTwoDimensionArray(list);

    }
}