package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class ItemsToAssertUsingASIN {
    DataReader dataReader = new DataReader();
    public String [] getData() throws IOException {
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchUsingASIN.xls";
        String [] output = dataReader.colReader(path,2);

        return output;
    }
}
