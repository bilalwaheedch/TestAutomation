package Ui.HomePage;

import Ui.CignaMedicarePage.UiCignaMedicarePage;
import Ui.HealthWellnessPage.UiHealthWellnessPage;
import Ui.IndividualFamilyPlansPage.UiIndividualFamilyPlansPage;
import Ui.InternationalIndividualPlansPage.UiInternationalIndividualPlansPage;
import Ui.OfferedCignaThroughWorkPage.UiOfferedCignaThroughWorkPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by izran on 2/12/2017.
 */
public class UiTopNav {
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div/div[1]/div/div[2]/div/div/header/div/div[2]/nav/ul/li/a")
    List<WebElement> elements = new ArrayList<>();



    public UiIndividualFamilyPlansPage getIndividualFamilyPlansPage(WebDriver driver){
        elements.get(0).click();
        return PageFactory.initElements(driver, UiIndividualFamilyPlansPage.class);
    }

    public UiCignaMedicarePage getCignaMedicarePage(WebDriver driver){
        elements.get(1).click();
        return PageFactory.initElements(driver, UiCignaMedicarePage.class);
    }

    public UiInternationalIndividualPlansPage getInternationalIndividualPlansPage(WebDriver driver){
        elements.get(2).click();
        return PageFactory.initElements(driver, UiInternationalIndividualPlansPage.class);
    }

    public UiOfferedCignaThroughWorkPage getOfferedCignaThroughWorkPage(WebDriver driver){
        elements.get(3).click();
        return PageFactory.initElements(driver, UiOfferedCignaThroughWorkPage.class);
    }

    public UiHealthWellnessPage getDHealthWellnessPage(WebDriver driver){
        elements.get(4).click();
        return PageFactory.initElements(driver, UiHealthWellnessPage.class);
    }
}
