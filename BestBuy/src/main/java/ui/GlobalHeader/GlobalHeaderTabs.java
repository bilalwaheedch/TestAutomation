package ui.GlobalHeader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 17-01-2017.
 */
public class GlobalHeaderTabs extends CommonAPI{

    @FindBy(how = How.XPATH, using = "html/body/form/div[3]/div/header/nav[2]/div[1]/div[1]/ul/li")
    List<WebElement> elementsMainNav = new ArrayList<>();


    public BestBuyLogo getBestBuyLogo(){
        elementsMainNav.get(0).click();
        return new BestBuyLogo();
    }
    public ShopMenuTab getShopNav(){
        elementsMainNav.get(1).click();
        return new ShopMenuTab();
    }
    public DealsMenuTab getDealsNav(){
        elementsMainNav.get(2).click();
        return new DealsMenuTab();
    }
    public ServicesNav getServicesNav(){
        elementsMainNav.get(3).click();
        return new ServicesNav();
    }

    @FindBy(xpath = ".//*[@id='global-header']/nav[1]/div/ul[2]/li/a")
    public WebElement elementsUtilityRight;

    @FindBy(xpath = ".//*[@class='navigation-search-box']")
    public WebElement navigationSearchBox;

}
