package ui.ListPage;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by izran on 1/22/2017.
 */
public class UiDeleteList  extends CommonMethods {
    CommonAPI commonAPI;
    WebDriver locDriver = null;

    @FindBy(how = How.XPATH, using = ".//*[@id='dojox_form_TriStateCheckBox_0']")
    public WebElement chkDeleteLists;

    @FindBy(how = How.XPATH, using = ".//*[@id='delete-btn']")
    public WebElement btnDeleteLists;

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit_form_Button_1_label']")
    public WebElement btnDeleteListsConfirm;

    @FindBy(how = How.XPATH, using = ".//*[@id='dijit__Templated_2-confirm-text']")
    public WebElement txtConfirmText;

    public void clickChkDeleteLists() {
        chkDeleteLists.click();
    }

    public void clickDeleteLists() {
        btnDeleteLists.click();
    }

    public void clickConfirmDeleteLists() {
        btnDeleteListsConfirm.click();
    }

    public void clickDeleteListsConfirm() {
        btnDeleteListsConfirm.click();
    }

    public void SetDriver(WebDriver locDriver){
        commonAPI=new  CommonAPI();
        commonAPI.setDriver(locDriver);
    }

    public void DeleteLists() throws InterruptedException {
        //clickUiList();
        commonAPI.sleepFor(1);
        if (commonAPI.isElementPresent(chkDeleteLists)) {
            clickChkDeleteLists();
            commonAPI.sleepFor(1);

            clickDeleteLists();
            commonAPI.sleepFor(2);
            commonAPI.typeByElement(txtConfirmText, "DELETE");
            clickDeleteListsConfirm();
            commonAPI.sleepFor(2);
        }
    }
}
