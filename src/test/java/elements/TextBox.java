package elements;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox extends BaseElement{
    public TextBox(WebDriver driver, By by) {
        super(driver, by);
    }

    public void click(){
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }

    public void setValue(String value){
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.sendKeys(value);
    }
}
