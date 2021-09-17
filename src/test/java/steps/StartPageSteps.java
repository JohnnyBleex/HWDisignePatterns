package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.withelements.StartPageWithElements;

public class StartPageSteps {
    private static Logger logger = LogManager.getLogger(StartPageSteps.class);

    private StartPageWithElements startPageWithElements;

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
