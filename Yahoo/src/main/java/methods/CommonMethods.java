package methods;

import Ui.LoginPage.UiLogin;
import utility.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by izran on 1/9/2017.
 */
public class CommonMethods extends GetDriver {
    public static final String YahooUserName = System.getenv("YahooUserName");
    public static final String YahooPassword = System.getenv("YahooPassword");
//    public void LogIn(String Username,String password) throws InterruptedException {
//        sleepFor(1);
//        LogInInfo logInInfo = PageFactory.initElements(driver, LogInInfo.class);
//
//        //logInInfo.btnSigndin.click();
//        Click(logInInfo.btnSigndin);
//
//        logInInfo.txtLoginUsername.sendKeys(Username);
//
//        //logInInfo.btnLoginSignin.click();
//        Click(logInInfo.btnLoginSignin);
//
//
//        sleepFor(1);
//        logInInfo.txtLoginPasswd.sendKeys(password);
//
//        //logInInfo.btnLoginSignin.click();
//        Click(logInInfo.btnLoginSignin);
//
//        sleepFor(1);
//
//        Assert.assertTrue(logInInfo.btnUhProfile.isDisplayed());
//    }
//
//    public void SendEmails(String toEmail, String subject, String body) throws InterruptedException {
//
//        sleepFor(1);
//
//        SendEmail sendEmail = PageFactory.initElements(driver, SendEmail.class);
//        sendEmail.linkMail.click();
//        sleepFor(2);
//
//        //sendEmail.linkCompose.click();
//        //Click(By.xpath("//span[contains(text(),'Compose')]"));//span[contains(text(),'Compose')]
//        Click(sendEmail.linkCompose);
//
//        sleepFor(2);
//
//        sendEmail.txtToField.sendKeys(toEmail);
//        sendEmail.txtSubjectField.sendKeys(subject);
//        sendEmail.txtBody.sendKeys(body);
//        sleepFor(1);
//
//        //sendEmail.linkSendEmail.click();
//        Click(sendEmail.linkSendEmail);
//
//        sleepFor(1);
//        //sendEmail.linkSendList.click();
//        Click(sendEmail.linkSendList);
//
//        sleepFor(4);
//
//        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'" + subject + "')]")).isDisplayed());
//
//
//    }
//
//    public void Click(WebElement element) {
//        try {
//            element.click();
//        } catch (Exception e) {
//            element.click();
//        }
//    }

    public void LogIn(WebDriver driver) throws InterruptedException,IOException {
        UiLogin uiLogin = PageFactory.initElements(driver, UiLogin.class);
        uiLogin.SetDriver(driver);
        uiLogin.LogIn(YahooUserName,YahooPassword);
    }
}
