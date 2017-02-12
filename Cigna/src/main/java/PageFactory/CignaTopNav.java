package PageFactory;

/**
 * Created by izran on 2/12/2017.
 */

import Ui.CignaMedicarePage.UiCignaMedicarePage;
import Ui.IndividualFamilyPlansPage.UiIndividualFamilyPlansPage;
import Ui.InternationalIndividualPlansPage.UiInternationalIndividualPlansPage;
import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CignaTopNav extends CommonMethods {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div/div[1]/div/div[2]/div/div/header/div/div[2]/nav/ul/li/a")
    List<WebElement> elements = new ArrayList<>();

    public UiIndividualFamilyPlansPage getInboxPage(WebDriver driver){
        elements.get(1).click();
        return PageFactory.initElements(driver, UiIndividualFamilyPlansPage.class);
    }

//    public UiCignaMedicarePage getDraftsPage(WebDriver driver){
//        elements.get(3).click();
//        return PageFactory.initElements(driver, UiCignaMedicarePage.class);
//    }
//
//    public UiInternationalIndividualPlansPage getDraftsPage(WebDriver driver){
//        elements.get(3).click();
//        return PageFactory.initElements(driver, UiInternationalIndividualPlansPage.class);
//    }
//
//    public UiCignaMedicarePage getDraftsPage(WebDriver driver){
//        elements.get(3).click();
//        return PageFactory.initElements(driver, UiCignaMedicarePage.class);
//    }
//
//    public UiCignaMedicarePage getDraftsPage(WebDriver driver){
//        elements.get(3).click();
//        return PageFactory.initElements(driver, UiCignaMedicarePage.class);
//    }
}
