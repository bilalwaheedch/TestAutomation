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
    @FindBy(how = How.XPATH, using = "html/body/form/div[3]/div/header/nav[2]/div[2]/div/div[1]/ul/li")
    List<WebElement> elements = new ArrayList<>();
    private WebDriver driver = DriverFactory.getInstance().getDriver();

    public UiCellPhones getCellPhonesTab(){
        elements.get(0).click();
        return PageFactory.initElements(driver,UiCellPhones.class);
    }


}
