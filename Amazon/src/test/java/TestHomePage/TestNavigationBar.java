package TestHomePage;

import base.CommonAPI;
import PageFactory.AmazonTopNav;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 10-01-2017.
 */
public class TestNavigationBar extends CommonMethods{

    @Test(priority = 1)
    public void testTopNavYourStoreLink(){
        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
//        AmazonTopNav amazonTopNav = new AmazonTopNav(driver);
        amazonTopNav.linkYourStore.click();
        Assert.assertTrue(getTitle().contains(AmazonTopNav.titleYourStore));
    }

    @Test(priority = 2)
    public void testTopNavDealsStore(){
        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
//        AmazonTopNav amazonTopNav = new AmazonTopNav(driver);
        amazonTopNav.linkDealsStore.click();
        Assert.assertTrue(getTitle().contains(AmazonTopNav.titleDealsStore));
    }

    @Test(priority = 3)
    public void testTopNavGiftCards(){
        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
//        AmazonTopNav amazonTopNav = new AmazonTopNav(driver);
        amazonTopNav.linkGiftCards.click();
        Assert.assertTrue(getTitle().contains(AmazonTopNav.titleGiftCards));
    }

    @Test(priority = 4)
    public void testTopNavSell(){
        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
//        AmazonTopNav amazonTopNav = new AmazonTopNav(driver);
        amazonTopNav.linkSell.click();
        Assert.assertTrue(getTitle().contains(AmazonTopNav.titleSell));
    }

    @Test(priority = 5)
    public void testTopNavHelp(){
        AmazonTopNav amazonTopNav = PageFactory.initElements(driver, AmazonTopNav.class);
//        AmazonTopNav amazonTopNav = new AmazonTopNav(driver);
        amazonTopNav.linkHelp.click();
        Assert.assertTrue(getTitle().contains(AmazonTopNav.titleHelp));
    }
}
