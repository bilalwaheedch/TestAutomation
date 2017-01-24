package Homepage;

import UserProfile.UiUserProfile;
import methods.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DriverFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiMenuBar extends CommonMethods{
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[1]/div/div[1]/div/div/div/div/div/*/*")
    List<WebElement> elements = new ArrayList<>();
    private WebDriver driver = DriverFactory.getInstance().getDriver();
    public void clickFacebookLogo(){
        elements.get(0).click();
    }
    public void searchFacebook(String text){
        elements.get(1).sendKeys(text, Keys.ENTER);
    }
    public UiUserProfile getUserProfile(){
        elements.get(2).click();
        return new UiUserProfile();
    }
    public void getHomepage(){
        elements.get(3).click();
    }
    public UiFriendsRequestTab getFriendsRequestTab(){
        elements.get(4).click();
        return new UiFriendsRequestTab();
    }
    public UiMessagesTab getMessagesTab(){
        elements.get(5).click();
        return new UiMessagesTab();
    }
    public UiNotificationsTab getNotificationsTab(){
        elements.get(6).click();
        return new UiNotificationsTab();
    }
    public UiPrivacyShortcutsTab getPrivacyShortcutsTab(){
        elements.get(7).click();
        return new UiPrivacyShortcutsTab();
    }
    public UiYourAccountMenuTab getYourAccountMenuTab(){
        elements.get(8).click();
        return PageFactory.initElements(driver,UiYourAccountMenuTab.class);
    }

}
