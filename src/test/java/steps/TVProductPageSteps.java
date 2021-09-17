package steps;

import helpers.JSExec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.withelements.TVProductPageWithElements;

public class TVProductPageSteps {
    private static Logger logger = LogManager.getLogger(StartPageSteps.class);

    private TVProductPageWithElements tvProductPageWithElements;
    private String actualTitle;

    public TVProductPageSteps(TVProductPageWithElements tvProductPage){
        this.tvProductPageWithElements = tvProductPage;
        logger.info("Открыта страница [Продукт. Телевизор]");
    }

    public void characteristicsClick(){
        JSExec.scrollBy(0, 700);
        tvProductPageWithElements.characteristicsClick();
    }

    public String getTitle(){
        return tvProductPageWithElements.getPageTitle();
    }

    public String getModelValue(){
        return tvProductPageWithElements.getModelValue();
    }

    public String getInchesValue(){
        return tvProductPageWithElements.getInchesValue();
    }

    public String getHertzValue(){
        return tvProductPageWithElements.getHertzValue();
    }

    public String getBacklightType(){
        return tvProductPageWithElements.getBacklightType();
    }
}
