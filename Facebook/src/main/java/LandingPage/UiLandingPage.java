package LandingPage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 18-01-2017.
 */
public class UiLandingPage extends CommonMethods {
    @FindBy(how = How.XPATH, using="html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/*")
    List<WebElement> elements = new ArrayList<>();

    public void assertPage(){
        Assert.assertTrue(elements.get(2).isDisplayed());
    }

    public void typeUsername(String username){
        elements.get(0).sendKeys(username);

    }

    public void typePassword(String password){
        elements.get(1).sendKeys(password);
    }

    public void clickLogin(){
        elements.get(2).click();
    }

    public void login(String username, String password){
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[3]/div/div/div")
    public WebElement errorCredentials;

    public void assertIncorrectCredential(String condition){
        switch (condition){
            case "incorrectUsername": Assert.assertTrue(errorCredentials.getText().contains("The email you’ve entered doesn’t match any account")); break;
            case "incorrectPassword": Assert.assertTrue(errorCredentials.getText().contains("The password you’ve entered is incorrect"));break;

        }

//        if(condition) {
//            Assert.assertTrue(errorCredentials.getText().contains("The email you’ve entered doesn’t match any account"));
//        }else {
//            Assert.assertTrue(errorCredentials.getText().contains("The password you’ve entered is incorrect"));
//        }
    }

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div[1]/ul/li/div/div/a")
    public WebElement homepageFullName;

    public void assertSuccessfulLogin(){
        Assert.assertTrue(homepageFullName.getText().equals(FacebookFullName));
    }
}
