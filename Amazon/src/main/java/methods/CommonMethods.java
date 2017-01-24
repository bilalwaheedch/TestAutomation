package methods;

import PageFactory.AmazonSearchBar;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.DataReader;
import utility.DriverFactory;

import java.io.IOException;


/**
 * Created by Bilal on 08-01-2017.
 */
public class CommonMethods extends CommonAPI{
    public static final String AmazonUserName = System.getenv("AmazonUserName");
    public static final String AmazonPassword = System.getenv("AmazonPassword");
    public static final String AmazonFName = System.getenv("AmazonFName");
    public AmazonSearchBar amazonSearchBar(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver,AmazonSearchBar.class);
    }
    DataReader dataReader = new DataReader();

    boolean isAlreadyLoggedIn = false;

    public void UserLogIn(String user, String pass) throws InterruptedException {
        if(!isAlreadyLoggedIn){
            clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
            sleepFor(2);
            typeByXpath(".//*[@id='ap_email']", user);
            typeByXpath(".//*[@id='ap_password']", pass);
            clickByXpath(".//*[@id='signInSubmit']");

            //isAlreadyLoggedIn = true;
        }
    }

    public void searchAndAssertUsingExcelFile(String path, int searchCol, int assertCol) throws IOException, InterruptedException {
        String absPath = System.getProperty("user.dir")+path;
        String [] searchItems = dataReader.colReader(absPath,searchCol);
        String [] assertItems = dataReader.colReader(absPath,assertCol);
        //initialize Search PF
//        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
        for(int i=0; i<searchItems.length; i++){
            amazonSearchBar().searchFor(searchItems[i]);
            sleepFor(4);
            Assert.assertTrue(getTitle().contains(assertItems[i]));
            amazonSearchBar().clearSearchInput();
        }

    }
    public void searchUniqueItem(String itemASIN) throws IOException, InterruptedException {
//        AmazonSearchBar searchBar = PageFactory.initElements(driver, AmazonSearchBar.class);
            amazonSearchBar().searchFor(itemASIN);
            amazonSearchBar().searchResultsFirstElement.click();
            sleepFor(2);

    }
    public void goHome(){
        clickByCss(".nav-logo-base.nav-sprite");
    }
    public void searchDropDownSelectOption(String value){
        selectDropDownValueByXPATH(value, ".//*[@id='searchDropdownBox']");
    }

}
