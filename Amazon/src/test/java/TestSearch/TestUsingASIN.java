package TestSearch;

import PageFactory.AmazonSearchBar;
import base.CommonAPI;
import dataToSearch.ItemsToAssert;
import dataToSearch.ItemsToAssertUsingASIN;
import dataToSearch.ItemsToBeSearched;
import dataToSearch.ItemsToBeSearchedUsingASIN;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class TestUsingASIN extends CommonMethods {
    @Test
    public void searchUsingASIN() throws IOException, InterruptedException {
//        //initialize Search PF
//        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
//        //Read from Excel file
//        ItemsToBeSearchedUsingASIN itemsToBeSearchedUsingASIN = new ItemsToBeSearchedUsingASIN();
//        ItemsToAssertUsingASIN itemsToAssertUsingASIN = new ItemsToAssertUsingASIN();
//        String[] value = itemsToBeSearchedUsingASIN.getData();
//        String[] assertValue = itemsToAssertUsingASIN.getData();
//        for (int i = 0; i < value.length; i++) {
//            searchBar.searchFor(value[i]);
//            searchBar.searchResultsFirstElement.click();
//            sleepFor(2);
//            Assert.assertTrue(searchBar.productTitle.getText().contains(assertValue[i]));
//            searchBar.clearSearchInput();
//        }
        searchUniqueItem("/data/AmazonTestSearchUsingASIN.xls",1,2);
    }
}
