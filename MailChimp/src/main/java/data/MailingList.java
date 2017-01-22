package data;


import utility.ExcelReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by izran on 1/20/2017.
 */
public class MailingList {
    private String name;
    private String fromEmail;
    private String fromName;
    private String description;
    private boolean emailSub;
    private boolean emailUnSubs;

    public String name() {
        return this.name;
    }

    public String fromEmail() {
        return this.fromEmail;
    }

    public String fromName() {
        return this.fromName;
    }

    public String description() {
        return this.description;
    }

    public Boolean emailSub() {
        return this.emailSub;
    }

    public Boolean emailUnSubs() {
        return this.emailUnSubs;
    }


    public void name(String name) {
        this.name = name;
    }

    public void fromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public void fromName(String fromName) {
        this.fromName = fromName;
    }

    public void description(String description) {
        this.description = description;
    }

    public void emailSub(Boolean emailSub) {
        this.emailSub = emailSub;
    }

    public void emailUnSubs(Boolean emailUnSubs) {
        this.emailUnSubs = emailUnSubs;
    }

    public void MailingList() {

    }

    public static String[][] Load() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\MailChimp.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String[][] vArray = ExcelReader.ListToTwoDimensionArray(list);

        return vArray;
    }
}