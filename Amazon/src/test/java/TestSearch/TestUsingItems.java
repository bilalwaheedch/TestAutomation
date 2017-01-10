package TestSearch;

import PageFactory.AmazonSearchBar;
import base.CommonAPI;
import dataToSearch.ItemsToAssert;
import dataToSearch.ItemsToBeSearched;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Bilal on 09-01-2017.
 */
public class TestUsingItems extends CommonAPI{
    @Test
    public void searchUsingExcelFile()throws IOException,InterruptedException {
        //initialize Search PF
        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        //Read from Excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        ItemsToAssert itemsToAssert = new ItemsToAssert();
        String[] value = itemsToBeSearched.getData();
        String[] assertValue = itemsToAssert.getData();
        for(int i=0; i<value.length; i++){
            searchBar.searchFor(value[i]);
            sleepFor(2);
            Assert.assertTrue(getTitle().contains(assertValue[i]));
            searchBar.clearSearchInput();
        }
    }

}
