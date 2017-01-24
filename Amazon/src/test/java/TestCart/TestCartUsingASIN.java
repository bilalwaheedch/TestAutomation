package TestCart;

import DataForCart.ItemsForCart;
import PageFactory.AmazonCart;
import methods.CartAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.DataReader;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 11-01-2017.
 */
public class TestCartUsingASIN extends CartAPI{
    public AmazonCart amazonCart(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        return PageFactory.initElements(driver,AmazonCart.class);
    }
    @Test
    public void testCartAddItem() throws IOException, InterruptedException {
//        AmazonCart amazonCart = PageFactory.initElements(driver, AmazonCart.class);
        ItemsForCart itemsForCart = new ItemsForCart();
        String[] itemASIN=itemsForCart.getItemASIN();
        String[] itemDept= itemsForCart.getItemDept();
        int count = 0;
        for(int i=0;i<itemASIN.length;i++) {
            addItemToCart(itemASIN[i], itemDept[i]);
            count++;
            Assert.assertTrue(amazonCart().cartCount.getText().equals(count));
         }
    }
    @Test
    public void testCartRemoveItem() throws IOException, InterruptedException {
//        AmazonCart amazonCart = PageFactory.initElements(driver, AmazonCart.class);
        ItemsForCart itemsForCart = new ItemsForCart();
        String[] itemASIN=itemsForCart.getItemASIN();
        String[] itemDept= itemsForCart.getItemDept();
        for(int i=0;i<itemASIN.length;i++) {
            addItemToCart(itemASIN[i], itemDept[i]);
            Assert.assertTrue(amazonCart().textAddedToCart.getText().equals(amazonCart().msgAddedToCart));
            removeFirstItemFromCart();
            sleepFor(2);
            Assert.assertTrue(amazonCart().textRemovedFromCart.getText().contains(amazonCart().msgRemovedFromCart));
        }

    }
}
