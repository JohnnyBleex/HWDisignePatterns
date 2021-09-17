package webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FirefoxBrowser {
    public static WebDriver getDriver(PageLoadStrategyName strategyName){
        PageLoadStrategy strategy = LoadingStrategy.loadStrategy(strategyName);

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        firefoxOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
        firefoxOptions.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, false);
        firefoxOptions.setPageLoadStrategy(strategy);
        firefoxOptions.setAcceptInsecureCerts(false);

        firefoxOptions.addArguments("-kiosk");
        firefoxOptions.addArguments("-private");

        return new FirefoxDriver(firefoxOptions);
    }
}
