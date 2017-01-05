package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by izran on 1/4/2017.
 */
public class TestLeftMenuPage  extends CommonAPI {

    @Test
    public void testLeftMenu() {


        //main menu US click
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[1]");
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("../CNN/ScreenShots/TestLeftMenuPage/screenshot.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //link Space + Science

        clickByXpath(".//*[@id='nav-section-submenu']/a[4]");
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("../CNN/ScreenShots/TestLeftMenuPage/screenshot1.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
