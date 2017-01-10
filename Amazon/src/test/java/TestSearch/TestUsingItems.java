package TestSearch;

import PageFactory.AmazonSearchBar;
import base.CommonAPI;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class TestUsingItems extends CommonAPI{
    public void searchUsingExcelFile()throws IOException,InterruptedException {
        //initialize Search PF
        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        //Read from Excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] value = itemsToBeSearched.getData();
        for (String read : value) {
            searchBar.searchFor(read);
            sleepFor(1);
            searchBar.clearSearchInput();
        }
    }

}
