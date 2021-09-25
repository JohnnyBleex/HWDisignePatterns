package pages.withelements;

import elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

// Страница продукта
public class TVProductPageWithElements extends BasePage {
    public TVProductPageWithElements(WebDriver driver) {
        super(driver);
    }

    // ***** Локаторы *****
    String characteristicsLinkXpath = "//a[contains(text(), 'Характеристики')]"; // Раздел "Характеристики"
    String modelValueXpath = "//span[text()=' Samsung QE75Q950TSUXRU ']";        // Значение Модели
    String inchesValueXpath = "//span[text()=' 75\" ']";                         // Значение Диагонали
    String hertzValueXpath = "//span[text()=' 120 Гц ']";                        // Значение Герци
    String backlightTypeXpath = "//a[contains(text(), 'Direct LED')]";           // Значение Подсветки

    // Нажать на раздел "Характеристики"
    public void characteristicsClick(){
        Link linkCharacteristics = new Link(eventDriver, By.xpath(characteristicsLinkXpath));
        linkCharacteristics.click();
    }

    // Получить Титульник страници
    public String getPageTitle(){
        return eventDriver.getTitle();
    }

    // Получить значение Модели
    public String getModelValue(){
        WebElement modelValue = eventDriver.findElement(By.xpath(modelValueXpath));
        return modelValue.getText();
    }

    // Получить значение Диагонали
    public String getInchesValue(){
        WebElement inchesValue = eventDriver.findElement(By.xpath(inchesValueXpath));
        return inchesValue.getText();
    }

    // Получить значение Герци
    public String getHertzValue(){
        WebElement hertzValue = eventDriver.findElement(By.xpath(hertzValueXpath));
        return hertzValue.getText();
    }

    // Получить значение Подсветка
    public String getBacklightType(){
        WebElement backlightType = eventDriver.findElement(By.xpath(backlightTypeXpath));
        return backlightType.getText();
    }
}
