package Ui.ComposePage;

import base.CommonAPI;
import data.Email;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by izran on 1/23/2017.
 */
public class UiCompose {
    CommonAPI commonAPI;

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

    public void SetDriver(WebDriver locDriver) {
        commonAPI = new CommonAPI();
        commonAPI.setDriver(locDriver);
    }

    public void SendEmails(Email oEmail) throws InterruptedException {

        commonAPI.sleepFor(1);
        linkMail.click();
        commonAPI.sleepFor(1);
        commonAPI.clickByElement(linkCompose);
        commonAPI.sleepFor(1);

        txtToField.sendKeys(oEmail.toEmail());
        txtSubjectField.sendKeys(oEmail.subject());
        txtBody.sendKeys(oEmail.body());
        commonAPI.sleepFor(1);
        commonAPI.clickByElement(linkSendEmail);
        commonAPI.sleepFor(1);
        commonAPI.clickByElement(linkSendList);
        commonAPI.sleepFor(4);
        Assert.assertTrue(commonAPI.isElementPresentByXPATH("//*[contains(text(),'" + oEmail.subject() + "')]"));
    }

}