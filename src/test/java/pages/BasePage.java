package pages;

import helpers.JSExec;
import helpers.SeleniumListener;
import helpers.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriver eventDriver;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;

        SeleniumListener listener = new SeleniumListener();
        BasePage.eventDriver = new EventFiringDecorator(listener).decorate(driver);

        // Инициализация ожидания - 10 секунд
        WaitFor.initWait(driver ,Duration.ofSeconds(10), Duration.ofMillis(100));
        JSExec.initJS(driver);
    }
}
