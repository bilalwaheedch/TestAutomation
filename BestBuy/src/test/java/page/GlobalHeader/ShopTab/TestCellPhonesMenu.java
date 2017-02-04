package page.GlobalHeader.ShopTab;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.GlobalHeader.GlobalHeaderTabs;
import ui.GlobalHeader.ShopMenuTab;
import utility.DriverFactory;

/**
 * Created by Bilal on 17-01-2017.
 */
public class TestCellPhonesMenu extends CommonMethods{
    public ShopMenuTab globalHeaderTabs(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        getLogger(TestCellPhonesMenu.class).info("Creating new WebDriver Object");
        GlobalHeaderTabs globalHeaderTabs = PageFactory.initElements(driver, GlobalHeaderTabs.class);
        globalHeaderTabs.getShopNav();
        getLogger(TestCellPhonesMenu.class).info("Open Shop Menu");
        return PageFactory.initElements(driver,ShopMenuTab.class);
    }
    @Test
    public void testIPhoneMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getiPhonePage().assertPage();
    }
    @Test
    public void testAndroidMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getAndroidPage().assertPage();
    }
    @Test
    public void testBlackBerryMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getBlackBerryPage().assertPage();
    }
    @Test
    public void testPrepaidPhonesMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getPrepaidPhonesPage().assertPage();
    }
    @Test
    public void testUnlockedCellPhonesMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getUnlockedCellPhonesPage().assertPage();
    }
    @Test
    public void testTabletsMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab().getTabletsPage().assertPage();
    }

}
