package page;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by izran on 1/2/2017.
 */
public class TestHomePage   extends CommonAPI {

    /*
    public void testHome() {

        //main menu US click
        clickByXpath("//*[@id='nav']/div[2]/div[2]/a[1]");

    }
*/
    @Test
    public void testLeftMenu() {


        //main menu US click
        clickByXpath("//*[@id='nav']/div[2]/div[2]/a[1]");

        //link Space + Science
        clickByXpath("//*[@id='nav-section-submenu']/a[4]");

    }
}
