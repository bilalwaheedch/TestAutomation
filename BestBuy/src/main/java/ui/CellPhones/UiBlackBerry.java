package ui.CellPhones;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ui.GlobalHeader.ShopMenu.UiCellPhones;

/**
 * Created by Bilal on 21-01-2017.
 */
public class UiBlackBerry extends UiCellPhones{
    @FindBy(css = ".category-headline")
    public WebElement pageHeading;
    public String textPageHeading = "BlackBerry";
    public void assertPage(){
        Assert.assertTrue(textPageHeading.equals(pageHeading.getText()));
    }

}
