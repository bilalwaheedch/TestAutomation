package page;

/**
 * Created by izran on 1/2/2017.
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class TestHomePage extends CommonAPI {
    @Test
    public void testAmazonLogoLink() {
        clickByCss(".nav-logo-base.nav-sprite");
        Assert.assertTrue(driver.getTitle().contains("Online shopping"));

    }


}
