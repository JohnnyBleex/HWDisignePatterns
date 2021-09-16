package pages;

import helpers.JSExec;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.List;

public class TVAndMultimediaPage extends BasePage {
    public TVAndMultimediaPage(WebDriver driver) {
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
        WebElement headerBlock = eventDriver.findElement(By.xpath(headerBlockXpath));
        JSExec.displayNone(headerBlock);
    }

    public void chBoxCompanyFilterClick(String company){
        chBoxCompanyFilterXpath = chBoxCompanyFilterXpath.replace("company", company);
        WaitFor.visibilityOfElementLocated(By.xpath(chBoxCompanyFilterXpath));
        WebElement chBoxCompanyFilter = eventDriver.findElement(By.xpath(chBoxCompanyFilterXpath));
        WaitFor.clickabilityOfElement(chBoxCompanyFilter);
        chBoxCompanyFilter.click();
    }

    public void dropDownMenuDiagonalClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(dropDownMenuDiagonalXpath));
        WebElement dropDownMenuDiagonal = eventDriver.findElement(By.xpath(dropDownMenuDiagonalXpath));
        WaitFor.clickabilityOfElement(dropDownMenuDiagonal);
        dropDownMenuDiagonal.click();
    }

    public void diagonalRangeFromSend(String rangeFrom){
        WaitFor.visibilityOfElementLocated(By.xpath(diagonalRangeFromXpath));
        WebElement diagonalRangeFrom = eventDriver.findElement(By.xpath(diagonalRangeFromXpath));
        WaitFor.clickabilityOfElement(diagonalRangeFrom);
        diagonalRangeFrom.sendKeys(rangeFrom);
    }

    public void diagonalRangeUpToSend(String rangeUpTo){
        WaitFor.visibilityOfElementLocated(By.xpath(diagonalRangeUpToXpath));
        WebElement diagonalRangeUpTo = eventDriver.findElement(By.xpath(diagonalRangeUpToXpath));
        WaitFor.clickabilityOfElement(diagonalRangeUpTo);
        diagonalRangeUpTo.sendKeys(rangeUpTo);
    }

    public void dropDownMenuScreenRefreshRateClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(dropDownMenuScreenRefreshRateXpath));
        WebElement dropDownMenuScreenRefreshRate = eventDriver.findElement(By.xpath(dropDownMenuScreenRefreshRateXpath));
        WaitFor.clickabilityOfElement(dropDownMenuScreenRefreshRate);
        dropDownMenuScreenRefreshRate.click();
    }

    public void chBoxScreenRefreshRateClick(String hertz){
        chBoxScreenRefreshRateXpath = chBoxScreenRefreshRateXpath.replace("hertz", hertz);
        WaitFor.visibilityOfElementLocated(By.xpath(chBoxScreenRefreshRateXpath));
        WebElement chBoxScreenRefreshRate = eventDriver.findElement(By.xpath(chBoxScreenRefreshRateXpath));
        WaitFor.clickabilityOfElement(chBoxScreenRefreshRate);
        chBoxScreenRefreshRate.click();
    }

    public void dropDownMenuBacklightTypeClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(dropDownMenuBacklightTypeXpath));
        WebElement dropDownMenuBacklightType = eventDriver.findElement(By.xpath(dropDownMenuBacklightTypeXpath));
        WaitFor.clickabilityOfElement(dropDownMenuBacklightType);
        dropDownMenuBacklightType.click();
    }

    public void chBoxBacklightTypeClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(backlightTypeXpath));
        WebElement BacklightType = eventDriver.findElement(By.xpath(backlightTypeXpath));
        WaitFor.clickabilityOfElement(BacklightType);
        BacklightType.click();
    }

    public void buttonApplyClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(buttonApplyXpath));
        WebElement buttonApply = eventDriver.findElement(By.xpath(buttonApplyXpath));
        WaitFor.clickabilityOfElement(buttonApply);
        buttonApply.click();
    }

    public void dropDownMenuSortingPriceClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(dropDownMenuSortingPriceXpath));
        WebElement dropDownMenuSortingPrice = eventDriver.findElement(By.xpath(dropDownMenuSortingPriceXpath));
        WaitFor.clickabilityOfElement(dropDownMenuSortingPrice);
        dropDownMenuSortingPrice.click();
    }

    public void sortingPriceExpensiveClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(sortingPriceExpensiveXpath));
        WebElement SortingPriceExpensive = eventDriver.findElement(By.xpath(sortingPriceExpensiveXpath));
        WaitFor.clickabilityOfElement(SortingPriceExpensive);
        SortingPriceExpensive.click();
    }

    public void firstElementClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(firstElementXpath));
        List<WebElement> firstElements = eventDriver.findElements(By.xpath(firstElementXpath));
        String url = firstElements.get(0).getAttribute("href");
        eventDriver.switchTo().newWindow(WindowType.WINDOW);
        eventDriver.manage().window().maximize();
        eventDriver.navigate().to(url);
    }
}
