package ui.CellPhones;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import ui.GlobalHeader.ShopMenu.UiCellPhones;

/**
 * Created by Bilal on 21-01-2017.
 */
public class UiIPhonePage extends UiCellPhones{
    @FindBy(css = ".category-headline")
    public WebElement pageHeading;
    public String textPageHeading = "iPhone";
    public void assertPage(){
        getLogger(UiIPhonePage.class).info("Assert iPhone Page");
        Assert.assertTrue(textPageHeading.equals(pageHeading.getText()));
    }
}
