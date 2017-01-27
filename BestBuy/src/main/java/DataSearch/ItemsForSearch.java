package DataSearch;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.ProductPage.UiProductPage;
import utility.DataReader;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 27-01-2017.
 */
public class ItemsForSearch extends CommonMethods{
    DataReader dataReader = new DataReader();
    public String[] getItems() throws IOException {
        String path = System.getProperty("user.dir")+"/data/BestBuyItemData.xls";
        return dataReader.colReader(path,1);
    }
    public String[] getItemsTitle() throws IOException {
        String path = System.getProperty("user.dir")+"/data/BestBuyItemData.xls";
        return dataReader.colReader(path,2);
    }

}
