package page;

/**
 * Created by izran on 1/2/2017.
 */

import org.testng.annotations.Test;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage  extends CommonAPI {

    public void testHome() {

        clickByXpath("//*[@id='shop-menu-link']");

    }

    @Test
    public void testLeftMenu() {
        //System.out.println(driver.getCurrentUrl());

        clickByXpath("//*[@id='shop-menu-link']");

        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/a");

        clickByXpath("//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[3]/div/div[1]/div/div/div[2]/ul[1]/li[1]/a");

       // clickByXpath("//*[@id='ctl00_CP_ctl00_C1_ctl00_LT_SL_ctl01_ctl00_HyperLinkA1ThemeB']");
    }
}
