package methods;

import org.openqa.selenium.support.PageFactory;
import PageFactory.AmazonCart;
import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class CartAPI extends CommonMethods {

    public void addItemToCart(String itemASIN, String itemDepartment) throws IOException, InterruptedException {
        AmazonCart amazonCart = PageFactory.initElements(driver, AmazonCart.class);
        searchDropDownSelectOption(itemDepartment);
        searchUniqueItem(itemASIN);
        amazonCart.linkAddToCart.click();
//        if(isElementPresentByXPATH(".//*[@id='siAddCoverage-announce']")){
//            amazonCart.declineCoverage.click();
//        }
    }
    public void removeFirstItemFromCart(){
        AmazonCart amazonCart = PageFactory.initElements(driver, AmazonCart.class);
        amazonCart.linkCartIcon.click();
        amazonCart.linkDeleteFirstItem.click();
        //clickByXpath(".//*[@id='activeCartViewForm']/div[2]/div[1]/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input");

    }
}
