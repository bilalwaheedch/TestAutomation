package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class ItemsToBeSearchedUsingASIN {
    DataReader dataReader = new DataReader();
    public String [] getData() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchUsingASIN.xls";
        String [] output = dataReader.colReader(path,1);

        return output;
    }

}
