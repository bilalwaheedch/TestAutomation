package utility;

/**
 * Created by izran on 1/2/2017.
 */
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
public class ConnectDB {

    public static MongoDatabase mongoDatabase = null;
    public static MongoDatabase mongodb = null;


    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;



    public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/MySql.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Properties loadProperties(String name) throws IOException{
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/config/"+name);
        prop.load(ism);
        ism.close();
        return prop;
    }

    public void connectToDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties("MySql.properties");
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        //  System.out.println("Database is connected");

    }

    public void connectToDatabaseMsSql() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties("MsSql.properties");
        String driverClass = prop.getProperty("MSSQLJDBC.driver");
        String url = prop.getProperty("MSSQLJDBC.url");
        String userName = prop.getProperty("MSSQLJDBC.userName");
        String password = prop.getProperty("MSSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        //  System.out.println("Database is connected");

    }

    public void connectToDatabaseOracleSql() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties("OracleSql.properties");
        String driverClass = prop.getProperty("ORACLESQLJDBC.driver");
        String url = prop.getProperty("ORACLESQLJDBC.url");
        String userName = prop.getProperty("ORACLESQLJDBC.userName");
        String password = prop.getProperty("ORACLESQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        //  System.out.println("Database is connected");

    }

    public static MongoDatabase connectMongoDB() throws IOException {
        try {
            Properties prop = loadProperties("mongodb.properties");
            String host = prop.getProperty("mongodn.url");
            MongoClientURI mongoClientURI = new MongoClientURI(host);
            MongoClient mongoClient = new MongoClient(mongoClientURI);
            System.out.println("MongoDB Connection Eastablished");
            mongoDatabase = mongoClient.getDatabase(prop.getProperty("mongodb.dbname"));
            System.out.println("Database Connected");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return mongoDatabase;
    }


    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }


    private void close() {
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }


    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    // function  for Data insert into MySQL Database
    public void InsertDataFromArryToMySql(int [] ArrayData,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for(int n=0; n<ArrayData.length; n++){

                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setInt(1,ArrayData[n]);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }


    // Function for Insert Single value in a table

    public void InsertDataFromStringToMySql(String ArrayData,String tableName, String columnName)


    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");


            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
            ps.setString(1,ArrayData);
            ps.executeUpdate();
            //System.out.println(list[n]);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }




    public List<String> directDatabaseQueryExecute(String passQuery,String dataColumn)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }

//

    public void InsertDataFromArryListToMySql(List<Object> list,String tableName, String columnName)
    //InsertDataFromArryListToMySql

    //  public void InsertDataFromArryToMySql()
    {

        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for(Object st:list){
                // System.out.println(st);

                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }


    public ResultSet Query(String sql)  throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet QueryMsSql(String sql)  throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            connectToDatabaseMsSql();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return resultSet;
    }

    public ResultSet QueryOracleSql(String sql)  throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            connectToDatabaseOracleSql();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return resultSet;
    }

    public static List<Document> getMongoDBDataDocument(String collectionName ) {
        List<Document> documents = null;
        MongoCollection<Document> collection = null;
        try {
            collection = mongoDatabase.getCollection(collectionName);
            documents = (List<Document>) collection.find().into(
                    new ArrayList<Document>());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return documents;
    }

};