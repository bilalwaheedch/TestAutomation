package ui.GlobalHeader;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ui.ShopTab.CellPhones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 17-01-2017.
 */
public class ShopMenu extends CommonMethods {
    @FindBy(how = How.XPATH, using = "html/body/form/div[3]/div/header/nav[2]/div[2]/div/div[1]/ul/li")
    List<WebElement> elements = new ArrayList<>();


    public CellPhones getCellPhonesTab() throws InterruptedException {
//        sleepFor(2);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(elements.get(0)).build().perform();
//        sleepFor(2);
        elements.get(0).click();
        return new CellPhones();
    }


}
