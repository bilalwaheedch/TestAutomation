package PageFactory;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class AmazonCart extends CommonMethods{
    @FindBy(how = How.CSS, using ="#nav-cart")
    public static WebElement linkCartIcon;

    @FindBy(how = How.XPATH, using=".//*[@id='gutterCartViewForm']/div[3]/div[2]/div/div[1]/p/span/span[1]")
    public static WebElement cartSubtotalItems;

    @FindBy(how = How.XPATH, using=".//*[@id='gutterCartViewForm']/div[3]/div[2]/div/div[1]/p/span/span[2]")
    public static WebElement cartSubtotalAmount;

    @FindBy(how = How.XPATH, using=".//*[@id='add-to-cart-button']")
    public static WebElement linkAddToCart;

    @FindBy(how= How.XPATH, using = ".//*[@id='siNoCoverage-announce']")
    public static WebElement declineCoverage;

    @FindBy(how=How.XPATH, using = ".//*[@id='activeCartViewForm']/div[2]/div[1]/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")
    public static WebElement linkDeleteFirstItem;

    @FindBy(how=How.XPATH, using = ".//*[@id='huc-v2-order-row-confirm-text']/h1")
    public static WebElement textAddedToCart;

    @FindBy(how=How.XPATH, using = ".//*[@id='activeCartViewForm']/div[2]/div/div[3]/div[1]/span")
    public static WebElement textRemovedFromCart;

    @FindBy(how = How.XPATH, using=".//*[@id='nav-cart-count']")
    public static WebElement cartCount;
}
