package page;

import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.Homepage.UiHomepage;
import ui.US.USPage;


/**
 * Created by Bilal on 18-01-2017.
 */
public class TestHomePage extends CommonMethods{
    @Test
    public void testUSPageTopNav() throws InterruptedException {
        UiHomepage ui = PageFactory.initElements(driver,UiHomepage.class);
        ui.usPage();
        sleepFor(3);
    }

    @Test
    public void testHeaderBarCrimeJustice() throws InterruptedException {
        UiHomepage ui = PageFactory.initElements(driver, UiHomepage.class);
        USPage usPage = PageFactory.initElements(driver, USPage.class);
        ui.usPage();
        sleepFor(3);
        usPage.crimeJusticePage();
    }
}
