package methods;

import PageFactoryLogin.LogInInfo;
import PageFactorySendEmail.SendEmail;
import base.CommonAPI;
import com.mongodb.gridfs.CLI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by izran on 1/9/2017.
 */
public class CommonMethods extends CommonAPI {

    public void LogIn() throws InterruptedException {
//        LogInInfo logInInfo = PageFactory.initElements(driver, LogInInfo.class);
//
//        sleepFor(1);
//        try {
//            if (LogInInfo.hrSignedout.isDisplayed()) {
//                LogInInfo.hrSignedout.click();
//                sleepFor(1);
//            }
//        } catch (Exception ex) {
//        }


        sleepFor(1);

        LogInInfo logInInfo = PageFactory.initElements(driver, LogInInfo.class);
        //logInInfo.btnSigndin.click();
        Click(logInInfo.btnSigndin);


        logInInfo.txtLoginUsername.sendKeys(CommonAPI.YahooUserName.toString());

        //logInInfo.btnLoginSignin.click();
        Click(logInInfo.btnLoginSignin);


        sleepFor(1);
        logInInfo.txtLoginPasswd.sendKeys(CommonAPI.YahooPassword.toString());


        //logInInfo.btnLoginSignin.click();
        Click(logInInfo.btnLoginSignin);


        sleepFor(1);

        Assert.assertTrue(logInInfo.btnUhProfile.isDisplayed());
    }

    public void SendEmails(String toEmail, String subject, String body) throws InterruptedException {

        sleepFor(1);

        SendEmail sendEmail = PageFactory.initElements(driver, SendEmail.class);
        sendEmail.linkMail.click();
        sleepFor(2);

        //sendEmail.linkCompose.click();
        //Click(By.xpath("//span[contains(text(),'Compose')]"));//span[contains(text(),'Compose')]
        Click(sendEmail.linkCompose);

        sleepFor(2);

        sendEmail.txtToField.sendKeys(toEmail);
        sendEmail.txtSubjectField.sendKeys(subject);
        sendEmail.txtBody.sendKeys(body);
        sleepFor(1);

        //sendEmail.linkSendEmail.click();
        Click(sendEmail.linkSendEmail);



        sleepFor(1);
        //sendEmail.linkSendList.click();
        Click(sendEmail.linkSendList);


        sleepFor(4);

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'" + subject + "')]")).isDisplayed());


    }

    public void Click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            element.click();
        }
    }
}
