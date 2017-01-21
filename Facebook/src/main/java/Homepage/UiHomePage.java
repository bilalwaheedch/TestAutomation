package Homepage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Bilal on 20-01-2017.
 */
public class UiHomePage extends CommonMethods {
    @FindBy(how = How.XPATH,using = ".//*[@id='u_c_1']/div/div[1]/em")
    public WebElement headingSettings;

    @FindBy(how = How.XPATH,using = ".//*[@id='u_g_0']")
    public WebElement headingCreateGroup;
}
