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
public class TestMortgagesCategoryPage extends CommonAPI {
    @Test
    public void testHome() {

        //Products & Services
        clickByXpath("//*[@id='menuTab3']/span");
        try {
           // takeScreenShot("../TDCanadaTrust/ScreenShots/TestMortgagesCategoryPage/screenshot.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("ScreenShots/TestMortgagesCategoryPage/screenshot.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //Mortgages
        clickByXpath("//*[@id='menuTab3']/ul/li/div/div/div/div[1]/div[2]/div/ul/li[1]/div/a");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestMortgagesCategoryPage/screenshot1.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("ScreenShots/TestMortgagesCategoryPage/screenshot1.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //Let's go step by step
        clickByXpath("//*[contains(text(),'go step by step')]");
        try {
            //takeScreenShot("../TDCanadaTrust/ScreenShots/TestMortgagesCategoryPage/screenshot2.jpg");
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("ScreenShots/TestMortgagesCategoryPage/screenshot2.jpg"));
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
