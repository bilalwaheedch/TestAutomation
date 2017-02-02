package Ui.LoginPage;


import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/23/2017.
 */
public class UiLogin extends CommonMethods {
    @FindBy(how = How.ID, using = "uh-mail")
    public static WebElement linkMail;

    @FindBy(how = How.XPATH, using = ".//*[@id='uh-signedin']")
    public static WebElement btnSignbtn;

    @FindBy(how = How.ID, using = "login-signin")
    public static WebElement btnLoginSignin ;

    @FindBy(how = How.XPATH, using = ".//*[@id='uh-profile']")
    public static WebElement btnUhProfile ;

    @FindBy(how = How.ID, using = "login-username")
    public static WebElement txtLoginUsername ;

    @FindBy(how = How.ID, using = "login-passwd")
    public static WebElement txtLoginPasswd ;

    @FindBy(how = How.XPATH, using = ".//*[@id='uh-signedout']/span")
    public static WebElement hrSignedout ;

    @FindBy(how = How.XPATH, using = ".//*[@id='mbr-login-error']")
    public static WebElement loginError ;



    public void LogIn(String Username,String password) throws InterruptedException {
        sleepFor(1);
        clickByElement(btnSignbtn);
        txtLoginUsername.clear();
        txtLoginUsername.sendKeys(Username);
        clickByElement(btnLoginSignin);
        sleepFor(1);
        txtLoginPasswd.sendKeys(password);
        clickByElement(btnLoginSignin);
        sleepFor(2);
    }


    public void assertSuccessfulLogin() {
        Assert.assertTrue(isElementPresent(btnUhProfile));
    }
}
