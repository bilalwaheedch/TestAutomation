package page;

/**
 * Created by izran on 1/2/2017.
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;


public class TestHomePage  extends CommonAPI {
    @Test
    public void testHome() {

        clickByXpath("//*[@id='shop-menu-link']");
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Bestbuy/ScreenShots/TestHomePage/screenshot.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
