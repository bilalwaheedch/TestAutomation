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
public class TestMortgagesCategoryPage extends CommonAPI {
    @Test
    public void testHome() throws IOException {
        //Products & Services
        clickByXpath("//*[@id='menuTab3']/span");
        takeScreenShot("ScreenShots/TestMortgagesCategoryPage/screenshot.jpg");

        //Mortgages
        clickByXpath("//*[@id='menuTab3']/ul/li/div/div/div/div[1]/div[2]/div/ul/li[1]/div/a");
        takeScreenShot("ScreenShots/TestMortgagesCategoryPage/screenshot1.jpg");

        //Let's go step by step
        clickByXpath("//*[contains(text(),'go step by step')]");
        takeScreenShot("ScreenShots/TestMortgagesCategoryPage/screenshot2.jpg");
    }
}
