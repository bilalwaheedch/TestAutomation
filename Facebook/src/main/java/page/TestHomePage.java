package page;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by izran on 1/2/2017.
 */
public class TestHomePage extends CommonAPI {

    @Test
    public void testHome() {

        //main menu US click
        typeByXpath("//*[@id='email']", "");
        typeByXpath("//*[@id='pass']", "");
        clickByXpath("//*[@id='u_0_n']");
    }


}
