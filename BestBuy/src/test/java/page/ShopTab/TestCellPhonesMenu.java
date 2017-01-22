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
    public void testIPhoneMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getiPhonePage().assertPage();
    }
    @Test(priority = 2)
    public void testAndroidMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getAndroidPage().assertPage();
    }
    @Test(priority = 3)
    public void testBlackBerryMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getBlackBerryPage().assertPage();
    }
    @Test(priority = 4)
    public void testPrepaidPhonesMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getPrepaidPhonesPage().assertPage();
    }
    @Test(priority = 5)
    public void testUnlockedCellPhonesMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getUnlockedCellPhonesPage().assertPage();
    }
    @Test(priority = 6)
    public void testTabletsMenuItem(){
        globalHeaderTabs().getCellPhonesTab().getTabletsPage().assertPage();
    }

}
