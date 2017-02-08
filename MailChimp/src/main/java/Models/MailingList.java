package Models;


import org.bson.Document;
import utility.ConnectDB;
import utility.ExcelReader;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by izran on 1/20/2017.
 */
public class MailingList  {
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
    public String fromName() { return this.fromName;  }
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

    public void MailingList(){

    }

    public static MailingList[] Load() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\MailChimp.xls";//"Data\\MailChimp.xls"
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String [][] vArray=ExcelReader.ListToTwoDimensionArray(list);
        MailingList[] oMlists = new MailingList[vArray.length];
        for (int i = 0; i < vArray.length; i++) {
            MailingList oMlist = new MailingList();
            oMlist.name ( vArray[i][0]);
            oMlist.fromEmail ( vArray[i][1]);
            oMlist.fromName ( vArray[i][2]);
            oMlist.description ( vArray[i][3]);
            oMlist.emailSub(true);
            oMlist.emailUnSubs(true);
            oMlists[i] =  oMlist;
        }
        return oMlists;

    }

    private static List<MailingList> LoadFromXLS() throws IOException {
        String vPpath = System.getProperty("user.dir") + "\\src\\Data\\MailChimp.xls";
        List<List<String>> list = ExcelReader.readExcelFile(vPpath, 0);
        String [][] vArray=ExcelReader.ListToTwoDimensionArray(list);
        List<MailingList> oMlists = null;
        for (int i = 0; i < vArray.length; i++) {
            MailingList oMlist = new MailingList();
            oMlist.name ( vArray[i][0]);
            oMlist.fromEmail ( vArray[i][1]);
            oMlist.fromName ( vArray[i][2]);
            oMlist.description ( vArray[i][3]);
            oMlist.emailSub(true);
            oMlist.emailUnSubs(true);
            oMlists.add(oMlist);
        }
        return oMlists;
    }

    private static List<MailingList> LoadFromMySql() throws IOException {
        List<MailingList> oMailingLists = new ArrayList<MailingList>();
        ResultSet rs = null;
        try {
            String sql = "select * from mailinglist";
            ConnectDB connectDB = new ConnectDB();
            rs = connectDB.Query(sql);
            MailingList oEmail;

            while (rs.next()) {
                MailingList oMailingList = new MailingList();
                oMailingList.name ( rs.getString("ListName"));
                oMailingList.fromEmail (rs.getString("FromEmail"));
                oMailingList.fromName ( rs.getString("FromName"));
                oMailingList.description ( rs.getString("Descption"));
                oMailingList.emailSub(true);
                oMailingList.emailUnSubs(true);
                oMailingLists.add(oMailingList);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs = null;
            }
        }

        return oMailingLists;
    }

    private static List<MailingList> LoadFromMsSql() throws IOException {
        List<MailingList> oMailingLists = new ArrayList<MailingList>();
        ResultSet rs = null;
        try {
            String sql = "select * from mailinglist";
            ConnectDB connectDB = new ConnectDB();
            rs = connectDB.QueryMsSql(sql);
            MailingList oEmail;

            while (rs.next()) {
                MailingList oMailingList = new MailingList();
                oMailingList.name ( rs.getString("ListName"));
                oMailingList.fromEmail (rs.getString("FromEmail"));
                oMailingList.fromName ( rs.getString("FromName"));
                oMailingList.description ( rs.getString("Descption"));
                oMailingList.emailSub(true);
                oMailingList.emailUnSubs(true);
                oMailingLists.add(oMailingList);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs = null;
            }
        }

        return oMailingLists;
    }

    private static List<MailingList> LoadFromOracleSql() throws IOException {
        List<MailingList> oMailingLists = new ArrayList<MailingList>();
        ResultSet rs = null;
        try {
            String sql = "select * from mailinglist";
            ConnectDB connectDB = new ConnectDB();
            rs = connectDB.QueryOracleSql(sql);
            MailingList oEmail;

            while (rs.next()) {
                MailingList oMailingList = new MailingList();
                oMailingList.name ( rs.getString("ListName"));
                oMailingList.fromEmail (rs.getString("FromEmail"));
                oMailingList.fromName ( rs.getString("FromName"));
                oMailingList.description ( rs.getString("Descption"));
                oMailingList.emailSub(true);
                oMailingList.emailUnSubs(true);
                oMailingLists.add(oMailingList);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs = null;
            }
        }

        return oMailingLists;
    }


    private static List<MailingList> LoadFromMongoDB() throws IOException {
        ConnectDB.connectMongoDB();
        List<MailingList> oMailingLists = new ArrayList<MailingList>();
        ResultSet rs = null;
        List<Document> documents = ConnectDB.getMongoDBDataDocument("emailstosend");
        for (Document document : documents) {
            MailingList oMailingList = new MailingList();
            oMailingList.name ( document.getString("ListName"));
            oMailingList.fromEmail (document.getString("FromEmail"));
            oMailingList.fromName ( document.getString("FromName"));
            oMailingList.description ( document.getString("Descption"));
            oMailingList.emailSub(true);
            oMailingList.emailUnSubs(true);
            oMailingLists.add(oMailingList);
        }

        return oMailingLists;
    }

    public static List<MailingList> Load(int pDBType) throws IOException {
        List<MailingList> oMailingList = null;
        switch (pDBType) {
            case 0://xls
                oMailingList = LoadFromXLS();
                break;
            case 1://mysql
                oMailingList = LoadFromMySql();
                break;
            case 2://mongodb
                oMailingList = LoadFromMongoDB();
                break;
            case 3://mssql
                oMailingList = LoadFromMsSql();
                break;
            case 4://oraclesql
                oMailingList = LoadFromOracleSql();
                break;
        }

        return oMailingList;
    }

    public static String[][] getData(int pDBType) throws IOException {
        List<MailingList> oMailingList = Load(pDBType);
        String[][] twoDimensionArray = new String[oMailingList.size()][];
        int i = 0;
        for (MailingList t : oMailingList) {
            twoDimensionArray[i++] = new String[]{t.name(), t.fromEmail(), t.fromName(), t.description()};
        }
        return twoDimensionArray;
    }
}
