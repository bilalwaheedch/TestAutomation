package PageFactorySendEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by izran on 1/9/2017.
 */
public class SendEmail {

    @FindBy(how = How.ID, using = "uh-mail")
    public static WebElement linkMail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose')]")
    public static WebElement linkCompose;

    @FindBy(how = How.ID_OR_NAME, using = "to-field")
    public static WebElement txtToField ;

    @FindBy(how = How.ID_OR_NAME, using = "subject-field")
    public static WebElement txtSubjectField ;

    @FindBy(how = How.ID, using = "rtetext")
    public static WebElement txtBody ;

    @FindBy(how = How.XPATH, using = "//a[contains(@title,'Send this email')]")
    public static WebElement linkSendEmail ;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sent')]")
    public static WebElement linkSendList ;
}
