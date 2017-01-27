package data;

import utility.ExcelReader;

import java.io.IOException;
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

    public static Subscribers[] Load() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\Subscribers.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String [][] vArray=ExcelReader.ListToTwoDimensionArray(list);
        Subscribers[] oSubscribersList = new Subscribers[vArray.length];
        for (int i = 0; i < vArray.length; i++) {
            Subscribers oEmails = new Subscribers();
            oEmails.email ( vArray[i][0]);
            oEmails.firstname ( vArray[i][1]);
            oEmails.lastname ( vArray[i][2]);

            oSubscribersList[i] =  oEmails;
        }
        return oSubscribersList;

    }
}
