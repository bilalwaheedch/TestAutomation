package compose;

import base.CommonAPI;
import methods.CommonMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/9/2017.
 */
public class TestSendEmail extends CommonMethods {

    @Test(dataProvider = "getData")
    public void SendEmailTest(String toEmail, String subject, String body) throws InterruptedException {
        LogIn(CommonAPI.YahooUserName,CommonAPI.YahooPassword);
        SendEmails(toEmail, subject, body);
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        List<List<String>> list = ExcelReader.readExcelFile("Data/Book1.xls", 0);

        return ExcelReader.ListToTwoDimensionArray(list);
    }
}