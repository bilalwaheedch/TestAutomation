package ui.US;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ui.US.CrimeJustice.CrimeJusticePage;
import ui.US.EnergyEnvironment.EnergyEnvironmentPage;
import ui.US.SpaceScience.SpaceSciencePage;
import ui.US.Weather.WeatherPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 18-01-2017.
 */
public class USPage extends CommonMethods {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-section-submenu']/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    public CrimeJusticePage crimeJusticePage(){
        elements.get(0).click();
        return new CrimeJusticePage();
    }

    public EnergyEnvironmentPage energyEnvironmentPage(){
        elements.get(1).click();
        return new EnergyEnvironmentPage();
    }

    public WeatherPage weatherPage(){
        elements.get(2).click();
        return new WeatherPage();
    }

    public SpaceSciencePage spaceSciencePage(){
        elements.get(3).click();
        return new SpaceSciencePage();
    }

}
