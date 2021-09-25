package pages.withelements;

import elements.Link;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

// Стартовая страница сайта DNS
public class StartPageWithElements extends BasePage {
    private Logger logger = LogManager.getLogger(StartPageWithElements.class);

    public StartPageWithElements(WebDriver driver) {
        super(driver);
    }

    private final String URL = "https://www.dns-shop.ru/"; // URL страницы

    // ***** Локаторы *****
    String buttonChooseACityYesXpath = "//a[@class='btn btn-additional']";         // Кнопка Да
    String linkTVAndMultimediaXpath = "//a[contains(text(), 'ТВ и мультимедиа')]"; // Ссылка "ТВ и Мультимедиа"
    String linkTVSXpath = "//a[text()='Телевизоры']";                              // Ссылка Телевизоры

    // Получение URL страницы
    public String getURL(){
        return this.URL;
    }

    // Открытие страницы
    public void openPage() {
        eventDriver.get(this.URL);
        logger.info("Открыта страница " + URL);
    }

    // Нажатие на кнопку "Да"
    public void buttonChooseACityYesClick(){
        Link linkYeas = new Link(eventDriver, By.xpath(buttonChooseACityYesXpath));
        linkYeas.click();
    }

    // Наведение курсора мыши на ссылку "ТВ и Мультимедиа"
    public void linkTVAndMultimediaMove(){
        Link linkTVAndMultimedia = new Link(driver, By.xpath(linkTVAndMultimediaXpath));
        linkTVAndMultimedia.focusOnLink();
        logger.info("Курсор мыши наведен на ссылку \"ТВ и мультимедиа\"");
    }

    // Нажатие на ссылку "Телевизоры"
    public void linkTVSClick(){
        Link linkTVS = new Link(eventDriver, By.xpath(linkTVSXpath));
        linkTVS.click();
    }
}
