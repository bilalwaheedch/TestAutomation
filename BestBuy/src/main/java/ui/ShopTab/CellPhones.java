package ui.ShopTab;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 17-01-2017.
 */
public class CellPhones extends CommonMethods{
    @FindAll({
        @FindBy(how = How.XPATH, using = ".//*[@id='global-header']/nav[2]/div[2]/div/div[1]/ul/li[1]/div/div[1]/div/div/div[2]/ul[1]/li")
    })
    List<WebElement> elements = new ArrayList<>();

    public void getiPhonePage() throws InterruptedException {
        sleepFor(2);
        elements.get(0).click();
    }
    public void getAndroidPage(){
        elements.get(1).click();
    }
    public void getBlackBerryPage(){
        elements.get(2).click();
    }
    public void getPrepaidPhonePage(){
        elements.get(3).click();
    }
    public void getUnlockedCellPhonesPage(){
        elements.get(4).click();
    }
    public void getTabletsPage(){
        elements.get(5).click();
    }
 }
