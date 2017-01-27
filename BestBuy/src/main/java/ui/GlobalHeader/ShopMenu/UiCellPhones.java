package ui.GlobalHeader.ShopMenu;

import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ui.CellPhones.*;
import utility.DriverFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 17-01-2017.
 */
public class UiCellPhones extends CommonMethods{
    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'cell-phones-list margin-right-one')][1]/li/a")
    List<WebElement> elements = new ArrayList<>();
    private WebDriver driver = DriverFactory.getInstance().getDriver();
    public UiIPhonePage getiPhonePage(){
        elements.get(0).click();
        return PageFactory.initElements(driver,UiIPhonePage.class);
    }
    public UiAndroid getAndroidPage(){
        elements.get(1).click();
        return PageFactory.initElements(driver,UiAndroid.class);
    }
    public UiBlackBerry getBlackBerryPage(){
        elements.get(2).click();
        return PageFactory.initElements(driver,UiBlackBerry.class);
    }
    public UiPrePaidPhones getPrepaidPhonesPage(){
        elements.get(3).click();
        return PageFactory.initElements(driver,UiPrePaidPhones.class);
    }
    public UiUnlockedCellPhones getUnlockedCellPhonesPage(){
        elements.get(4).click();
        return PageFactory.initElements(driver,UiUnlockedCellPhones.class);
    }
    public UiTablets getTabletsPage(){
        elements.get(5).click();
        return PageFactory.initElements(driver,UiTablets.class);
    }
 }
