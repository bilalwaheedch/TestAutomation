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
public class TestShopByDepartmentPage  extends CommonAPI {

    @Test
    public void testLeftMenu() {
        System.out.println(driver.getCurrentUrl());

        clickByXpath("//*[@id='redir-go-to-site']/span[2]");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Amazon/ScreenShots/TestShopByDepartmentPage/screenshot.jpg"));
        }catch (Exception ex){

        }
        clickByXpath("//*[@id='nav-link-shopall']/span[1]");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Amazon/ScreenShots/TestShopByDepartmentPage/screenshot1.jpg"));
        }catch (Exception ex){

        }
        clickByXpath("//*[@id='shopAllLinks']/tbody/tr/td[1]/div[2]/ul/li[3]/a");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Amazon/ScreenShots/TestShopByDepartmentPage/screenshot2.jpg"));
        }catch (Exception ex){

        }
        clickByXpath("//*[@id='merchandised-content']/div[1]/p/a[3]");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestHomePage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("../Amazon/ScreenShots/TestShopByDepartmentPage/screenshot3.jpg"));
        }catch (Exception ex){

        }
    }
}
