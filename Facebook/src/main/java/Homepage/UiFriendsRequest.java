package Homepage;

import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DriverFactory;

import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiFriendsRequest extends CommonMethods {
    @FindBy(xpath = ".//*[@class='jewelFooter']")
    public WebElement lnkJewelFooter;

    public void getFriendsRequestPage(){
        lnkJewelFooter.click();
    }
    public void respondFriendRequest(String reqID, String response){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        List<WebElement> btnFriendRequest = driver.findElements(By.xpath(".//div[@data-id='"+reqID+"']//div[@class='ruResponseButtons']/button"));
        switch(response){
            case "accept": btnFriendRequest.get(0).click();break;
            case "decline": btnFriendRequest.get(1).click();break;
        }
    }
}
