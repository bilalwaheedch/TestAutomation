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
public class TestHomePage   extends CommonAPI {


    public void testHome() {

        //main menu US click
        clickByXpath("//*[@id='nav']/div[2]/div[2]/a[1]");
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../CNN/ScreenShots/TestHomePage/screenshot.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
