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
        //System.out.println(driver.getCurrentUrl());

        clickByXpath("//*[@id='shop-menu-link']");
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/a");
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot1.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/div/div[1]/div/div/div[2]/ul[1]/li[1]/a");
        try {
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Bestbuy/ScreenShots/TestLeftMenuPage/screenshot2.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        // clickByXpath("//*[@id='ctl00_CP_ctl00_C1_ctl00_LT_SL_ctl01_ctl00_HyperLinkA1ThemeB']");
    }
}
