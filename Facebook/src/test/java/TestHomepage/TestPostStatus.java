package TestHomepage;

import Homepage.UiHomePage;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.DriverFactory;

import java.io.IOException;

/**
 * Created by Bilal on 02-02-2017.
 */
public class TestPostStatus extends CommonMethods{
    public UiHomePage uiHomePage() throws IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        getLogger(this.getClass()).info("Creating new instance of WebDriver");
        signIn();
        getLogger(this.getClass()).info("Signing in to Facebook");
        return PageFactory.initElements(driver,UiHomePage.class);
    }
    @Test
    public void testPostStatus() throws IOException, InterruptedException {
        uiHomePage().typeReactionComposer("Test Post 2",DriverFactory.getInstance().getDriver());
        getLogger(TestPostStatus.class).info("Post Update from Reaction Composer");
        sleepFor(1);
    }
//    @Test
//    public void testDeleteStatus(){
//
//    }
}
