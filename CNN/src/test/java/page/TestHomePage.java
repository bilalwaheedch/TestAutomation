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
public class TestHomePage   extends CommonAPI {


    public void testHome() throws IOException {

        //main menu US click
        clickByXpath("//*[@id='nav']/div[2]/div[2]/a[1]");
        takeScreenShot("../CNN/ScreenShots/TestHomePage/screenshot.jpg");

    }

}
