package pages;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVProductPage extends BasePage{
    public TVProductPage(WebDriver driver) {
        super(driver);
    }

    String characteristicsLinkXpath = "//a[contains(text(), 'Характеристики')]";
    String inchesValueXpath = "//span[text()=' 75\" ']";
    String hertzValueXpath = "//span[text()=' 120 Гц ']";
    String backlightTypeXpath = "//div[@id='pcv-ePYSch']";

    public String getPageTitle(){
        return eventDriver.getTitle();
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
        WaitFor.visibilityOfElementLocated(By.xpath(characteristicsLinkXpath));
        WebElement characteristicsLink = eventDriver.findElement(By.xpath(characteristicsLinkXpath));
        WaitFor.clickabilityOfElement(characteristicsLink);
        characteristicsLink.click();
    }


}
