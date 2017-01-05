package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Scanner;

/**
 * Created by izran on 1/4/2017.
 */
public class TestLoginPage  extends CommonAPI {
    @Test
    public void LoginTest() {

        //Scanner std = new Scanner(System.in);
        //System.out.println("Please enter user name(facebook)");
        //String username = std.nextLine();
        //System.out.println("Please enter user password(facebook)");
        //String userpwd = std.nextLine();
        typeByXpath("//*[@id='email']", "izrankhattak@yahoo.com");
        typeByXpath("//*[@id='pass']", "canada19");
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("../Facebook/ScreenShots/TestLoginPage/screenshot.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        clickByXpath("//*[@id='u_0_n']");

        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("../Facebook/ScreenShots/TestLoginPage/screenshot1.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
