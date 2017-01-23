package login;


import base.CommonAPI;
import methods.CommonMethods;
import org.testng.annotations.Test;

/**
 * Created by izran on 1/9/2017.
 */
public class TestLogin extends CommonMethods {


    @Test(priority = 1)
    public void testLoginIncorrectCredentials() throws InterruptedException{
        LogIn("incorrectUserName@yahoo.com","incorrectPassword");
    }
    @Test(priority = 2)
    public void testLoginBlankPassword() throws InterruptedException{
        LogIn(CommonAPI.YahooUserName,"");

    }

    @Test(priority = 3)
     public void loginTest() throws InterruptedException {
        LogIn(CommonAPI.YahooUserName,CommonAPI.YahooPassword);
    }

}
