package page;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by izran on 1/2/2017.
 */
public class TestHomePage extends CommonAPI {

    @Test
    public void testHome() {

        //Products & Services
        clickByXpath("//*[@id='menuTab3']/span");

        //Mortgages
        clickByXpath("//*[@id='menuTab3']/ul/li/div/div/div/div[1]/div[2]/div/ul/li[1]/div/a");

        //Let's go step by step
        clickByXpath("//*[@id='td-layout-contentarea']/div/div[6]/div/div/div/div[1]/div/div[2]/p/a/span");

    }

}
