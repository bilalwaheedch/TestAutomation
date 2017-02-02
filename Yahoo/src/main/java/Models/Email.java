package Models;

import utility.ConnectDB;
import utility.ExcelReader;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

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

    private static List<Email> LoadFromXLS() throws IOException {
        List<Email> oEmails = new ArrayList<Email>();

        String vPpath = "Data/Book1.xls";
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String[][] vArray = ExcelReader.ListToTwoDimensionArray(list);

        for (int i = 0; i < vArray.length; i++) {
            Email oEmail = new Email();
            oEmail.toEmail(vArray[i][0]);
            oEmail.subject(vArray[i][1]);
            oEmail.body(vArray[i][2]);
            oEmails.add(oEmail);
        }
        return oEmails;
    }

    private static List<Email> LoadFromMySql() throws IOException {
        List<Email> oEmails = new ArrayList<Email>();
        ResultSet rs = null;
        try {
            String sql = "select * from emailstosend";
            ConnectDB connectDB = new ConnectDB();
            rs = connectDB.Query(sql);
            Email oEmail;

            while (rs.next()) {
                oEmail = new Email();
                oEmail.toEmail(rs.getString("email"));
                oEmail.subject(rs.getString("subject"));
                oEmail.body(rs.getString("body"));
                oEmails.add(oEmail);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs = null;
            }
        }

        return oEmails;
    }

    private static List<Email> LoadFromMongoDB() throws IOException {
        ConnectDB.connectMongoDB();
        List<Email> oEmails = new ArrayList<Email>();
        ResultSet rs = null;
        List<Document> documents = ConnectDB.getMongoDBDataDocument("emailstosend");
        for (Document document : documents) {
            System.out.println(document);
            Email oEmail = new Email();
            oEmail.toEmail(document.getString("email"));
            oEmail.subject(document.getString("subject"));
            oEmail.body(document.getString("body"));
            oEmails.add(oEmail);
        }

        return oEmails;
    }

    public static List<Email> Load(int pDBType) throws IOException {
        List<Email> oEmails = null;
        switch (pDBType) {
            case 0://xls
                oEmails = LoadFromXLS();
                break;
            case 1://mysql
                oEmails = LoadFromMySql();
                break;
            case 2://mongodb
                oEmails = LoadFromMongoDB();
                break;
        }

        return oEmails;
    }

    public static String[][] getData(int pDBType) throws IOException {
        List<Email> oEmails = Load(pDBType);
        String[][] twoDimensionArray = new String[oEmails.size()][];
        int i = 0;
        for (Email emmail : oEmails) {
            twoDimensionArray[i++] = new String[]{emmail.toEmail(), emmail.subject(), emmail.body()};
        }
        return twoDimensionArray;
    }
}
