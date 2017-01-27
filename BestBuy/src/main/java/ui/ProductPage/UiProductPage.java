package ui.ProductPage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 27-01-2017.
 */
public class UiProductPage extends CommonMethods{
    @FindBy(xpath = ".//*[@class='product-title']")
    public WebElement titleProduct;
}
