package methods;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.GlobalHeader.GlobalHeaderTabs;
import utility.DriverFactory;

/**
 * Created by Bilal on 17-01-2017.
 */
public class CommonMethods extends CommonAPI{
    public static final String BestBuyUserName = System.getenv("BestBuyUserName");
    public static final String BestBuyPassword = System.getenv("BestBuyPassword");

    public void searchForItem(String text){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        GlobalHeaderTabs globalHeaderTabs = PageFactory.initElements(driver, GlobalHeaderTabs.class);
        globalHeaderTabs.navigationSearchBox.sendKeys(text, Keys.ENTER);
    }
}
