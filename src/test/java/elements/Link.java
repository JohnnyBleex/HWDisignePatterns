package elements;

import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class Link extends BaseElement{
    public Link(WebDriver driver, By by) {
        super(driver, by);
    }

    public void click() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }

    public void focusOnLink(){
        WaitFor.visibilityOfElementLocated(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
    }

    public void openInNuwWindow(){
        String url = this.getUrl(0);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public String getUrl(){
        return webElement.getAttribute("href");
    }

    public String getUrl(int id){
        return webElements.get(id).getAttribute("href");
    }

    public String getText(){
        WaitFor.visibilityOfElementLocated(by);
        return webElement.getText();
    }
}
