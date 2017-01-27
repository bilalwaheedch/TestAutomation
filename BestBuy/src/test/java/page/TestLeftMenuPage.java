package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by izran on 1/4/2017.
 */
public class TestLeftMenuPage  extends CommonAPI {
    @Test
    public void testLeftMenu() throws IOException {
        clickByXpath("//*[@id='shop-menu-link']");
        takeScreenShot("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot.jpg");

        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/a");
        takeScreenShot("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot1.jpg");

        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/div/div[1]/div/div/div[2]/ul[1]/li[1]/a");
        takeScreenShot("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot2.jpg");

    }
}
