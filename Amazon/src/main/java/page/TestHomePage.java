package page;

/**
 * Created by izran on 1/2/2017.
 */

import org.testng.annotations.Test;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    @Test
    public void testHome() {
        System.out.println(driver.getCurrentUrl());

        clickByXpath("//*[@id='redir-go-to-site']/span[2]");

    }

    @Test
    public void testLeftMenu() {
        System.out.println(driver.getCurrentUrl());

        clickByXpath("//*[@id='redir-go-to-site']/span[2]");

        clickByXpath("//*[@id='nav-link-shopall']/span[1]");

        clickByXpath("//*[@id='shopAllLinks']/tbody/tr/td[1]/div[2]/ul/li[3]/a");

        clickByXpath("//*[@id='merchandised-content']/div[1]/p/a[3]");
    }
}
