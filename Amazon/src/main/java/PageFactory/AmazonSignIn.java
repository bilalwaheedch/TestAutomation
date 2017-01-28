package PageFactory;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Bilal on 17-01-2017.
 */
public class AmazonSignIn extends CommonMethods{
    @FindBy(how = How.XPATH, using=".//*[@id='auth-email-missing-alert']/div/div")
    public WebElement alertMissingEmail;

    @FindBy(how = How.XPATH, using=".//*[@id='auth-password-missing-alert']/div/div")
    public WebElement alertMissingPassword;

    @FindBy(how = How.XPATH, using=".//*[@id='auth-error-message-box']/div/div/ul/li/span")
    public WebElement errorMessageBox;

    @FindBy(xpath = ".//*[@id='auth-warning-message-box']/div/div/ul/li/span")
    public WebElement warningMessageBox;

    public String incorrectEmailMessage = "We cannot find an account with that e-mail address";
    public String incorrectPasswordMessage = "Your password is incorrect";
    public String incorrectCredentialsMessage = "To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below.";

}
