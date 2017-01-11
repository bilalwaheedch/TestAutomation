package methods;

import PageFactory.AmazonSearchBar;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 08-01-2017.
 */
public class CommonMethods extends CommonAPI{
    DataReader dataReader = new DataReader();

    boolean isAlreadyLoggedIn = false;

    public void UserLogIn() throws InterruptedException {
        if(!isAlreadyLoggedIn){
            clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
            sleepFor(2);
            typeByXpath(".//*[@id='ap_email']", AmazonUserName);
            typeByXpath(".//*[@id='ap_password']", AmazonPassword);
            clickByXpath(".//*[@id='signInSubmit']");
            isAlreadyLoggedIn = true;
        }
    }

    public void searchAndAssertUsingExcelFile(String path, int searchCol, int assertCol) throws IOException, InterruptedException {
        String absPath = System.getProperty("user.dir")+path;
        String [] searchItems = dataReader.colReader(absPath,searchCol);
        String [] assertItems = dataReader.colReader(absPath,assertCol);
        //initialize Search PF
        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        for(int i=0; i<searchItems.length; i++){
            searchBar.searchFor(searchItems[i]);
            sleepFor(2);
            Assert.assertTrue(getTitle().contains(assertItems[i]));
            searchBar.clearSearchInput();
        }

    }
    public void searchUniqueItem(String path, int searchCol, int assertCol) throws IOException, InterruptedException {
        String absPath = System.getProperty("user.dir")+path;
        String [] searchItems = dataReader.colReader(absPath,searchCol);
        String [] assertItems = dataReader.colReader(absPath,assertCol);
        //initialize Search PF
        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        for(int i=0; i<searchItems.length; i++){
            searchBar.searchFor(searchItems[i]);
            searchBar.searchResultsFirstElement.click();
            sleepFor(2);
            Assert.assertTrue(searchBar.productTitle.getText().equals(assertItems[i]));
            searchBar.clearSearchInput();
        }

    }
}
