package page;

import javafx.scene.control.Cell;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.GlobalHeader.GlobalHeaderTabs;
import ui.GlobalHeader.ShopMenu;
import ui.ShopTab.CellPhones;

/**
 * Created by Bilal on 17-01-2017.
 */
public class TestGlobalHeader extends CommonMethods{
    @Test
    public void testGlobalHeaderShopNav() throws InterruptedException {
        GlobalHeaderTabs globalHeaderTabs = PageFactory.initElements(driver, GlobalHeaderTabs.class);
        globalHeaderTabs.getShopNav().getCellPhonesTab().getiPhonePage();
        sleepFor(2);
    }
}
