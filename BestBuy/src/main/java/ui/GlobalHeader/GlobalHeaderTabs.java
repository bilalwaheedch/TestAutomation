package ui.GlobalHeader;

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
public class GlobalHeaderTabs extends CommonMethods{
    @FindAll({
            @FindBy(how = How.XPATH, using = "html/body/form/div[3]/div/header/nav[2]/div[1]/div[1]/ul/li")
    })
    List<WebElement> elements = new ArrayList<>();

    public BestBuyLogo getBestBuyLogo(){
        elements.get(0).click();
        return new BestBuyLogo();
    }
    public ShopMenu getShopNav(){
        elements.get(1).click();
        return new ShopMenu();
    }
    public DealsNav getDealsNav(){
        elements.get(2).click();
        return new DealsNav();
    }
    public ServicesNav getServicesNav(){
        elements.get(3).click();
        return new ServicesNav();
    }
}
