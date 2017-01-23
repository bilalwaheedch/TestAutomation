package data;

import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/23/2017.
 */
public class Email {
    private String toEmail;
    private String subject;
    private String body;

    public String toEmail() {
        return this.toEmail;
    }

    public String subject() {
        return this.subject;
    }

    public String body() {
        return this.body;
    }


    public void toEmail(String name) {
        this.toEmail = name;
    }

    public void subject(String fromEmail) {
        this.subject = fromEmail;
    }

    public void body(String body) {
        this.body = body;
    }

    public void Email() {

    }

    public static Email[] Load() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\Book1.xls";
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String[][] vArray = ExcelReader.ListToTwoDimensionArray(list);
        Email[] oEmails = new Email[vArray.length];
        for (int i = 0; i < vArray.length; i++) {
            Email oEmail = new Email();
            oEmail.toEmail(vArray[i][0]);
            oEmail.subject(vArray[i][1]);
            oEmail.body(vArray[i][2]);
            oEmails[i] = oEmail;
        }
        return oEmails;

    }
}
