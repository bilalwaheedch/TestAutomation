package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class ItemsToBeSearched {
    DataReader dataReader = new DataReader();
    public String [] getData() throws IOException{
        String path = System.getProperty("user.dir")+"/data/Amazon/AmazonTestSearchItems.xls";
        String [] output = dataReader.fileReader(path);

        return output;
    }

}
