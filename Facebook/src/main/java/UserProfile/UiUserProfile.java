package UserProfile;

import Homepage.UiHomePage;
import Homepage.UiMenuBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiUserProfile extends UiHomePage{

    public void getUserProfile(){
        UiMenuBar uiMenuBar = PageFactory.initElements(driver,UiMenuBar.class);
        uiMenuBar.getUserProfile();
    }
    @FindBy(xpath = ".//a[@aria-label='Story options']")
    List<WebElement> lnkReactionMenu = new ArrayList<>();
    public void getLastReactionMenu(){
        lnkReactionMenu.get(0).click();
    }

}
