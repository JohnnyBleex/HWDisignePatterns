package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.withelements.StartPageWithElements;

// Шаги на странице "Стартовая страница"
public class StartPageSteps {
    private static Logger logger = LogManager.getLogger(StartPageSteps.class);

    private StartPageWithElements startPageWithElements; // Ссылка на объект класса StartPageWithElements

    public StartPageSteps(StartPageWithElements startPage){
        this.startPageWithElements = startPage;
        logger.info("Открыта страница [Стартовая траница DNS]");
    }

    public void clickCityYes(){
        startPageWithElements.openPage();
        startPageWithElements.buttonChooseACityYesClick();
    }

    public void clickTV(){
        startPageWithElements.linkTVAndMultimediaMove();
        startPageWithElements.linkTVSClick();
    }
}
