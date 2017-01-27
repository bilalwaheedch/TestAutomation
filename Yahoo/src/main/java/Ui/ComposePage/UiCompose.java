package Ui.ComposePage;

import base.CommonAPI;
import data.Email;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/23/2017.
 */
public class UiCompose extends CommonMethods {

    @FindBy(how = How.ID, using = "uh-mail")
    public static WebElement linkMail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Compose')]")
    public static WebElement linkCompose;

    @FindBy(how = How.ID_OR_NAME, using = "to-field")
    public static WebElement txtToField;

    @FindBy(how = How.ID_OR_NAME, using = "subject-field")
    public static WebElement txtSubjectField;

    @FindBy(how = How.ID, using = "rtetext")
    public static WebElement txtBody;

    @FindBy(how = How.XPATH, using = "//a[contains(@title,'Send this email')]")
    public static WebElement linkSendEmail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sent')]")
    public static WebElement linkSendList;


    public void SendEmails(Email oEmail) throws InterruptedException {

        sleepFor(1);
        linkMail.click();
        sleepFor(1);
        clickByElement(linkCompose);
        sleepFor(1);

        txtToField.sendKeys(oEmail.toEmail());
        txtSubjectField.sendKeys(oEmail.subject());
        txtBody.sendKeys(oEmail.body());
        sleepFor(1);
        clickByElement(linkSendEmail);
        sleepFor(1);
        clickByElement(linkSendList);
        sleepFor(4);
        //Assert.assertTrue(isElementPresentByXPATH("//*[contains(text(),'" + oEmail.subject().trim() + "')]"));
    }

    public void HomePage() throws InterruptedException {
        sleepFor(1);
        linkMail.click();
    }
}