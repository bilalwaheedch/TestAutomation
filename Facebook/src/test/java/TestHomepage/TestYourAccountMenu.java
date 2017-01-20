package TestHomepage;

import CreatePage.UiCreatePage;
import Homepage.UiMenuBar;
import Homepage.UiYourAccountMenuTab;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 19-01-2017.
 */
public class TestYourAccountMenu extends CommonMethods{
    @Test(priority = 1)
    public void testCreatePage() throws InterruptedException {
        signIn();
        UiMenuBar uiMenuBar = PageFactory.initElements(driver, UiMenuBar.class);
        uiMenuBar.getYourAccountMenuTab();
        UiYourAccountMenuTab uiYourAccountMenuTab = PageFactory.initElements(driver,UiYourAccountMenuTab.class);
        uiYourAccountMenuTab.getCreatePage();
        UiCreatePage uiCreatePage = PageFactory.initElements(driver,UiCreatePage.class);
        uiCreatePage.assertGetCreatePage();

    }
}
