package PageFactory;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Bilal on 10-01-2017.
 */
public class AmazonTopNav extends CommonAPI {
    WebDriver pageObjectDriver;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-your-amazon']")
    public static WebElement linkYourStore;
    public static String titleYourStore = "Sign In";

    @FindBys({
            @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[2]"),
//            @FindBy(how = How.LINK_TEXT, using = "Deals Store")
    })
    public static WebElement linkDealsStore;
    public static String titleDealsStore = "Deals";

    @FindBys({
            @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[3]"),
//            @FindBy(how = How.LINK_TEXT, using = "Gift Cards")
    })
    public static WebElement linkGiftCards;
    public static String titleGiftCards = "Gift Cards";

    @FindBys({
            @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[4]"),
//            @FindBy(how = How.LINK_TEXT, using = "Sell")
    })
    public static WebElement linkSell;
    public static String titleSell = "Sell";

    @FindBys({
            @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[5]"),
//            @FindBy(how = How.LINK_TEXT, using = "Help")
    })
    public static WebElement linkHelp;
    public static String titleHelp = "Help";

    public AmazonTopNav(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);

    }
}