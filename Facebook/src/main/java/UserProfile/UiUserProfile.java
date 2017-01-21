package UserProfile;

import Homepage.UiHomePage;
import Homepage.UiMenuBar;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiUserProfile extends UiHomePage{

    public void getUserProfile(){
        UiMenuBar uiMenuBar = PageFactory.initElements(driver,UiMenuBar.class);
        uiMenuBar.getUserProfile();
    }


}
