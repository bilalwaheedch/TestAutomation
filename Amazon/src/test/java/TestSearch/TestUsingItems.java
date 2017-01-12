package TestSearch;


import methods.CommonMethods;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class TestUsingItems extends CommonMethods{
    @Test
    public void searchUsingExcelFile()throws IOException,InterruptedException {

        searchAndAssertUsingExcelFile("/data/AmazonTestSearchItems.xls",2,3);
    }

}
