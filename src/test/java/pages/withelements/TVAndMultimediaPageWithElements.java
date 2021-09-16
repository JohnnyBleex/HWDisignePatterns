package pages.withelements;

import elements.*;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TVAndMultimediaPageWithElements extends BasePage {
    public TVAndMultimediaPageWithElements(WebDriver driver) {
        super(driver);
    }

    String headerBlockXpath = "//header";
    String chBoxCompanyFilterXpath = "//span[contains(text(), 'company')]";
    String dropDownMenuDiagonalXpath = "//span[contains(text(), 'Диагональ экрана (дюйм)')]";
    String diagonalRangeFromXpath = "//input[@placeholder='от 22']";
    String diagonalRangeUpToXpath = "//input[@placeholder='до 88']";
    String dropDownMenuScreenRefreshRateXpath = "//span[contains(text(), 'Частота обновления экрана (Гц)')]";
    String chBoxScreenRefreshRateXpath = "//span[contains(text(), 'hertz')]";
    String dropDownMenuBacklightTypeXpath = "//div[@data-id='f[rh2]']";
    String backlightTypeXpath = "//span[contains(text(), 'Direct LED')]";
    String buttonApplyXpath = "//button[text()='Применить']";
    String dropDownMenuSortingPriceXpath = "//div[@data-id='order']";
    String sortingPriceExpensiveXpath = "//span[contains(text(), 'Сначала дорогие')]";
    String firstElementXpath = "//div[@data-id='product']/a";

    public void hideHeader(){
        MainBlock headerBlockHide = new MainBlock(eventDriver, By.xpath(headerBlockXpath));
        headerBlockHide.hide();
    }

    public void dropDownMenuSortingPriceShow(){
        DropDownMenu dropDownMenuSort = new DropDownMenu(eventDriver, By.xpath(dropDownMenuSortingPriceXpath));
        dropDownMenuSort.show();
    }

    public void sortingPriceExpensiveClick(){
        RadioButton radioButtonExpensive = new RadioButton(eventDriver, By.xpath(sortingPriceExpensiveXpath));
        radioButtonExpensive.setSelected(true);
    }

    public void chBoxCompanyFilterClick(String company){
        chBoxCompanyFilterXpath = chBoxCompanyFilterXpath.replace("company", company);
        CheckBox checkBoxCompany = new CheckBox(eventDriver, By.xpath(chBoxCompanyFilterXpath));
        checkBoxCompany.setChecked(true);
    }

    public void dropDownMenuDiagonalClick(){
        DropDownMenu dropDownMenuDiagonal = new DropDownMenu(eventDriver, By.xpath(dropDownMenuDiagonalXpath));
        dropDownMenuDiagonal.show();
    }

    public void diagonalRangeFromSend(String rangeFrom){
        TextBox textBoxDiagonalRangeFromSend = new TextBox(eventDriver, By.xpath(diagonalRangeFromXpath));
        textBoxDiagonalRangeFromSend.setValue(rangeFrom);
    }

    public void diagonalRangeUpToSend(String rangeUpTo){
        TextBox textBoxDiagonalRangeUpToSend = new TextBox(eventDriver, By.xpath(diagonalRangeUpToXpath));
        textBoxDiagonalRangeUpToSend.setValue(rangeUpTo);
    }

    public void dropDownMenuScreenRefreshRateClick(){
        DropDownMenu dropDownMenuScreenRefreshRate = new DropDownMenu(eventDriver, By.xpath(dropDownMenuScreenRefreshRateXpath));
        dropDownMenuScreenRefreshRate.show();
    }

    public void chBoxScreenRefreshRateClick(String hertz){
        chBoxScreenRefreshRateXpath = chBoxScreenRefreshRateXpath.replace("hertz", hertz);
        CheckBox checkBoxScreenRefreshRate = new CheckBox(eventDriver, By.xpath(chBoxScreenRefreshRateXpath));
        checkBoxScreenRefreshRate.setChecked(true);
    }

    public void dropDownMenuBacklightTypeClick(){
        DropDownMenu dropDownMenuBacklightType = new DropDownMenu(eventDriver, By.xpath(dropDownMenuBacklightTypeXpath));
        dropDownMenuBacklightType.show();
    }

    public void chBoxBacklightTypeClick(){
        CheckBox checkBoxBacklightType = new CheckBox(eventDriver, By.xpath(backlightTypeXpath));
        checkBoxBacklightType.setChecked(true);
    }

    public void buttonApplyClick(){
        Button buttonApply = new Button(eventDriver, By.xpath(buttonApplyXpath));
        buttonApply.click();
    }

    public void linkFirstElementClick(){
        WaitFor.firstProductMustBe(By.xpath(firstElementXpath));
        Link linkFirstElement = new Link(eventDriver, By.xpath(firstElementXpath));
        linkFirstElement.openInNuwWindow();
    }
}
