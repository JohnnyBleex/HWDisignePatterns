package pages;

import helpers.WaitFor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StartPage extends BasePage {
    private Logger logger = LogManager.getLogger(StartPage.class);

    public StartPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "https://www.dns-shop.ru/";

    String buttonChooseACityYesXpath = "//a[@class='btn btn-additional']";
    String linkTVAndMultimediaXpath = "//a[contains(text(), 'ТВ и мультимедиа')]";
    String linkTVSXpath = "//a[text()='Телевизоры']";

    public String getURL() {
        return this.URL;
    }

    public void openPage() {
        eventDriver.get(this.URL);
        logger.info("Открыта страница " + URL);
    }

    public void buttonChooseACityYesClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(buttonChooseACityYesXpath));
        WebElement buttonChooseACityYes = eventDriver.findElement(By.xpath(buttonChooseACityYesXpath));
        WaitFor.clickabilityOfElement(buttonChooseACityYes);
        buttonChooseACityYes.click();
    }

    public void linkTVAndMultimediaMove(){
        WaitFor.visibilityOfElementLocated(By.xpath(linkTVAndMultimediaXpath));
        WebElement linkTVAndMultimedia = driver.findElement(By.xpath(linkTVAndMultimediaXpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(linkTVAndMultimedia).perform();
        logger.info("Курсор мыши наведен на ссылку \"ТВ и мультимедиа\"");
    }

    public void linkTVSClick(){
        WaitFor.visibilityOfElementLocated(By.xpath(linkTVSXpath));
        WebElement linkTVS = eventDriver.findElement(By.xpath(linkTVSXpath));
        WaitFor.clickabilityOfElement(linkTVS);
        linkTVS.click();
    }
}
