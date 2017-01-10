package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class ItemsToAssert {
    DataReader dataReader = new DataReader();
    public String [] getData() throws IOException {
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchItems.xls";
        String [] output = dataReader.colReader(path,3);

        return output;
    }
}
