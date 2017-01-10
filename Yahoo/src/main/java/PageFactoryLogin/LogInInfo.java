package PageFactoryLogin;

/**
 * Created by izran on 1/9/2017.
 */

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInInfo {

    @FindBy(how = How.XPATH, using = ".//*[@id='uh-signedin']")
    public static WebElement btnSigndin;

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
}
