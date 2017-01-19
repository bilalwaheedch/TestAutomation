package CreatePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiCreatePage {
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[2]/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "Create a Page";

    public void assertGetCreatePage(){
        pageHeading.getText().contains(pageHeadingText);
    }
}
