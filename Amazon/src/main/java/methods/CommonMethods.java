package methods;

import base.CommonAPI;

/**
 * Created by Bilal on 08-01-2017.
 */
public class CommonMethods extends CommonAPI{

    boolean isAlreadyLoggedIn = false;

    public void UserLogIn() throws InterruptedException {
        if(!isAlreadyLoggedIn){
            clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
            sleepFor(2);
            typeByXpath(".//*[@id='ap_email']", AmazonUserName);
            typeByXpath(".//*[@id='ap_password']", AmazonPassword);
            clickByXpath(".//*[@id='signInSubmit']");
            isAlreadyLoggedIn = true;
        }
    }
}
