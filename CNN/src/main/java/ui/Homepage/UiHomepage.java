package ui.Homepage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ui.US.USPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 18-01-2017.
 */
public class UiHomepage extends CommonMethods {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    public USPage usPage(){
        elements.get(0).click();
        return new USPage();
    }


}
