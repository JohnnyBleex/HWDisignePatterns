package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import webdriverfactory.BrowserName;
import webdriverfactory.PageLoadStrategyName;
import webdriverfactory.WebDriverFactory;

public class BaseTest {
    protected static WebDriver driver;

    private Logger logger = LogManager.getLogger(BaseTest.class);

    String browser = System.getProperty("browser", "chrome").toLowerCase();
    String option = System.getProperty("option", "normal").toLowerCase();

    @BeforeEach
    public void setUp(){
        logger.info("Браузер = " + browser);
        logger.info("Стратегия загрузки страници - " + option);

        driver = WebDriverFactory.getDriver(BrowserName.fromString(browser), PageLoadStrategyName.fromString(option));
        logger.info("Драйвер запущен!");
    }

    @AfterEach
    public void setDown() {
        if(driver != null) {
            driver.quit();
            logger.info("Драйвер остановлен!");
        }
    }
}
