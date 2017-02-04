package ui.GlobalHeader;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ui.GlobalHeader.ShopMenu.UiCellPhones;
import utility.DriverFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 17-01-2017.
 */
public class ShopMenuTab extends CommonMethods {
    @FindBy(how = How.XPATH, using = ".//li[not(@class='valentines-flyout')]/a[@class='navigation-dropdown-tab']")
    List<WebElement> elements = new ArrayList<>();
    private WebDriver driver = DriverFactory.getInstance().getDriver();

    public UiCellPhones getCellPhonesTab(){
        elements.get(0).click();
        getLogger(ShopMenuTab.class).info("Open Cell Phones Tab");
        return PageFactory.initElements(driver,UiCellPhones.class);
    }


}
