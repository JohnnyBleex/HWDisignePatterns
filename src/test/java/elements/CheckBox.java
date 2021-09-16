package elements;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends BaseElement{
    public CheckBox(WebDriver driver, By by) {
        super(driver, by);
    }

    public void setChecked(boolean value){
        if (value != isChecked()){
            WaitFor.clickabilityOfElement(webElement);
            webElement.click();
        }
    }

    public boolean isChecked(){
        WaitFor.visibilityOfElementLocated(by);
        return webElement.isSelected();
    }
}
