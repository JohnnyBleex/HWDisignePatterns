package elements;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownMenu extends BaseElement{
    public DropDownMenu(WebDriver driver, By by) {
        super(driver, by);
    }

    public void show(){
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }
}
