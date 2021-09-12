package helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ToTakeAScreenShot {
    private static final Logger logger = LogManager.getLogger(ToTakeAScreenShot.class);

    public static void getScreenShot(WebDriver driver, String path) {
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(5));
            Screenshot screenshot = new AShot().takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "png", new File(path));
            logger.info("Скриншот сохранен в " + path);
        } catch (IOException exception) {
            exception.printStackTrace();
            logger.info("Не верно указан путь!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
