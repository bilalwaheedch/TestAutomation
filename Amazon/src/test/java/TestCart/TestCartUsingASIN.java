package TestCart;

import DataForCart.ItemsForCart;
import PageFactory.AmazonCart;
import methods.CartAPI;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class TestCartUsingASIN extends CartAPI{
    @Test(priority = 1)
    public void testCartAddItem() throws IOException, InterruptedException {
        ItemsForCart itemsForCart = new ItemsForCart();
        String[] itemASIN=itemsForCart.getItemASIN();
        String[] itemDept= itemsForCart.getItemDept();
        for(int i=0;i<itemASIN.length;i++) {
            addItemToCart(itemASIN[i], itemDept[i]);
            Assert.assertTrue(getTextByXpath(".//*[@id='huc-v2-order-row-confirm-text']/h1").equals("Added to Cart"));
         }
    }
    @Test(priority = 2)
    public void testCartRemoveItem() throws IOException, InterruptedException {
        AmazonCart amazonCart = PageFactory.initElements(driver, AmazonCart.class);
        ItemsForCart itemsForCart = new ItemsForCart();
        String[] itemASIN=itemsForCart.getItemASIN();
        String[] itemDept= itemsForCart.getItemDept();
        for(int i=0;i<itemASIN.length;i++) {
            addItemToCart(itemASIN[i], itemDept[i]);
            Assert.assertTrue(amazonCart.textAddedToCart.getText().equals("Added to Cart"));
//            Assert.assertTrue(getTextByXpath(".//*[@id='huc-v2-order-row-confirm-text']/h1").equals("Added to Cart"));
            removeFirstItemFromCart();
            sleepFor(2);
            Assert.assertTrue(amazonCart.textRemovedFromCart.getText().contains("removed"));
        }

    }
}
