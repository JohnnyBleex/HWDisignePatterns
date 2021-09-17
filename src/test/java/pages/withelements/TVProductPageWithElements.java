package pages.withelements;

import elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TVProductPageWithElements extends BasePage {
    public TVProductPageWithElements(WebDriver driver) {
        super(driver);
    }

    String characteristicsLinkXpath = "//a[contains(text(), 'Характеристики')]";
    String modelValueXpath = "//span[text()=' Samsung QE75Q950TSUXRU ']";
    String inchesValueXpath = "//span[text()=' 75\" ']";
    String hertzValueXpath = "//span[text()=' 120 Гц ']";
    String backlightTypeXpath = "//a[contains(text(), 'Direct LED')]";

    public String getPageTitle(){
        return eventDriver.getTitle();
    }

    public String getModelValue(){
        WebElement modelValue = eventDriver.findElement(By.xpath(modelValueXpath));
        return modelValue.getText();
    }

    public String getInchesValue(){
        WebElement inchesValue = eventDriver.findElement(By.xpath(inchesValueXpath));
        return inchesValue.getText();
    }

    public String getHertzValue(){
        WebElement hertzValue = eventDriver.findElement(By.xpath(hertzValueXpath));
        return hertzValue.getText();
    }

    public String getBacklightType(){
        WebElement backlightType = eventDriver.findElement(By.xpath(backlightTypeXpath));
        return backlightType.getText();
    }

    public void characteristicsClick(){
        Link linkCharacteristics = new Link(driver, By.xpath(characteristicsLinkXpath));
        linkCharacteristics.click();
    }
}
