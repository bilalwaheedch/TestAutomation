package TestHomePage;

import Ui.CignaMedicarePage.UiCignaMedicarePage;
import Ui.HomePage.UiTopNav;
import Ui.IndividualFamilyPlansPage.UiIndividualFamilyPlansPage;
import Ui.InternationalIndividualPlansPage.UiInternationalIndividualPlansPage;
import Ui.OfferedCignaThroughWorkPage.UiOfferedCignaThroughWorkPage;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DriverFactory;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by izran on 2/12/2017.
 */
public class TestNavigationBar  extends CommonMethods {

    public UiTopNav getLeftMenu(WebDriver driver) throws InterruptedException, IOException {
        return PageFactory.initElements(driver,UiTopNav.class);
    }

    @Test
    public void testIndividualFamilyPlansPage() throws InterruptedException, IOException{
        WebDriver driver = DriverFactory.getInstance().getDriver();
        UiIndividualFamilyPlansPage uiIndividualFamilyPlansPage = getLeftMenu(driver).getIndividualFamilyPlansPage(driver);
        uiIndividualFamilyPlansPage.assertPage();
    }

    @Test
    public void testCignaMedicarePage() throws InterruptedException, IOException{
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiCignaMedicarePage uiCignaMedicarePage = getLeftMenu(driver).getCignaMedicarePage(driver);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        uiCignaMedicarePage.assertPage();
    }

    @Test
    public void UiInternationalIndividualPlansPage() throws InterruptedException, IOException{
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiInternationalIndividualPlansPage uiInternationalIndividualPlansPage = getLeftMenu(driver).getInternationalIndividualPlansPage(driver);

        uiInternationalIndividualPlansPage.assertPage();
    }

    @Test
    public void UiOfferedCignaThroughWorkPage() throws InterruptedException, IOException{
        WebDriver driver = DriverFactory.getInstance().getDriver();

        UiOfferedCignaThroughWorkPage uiOfferedCignaThroughWorkPage = getLeftMenu(driver).getOfferedCignaThroughWorkPage(driver);

        uiOfferedCignaThroughWorkPage.assertPage();
    }
}
