package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by izran on 1/2/2017.
 */
public class TestHomePage extends CommonAPI {

    @Test
    public void testHome() {

        //Products & Services
        clickByXpath("//*[@id='menuTab3']/span");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg"));
        }catch (Exception ex){

        }
    }

}
