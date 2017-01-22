package page.ShopTab;

import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.GlobalHeader.GlobalHeaderTabs;
import ui.GlobalHeader.ShopMenuTab;

/**
 * Created by Bilal on 17-01-2017.
 */
public class TestCellPhonesMenu extends CommonMethods{
    public ShopMenuTab globalHeaderTabs(){
        GlobalHeaderTabs globalHeaderTabs = PageFactory.initElements(driver, GlobalHeaderTabs.class);
        globalHeaderTabs.getShopNav();
        return PageFactory.initElements(driver,ShopMenuTab.class);
    }
    @Test(priority = 1)
    public void testIPhoneMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getiPhonePage(driver).assertPage();
    }
    @Test(priority = 2)
    public void testAndroidMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getAndroidPage(driver).assertPage();
    }
    @Test(priority = 3)
    public void testBlackBerryMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getBlackBerryPage(driver).assertPage();
    }
    @Test(priority = 4)
    public void testPrepaidPhonesMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getPrepaidPhonesPage(driver).assertPage();
    }
    @Test(priority = 5)
    public void testUnlockedCellPhonesMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getUnlockedCellPhonesPage(driver).assertPage();
    }
    @Test(priority = 6)
    public void testTabletsMenuItem() throws InterruptedException {
        globalHeaderTabs().getCellPhonesTab(driver).getTabletsPage(driver).assertPage();
    }

}
