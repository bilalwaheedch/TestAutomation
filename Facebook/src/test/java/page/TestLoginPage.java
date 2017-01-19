package page;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by izran on 1/4/2017.
 */
public class TestLoginPage  extends CommonAPI {
    @Test
    public void LoginTest() throws IOException {
        typeByXpath("//*[@id='email']", "test@yahoo.com");
        takeScreenShot("../Facebook/ScreenShots/TestLoginPage/screenshot.jpg");

        typeByXpath("//*[@id='pass']", "test");
        takeScreenShot("../Facebook/ScreenShots/TestLoginPage/screenshot1.jpg");

        clickByXpath("//*[@id='u_0_n']");
        takeScreenShot("../Facebook/ScreenShots/TestLoginPage/screenshot2.jpg");
    }
}
