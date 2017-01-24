package TestSignIn;

import PageFactory.AmazonSignIn;
import PageFactory.AmazonTopNav;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.DriverFactory;

/**
 * Created by Bilal on 11-01-2017.
 */
public class TestAmazonSignIn extends CommonMethods{
    public AmazonSignIn amazonSignIn(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver, AmazonSignIn.class);
    }
    public AmazonTopNav amazonTopNav(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver, AmazonTopNav.class);
    }
    @Test(priority = 1)
    public void signInUsingBlankCredentials() throws InterruptedException {
//        AmazonSignIn amazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);
        UserLogIn("","");
        sleepFor(2);
        Assert.assertTrue(amazonSignIn().alertMissingEmail.isDisplayed());
        Assert.assertTrue(amazonSignIn().alertMissingPassword.isDisplayed());

    }
    @Test(priority = 2)
    public void signInUsingBlankPassword() throws InterruptedException{
//        AmazonSignIn amazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);
        UserLogIn(AmazonUserName,"");
        sleepFor(2);
        Assert.assertTrue(amazonSignIn().alertMissingPassword.isDisplayed());
    }
    @Test(priority = 3)
    public void signInUsingIncorrectEmail() throws InterruptedException {
//        AmazonSignIn amazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);
        UserLogIn("incorrectAmazonUser@unknown.com","incorrectPassword");
        sleepFor(2);
        Assert.assertTrue(amazonSignIn().errorMessageBox.getText().equals(amazonSignIn().incorrectEmailMessage));
    }
    @Test(priority = 4)
    public void signInUsingIncorrectPassword() throws InterruptedException{
//        AmazonSignIn amazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);
        UserLogIn(AmazonUserName,"incorrectPassword");
        sleepFor(2);
        Assert.assertTrue(amazonSignIn().errorMessageBox.getText().equals(amazonSignIn().incorrectPasswordMessage));
    }
    @Test(priority = 5)
    public void signInUsingCorrectPassword() throws InterruptedException{
//        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
        UserLogIn(AmazonUserName,AmazonPassword);
        sleepFor(2);
        Assert.assertTrue(amazonTopNav().linkYourAccount.getText().contains(AmazonFName));
    }

}
