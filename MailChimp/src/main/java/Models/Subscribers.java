package Models;

import org.bson.Document;
import utility.ConnectDB;
import utility.ExcelReader;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by izran on 1/26/2017.
 */
public class Subscribers {
    private String email;
    private String firstname;
    private String lastname;
    public String email() {
        return this.email;
    }
    public String firstname() {
        return this.firstname;
    }
    public String lastname() { return this.lastname;  }
    public void email(String email) {
        this.email = email;
    }
    public void firstname(String firstname) {
        this.firstname = firstname;
    }
    public void lastname(String lastname) {
        this.lastname = lastname;
    }

    public void Subscribers(){

    }


    private static List<Subscribers> LoadFromXLS() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\Subscribers.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String [][] vArray=ExcelReader.ListToTwoDimensionArray(list);

        List<Subscribers> oSubscribersList = new ArrayList<Subscribers>();

        for (int i = 0; i < vArray.length; i++) {
            Subscribers oEmail = new Subscribers();
            oEmail.email ( vArray[i][0]);
            oEmail.firstname ( vArray[i][1]);
            oEmail.lastname ( vArray[i][2]);

            oSubscribersList.add( oEmail);
        }
        return oSubscribersList;
    }

    private static List<Subscribers> LoadFromMySql() throws IOException {
        List<Subscribers> oSubscribers = new ArrayList<Subscribers>();
        ResultSet rs = null;
        try {
            String sql = "select * from subscriber";
            ConnectDB connectDB = new ConnectDB();
            rs = connectDB.Query(sql);

            while (rs.next()) {
                Subscribers oEmail = new Subscribers();
                oEmail.email ( rs.getString("Email"));
                oEmail.firstname ( rs.getString("FirstName"));
                oEmail.lastname ( rs.getString("LastName"));
                oSubscribers.add(oEmail);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs = null;
            }
        }

        return oSubscribers;
    }

    private static List<Subscribers> LoadFromMongoDB() throws IOException {
        ConnectDB.connectMongoDB();
        List<Subscribers> oSubscribers = new ArrayList<Subscribers>();
        ResultSet rs = null;
        List<Document> documents = ConnectDB.getMongoDBDataDocument("subscriber");
        for (Document document : documents) {
            Subscribers oEmail = new Subscribers();
            oEmail.email ( document.getString("Email"));
            oEmail.firstname ( document.getString("FirstName"));
            oEmail.lastname (document.getString("LastName"));
            oSubscribers.add(oEmail);
        }

        return oSubscribers;
    }

    public static List<Subscribers> Load(int pDBType) throws IOException {
        List<Subscribers> oSubscribers = null;
        switch (pDBType) {
            case 0://xls
                oSubscribers = LoadFromXLS();
                break;
            case 1://mysql
                oSubscribers = LoadFromMySql();
                break;
            case 2://mongodb
                oSubscribers = LoadFromMongoDB();
                break;
        }

        return oSubscribers;
    }
}
