package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by izran on 1/2/2017.
 */
public class TestHomePage extends CommonAPI {

    @Test
    public void testHome() throws IOException {

        //Products & Services
        clickByXpath("//*[@id='menuTab3']/span");
        takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");

    }

}
