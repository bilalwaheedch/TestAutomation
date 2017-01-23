package TestEmail;

import Ui.ComposePage.UiCompose;
import data.Email;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/9/2017.
 */
public class TestSendEmail extends CommonMethods {
    public UiCompose getPage(WebDriver driver) throws InterruptedException, IOException {
        LogIn(driver);
        return PageFactory.initElements(driver, UiCompose.class);
    }


    @Test(dataProvider = "getData")
    public void SendEmailTest(String toEmail, String subject, String body) throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        UiCompose uiCompose = getPage(driver);
        uiCompose.SetDriver(driver);
        Email oEmail =new Email();
        oEmail.toEmail(toEmail);
        oEmail.subject(subject);
        oEmail.body(body);

        uiCompose.SendEmails(oEmail);
        tearDown(driver);
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        List<List<String>> list = ExcelReader.readExcelFile("Data/Book1.xls", 0);

        return ExcelReader.ListToTwoDimensionArray(list);
    }
}