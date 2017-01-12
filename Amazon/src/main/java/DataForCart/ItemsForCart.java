package DataForCart;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class ItemsForCart {
    DataReader dataReader = new DataReader();
    public String[] getItemASIN() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestCart.xls";
        String [] output = dataReader.colReader(path,1);

        return output;
    }
    public String[] getItemDept() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestCart.xls";
        String [] output = dataReader.colReader(path,3);

        return output;
    }

}
