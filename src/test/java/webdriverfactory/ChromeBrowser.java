package webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeBrowser {
    public static WebDriver getDriver(PageLoadStrategyName strategyName){
        PageLoadStrategy strategy = null;

        switch (strategyName){
            case NONE:
                strategy = PageLoadStrategy.NONE;
                break;
            case EAGER:
                strategy = PageLoadStrategy.EAGER;
                break;
            case NORMAL:
                strategy = PageLoadStrategy.NORMAL;
                break;
            default:
                throw new RuntimeException("Некорректное наименование загрузки стратегии браузера!");
        }

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
        chromeOptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, false);
        chromeOptions.setPageLoadStrategy(strategy);
        chromeOptions.setAcceptInsecureCerts(false);

        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        return new ChromeDriver(chromeOptions);
    }
}