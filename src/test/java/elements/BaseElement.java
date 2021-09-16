package elements;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class BaseElement {
    protected WebDriver driver;
    protected WebElement webElement;
    protected List<WebElement> webElements;
    protected By by;

    public BaseElement(WebDriver driver, By by){
        this.driver = driver;
        this.by = by;

        WaitFor.initWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
        WaitFor.presenceOfElementLocated(by);
        WaitFor.visibilityOfElementLocated(by);
        webElement = driver.findElement(by);
        webElements = driver.findElements(by);
    }

    public WebElement getWebElement(){
        return webElement;
    }
}
