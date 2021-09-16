package pages.withelements;

import elements.Link;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.StartPage;

public class StartPageWithElements extends BasePage {
    private Logger logger = LogManager.getLogger(StartPage.class);

    public StartPageWithElements(WebDriver driver) {
        super(driver);
    }

    private final String URL = "https://www.dns-shop.ru/";

    String buttonChooseACityYesXpath = "//a[@class='btn btn-additional']";
    String linkTVAndMultimediaXpath = "//a[contains(text(), 'ТВ и мультимедиа')]";
    String linkTVSXpath = "//a[text()='Телевизоры']";

    public String getURL(){
        return this.URL;
    }

    public void openPage() {
        eventDriver.get(this.URL);
        logger.info("Открыта страница " + URL);
    }

    public void buttonChooseACityYesClick(){
        Link linkYeas = new Link(eventDriver, By.xpath(buttonChooseACityYesXpath));
        linkYeas.click();
    }

    public void linkTVAndMultimediaMove(){
        Link linkTVAndMultimedia = new Link(driver, By.xpath(linkTVAndMultimediaXpath));
        linkTVAndMultimedia.focusOnLink();
        logger.info("Курсор мыши наведен на ссылку \"ТВ и мультимедиа\"");
    }

    public void linkTVSClick(){
        Link linkTVS = new Link(eventDriver, By.xpath(linkTVSXpath));
        linkTVS.click();
    }
}
