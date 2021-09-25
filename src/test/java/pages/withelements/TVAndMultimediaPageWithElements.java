package pages.withelements;

import elements.*;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

// Страница телевизоры
public class TVAndMultimediaPageWithElements extends BasePage {
    public TVAndMultimediaPageWithElements(WebDriver driver) {
        super(driver);
    }

    // ***** Локаторы *****
    String headerBlockXpath = "//header";                                                                     // Шапка
    String chBoxCompanyFilterXpath = "//span[contains(text(), 'company')]";                                   // Флажок Производитель
    String dropDownMenuDiagonalXpath = "//span[contains(text(), 'Диагональ экрана (дюйм)')]";                 // Выподающее меню Диагональ
    String diagonalRangeFromXpath = "//input[@placeholder='от 22']";                                          // Поле ввода Диагональ от
    String diagonalRangeUpToXpath = "//input[@placeholder='до 88']";                                          // Поле ввода Диагональ до
    String dropDownMenuScreenRefreshRateXpath = "//span[contains(text(), 'Частота обновления экрана (Гц)')]"; // Выподающее меню Частота обновления экрана
    String chBoxScreenRefreshRateXpath = "//span[contains(text(), 'hertz')]";                                 // Флажок Частота обновления
    String dropDownMenuBacklightTypeXpath = "//div[@data-id='f[rh2]']";                                       // Выподающее меню Тип подсветки
    String backlightTypeXpath = "//span[contains(text(), 'backlight')]";                                      // Тип подсветки
    String buttonApplyXpath = "//button[text()='Применить']";                                                 // Кнопка Применить
    String dropDownMenuSortingPriceXpath = "//div[@data-id='order']";                                         // Выподающее меню сортировки
    String sortingPriceExpensiveXpath = "//span[contains(text(), 'Сначала дорогие')]";                        // Переключатель "Сначало дорогие"
    String firstElementXpath = "//div[@data-id='product']/a";                                                 // Список элементов (Товаров)

    // Скрыть Хэдр
    public void hideHeader(){
        MainBlock headerBlockHide = new MainBlock(eventDriver, By.xpath(headerBlockXpath));
        headerBlockHide.hide();
    }

    // Нажать на выродающее меню Сортировка
    public void dropDownMenuSortingPriceShow(){
        DropDownMenu dropDownMenuSort = new DropDownMenu(eventDriver, By.xpath(dropDownMenuSortingPriceXpath));
        dropDownMenuSort.show();
    }

    // Нажать на переключатель "Сначало дорогие"
    public void sortingPriceExpensiveClick(){
        RadioButton radioButtonExpensive = new RadioButton(eventDriver, By.xpath(sortingPriceExpensiveXpath));
        radioButtonExpensive.setSelected(true);
    }

    // Нажать на флажо производитель
    public void chBoxCompanyFilterClick(String company){
        chBoxCompanyFilterXpath = chBoxCompanyFilterXpath.replace("company", company);
        CheckBox checkBoxCompany = new CheckBox(eventDriver, By.xpath(chBoxCompanyFilterXpath));
        checkBoxCompany.setChecked(true);
    }

    // Нажать на выподающее меню Диагональ экрана
    public void dropDownMenuDiagonalClick(){
        DropDownMenu dropDownMenuDiagonal = new DropDownMenu(eventDriver, By.xpath(dropDownMenuDiagonalXpath));
        dropDownMenuDiagonal.show();
    }

    // Ввести текст в поле диагональ от
    public void diagonalRangeFromSend(String rangeFrom){
        TextBox textBoxDiagonalRangeFromSend = new TextBox(eventDriver, By.xpath(diagonalRangeFromXpath));
        textBoxDiagonalRangeFromSend.setValue(rangeFrom);
    }

    // Ввести текст в поле диагональ до
    public void diagonalRangeUpToSend(String rangeUpTo){
        TextBox textBoxDiagonalRangeUpToSend = new TextBox(eventDriver, By.xpath(diagonalRangeUpToXpath));
        textBoxDiagonalRangeUpToSend.setValue(rangeUpTo);
    }

    // Нажать на выподающее меню Частота обновления экрана
    public void dropDownMenuScreenRefreshRateClick(){
        DropDownMenu dropDownMenuScreenRefreshRate = new DropDownMenu(eventDriver, By.xpath(dropDownMenuScreenRefreshRateXpath));
        dropDownMenuScreenRefreshRate.show();
    }

    // Начать на частоту обновления экрана
    public void chBoxScreenRefreshRateClick(String hertz){
        chBoxScreenRefreshRateXpath = chBoxScreenRefreshRateXpath.replace("hertz", hertz);
        CheckBox checkBoxScreenRefreshRate = new CheckBox(eventDriver, By.xpath(chBoxScreenRefreshRateXpath));
        checkBoxScreenRefreshRate.setChecked(true);
    }

    // Нажать на выподающее меню Тип подсветки экрана
    public void dropDownMenuBacklightTypeClick(){
        DropDownMenu dropDownMenuBacklightType = new DropDownMenu(eventDriver, By.xpath(dropDownMenuBacklightTypeXpath));
        dropDownMenuBacklightType.show();
    }

    // Нажать на Тип подсветки экрана
    public void chBoxBacklightTypeClick(String backlight){
        backlightTypeXpath = backlightTypeXpath.replace("backlight", backlight);
        CheckBox checkBoxBacklightType = new CheckBox(eventDriver, By.xpath(backlightTypeXpath));
        checkBoxBacklightType.setChecked(true);
    }

    // Нажать на кнопку Применить
    public void buttonApplyClick(){
        Button buttonApply = new Button(eventDriver, By.xpath(buttonApplyXpath));
        buttonApply.click();
    }

    // Открыть первый элемент из списка в новым окне
    public void linkFirstElementClick(){
        WaitFor.firstProductMustBe(By.xpath(firstElementXpath));
        Link linkFirstElement = new Link(eventDriver, By.xpath(firstElementXpath));
        linkFirstElement.openInNuwWindow();
    }
}
