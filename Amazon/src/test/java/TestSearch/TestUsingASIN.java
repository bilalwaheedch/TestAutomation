package TestSearch;

import PageFactory.AmazonSearchBar;
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
        //initialize Search PF
        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        //Read from Excel file
        ItemsToBeSearchedUsingASIN itemsToBeSearchedUsingASIN = new ItemsToBeSearchedUsingASIN();
        //Get Data from Class
        String[] value = itemsToBeSearchedUsingASIN.getData();
        String[] department = itemsToBeSearchedUsingASIN.getDepartment();
        String[] assertValue = itemsToBeSearchedUsingASIN.getAssertData();
        //Loop through all items in arrays
        for (int i = 0; i < value.length; i++) {
            searchDropDownSelectOption(department[i]);
            searchUniqueItem(value[i]);
            sleepFor(2);
            Assert.assertTrue(searchBar.productTitle.getText().contains(assertValue[i]));
            goHome();
        }
    }
}
