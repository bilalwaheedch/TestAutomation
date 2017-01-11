package PageFactory;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 09-01-2017.
 */
public class AmazonSearchBar extends CommonAPI{
    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput() {
        searchInput.clear();
    }

    public List<String> getMenus(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#searchDropdownBox option");

        return items;
    }
    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        for(int i=0; i<data.size(); i++) {
            typeByCss("#twotabsearchtextbox", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }
    public void input() {
        keysInput("#twotabsearchtextbox");
    }
    public void clearBox() {
        clearInput("#twotabsearchtextbox");
    }

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div/div/div[2]/div[2]/div[1]/a/h2")
    public static WebElement searchResultsFirstElement;

    @FindBy(how = How.CSS , using = "#productTitle")
    public static WebElement productTitle;

}
