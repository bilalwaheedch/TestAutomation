package ui.SignIn;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 22-01-2017.
 */
public class UiSIgnIn extends CommonMethods{
    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/h1")
    public WebElement pageHeading;
    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[4]/div[1]/div/div/fieldset/ul/li[*]/span/input")
    public WebElement formSignIn;
    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[4]/div[1]/div/div/fieldset/ul/li[*]/span/input")
    public WebElement formSubmit;
    
}
