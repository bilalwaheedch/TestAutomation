package TestSignIn;

import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 11-01-2017.
 */
public class TestAmazonSignIn extends CommonMethods{
    @Test(priority = 1)
    public void signInUsingBlankCredentials() throws InterruptedException {
        UserLogIn("","");
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH(".//*[@id='auth-email-missing-alert']/div/div"));
        Assert.assertTrue(isElementPresentByXPATH(".//*[@id='auth-password-missing-alert']/div/div"));

    }
    @Test(priority = 2)
    public void signInUsingBlankPassword() throws InterruptedException{
        UserLogIn(AmazonUserName,"");
        sleepFor(2);
        Assert.assertTrue(isElementPresentByXPATH(".//*[@id='auth-password-missing-alert']/div/div"));
    }
    @Test(priority = 3)
    public void signInUsingIncorrectEmail() throws InterruptedException {
        UserLogIn("incorrectAmazonUser@unknown.com","incorrectPassword");
        sleepFor(2);
        Assert.assertTrue(getTextByXpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span").equals("We cannot find an account with that e-mail address"));
    }
    @Test(priority = 4)
    public void signInUsingIncorrectPassword() throws InterruptedException{
        UserLogIn(AmazonUserName,"incorrectPassword");
        sleepFor(2);
        Assert.assertTrue(getTextByXpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span").equals("Your password is incorrect"));
    }
    @Test(priority = 5)
    public void signInUsingCorrectPassword() throws InterruptedException{
        UserLogIn(AmazonUserName,AmazonPassword);
        sleepFor(2);
        Assert.assertTrue(getTextByXpath(".//*[@id='nav-link-yourAccount']/span[1]").contains(AmazonFName));
    }

}
