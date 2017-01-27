package page.GlobalHeader;

import DataSearch.ItemsForSearch;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.ProductPage.UiProductPage;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 27-01-2017.
 */
public class SearchBarTest extends CommonMethods {
    public UiProductPage getPage(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver,UiProductPage.class);
    }
    @Test
    public void testSearchBar() throws IOException {
        ItemsForSearch itemsForSearch = new ItemsForSearch();
        String[] items = itemsForSearch.getItems();
        String[] title = itemsForSearch.getItemsTitle();
        for (int i = 0; i < items.length; i++) {
            searchForItem(items[i]);
            Assert.assertTrue(getPage().titleProduct.getText().equals(title[i]));
        }
    }
}
