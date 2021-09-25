package steps;

import helpers.JSExec;
import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;
import models.valueobjects.TypeBackLight;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.withelements.TVAndMultimediaPageWithElements;

// Шаги на странице "ТВ и Мультимедиа"
public class TVAndMultimediaPageSteps {
    private static Logger logger = LogManager.getLogger(StartPageSteps.class);

    private TVAndMultimediaPageWithElements tvAndMultimediaPageWithElements; // Ссылка на объект класса "TVAndMultimediaPageWithElements"

    public TVAndMultimediaPageSteps(TVAndMultimediaPageWithElements tvAndMultimediaPage){
        this.tvAndMultimediaPageWithElements = tvAndMultimediaPage;
        logger.info("Открыта страница [Телевизоры]");
    }

    public void hideHeader(){
        tvAndMultimediaPageWithElements.hideHeader();
    }

    public void filterByCompany(Company company){
        JSExec.scrollBy(0, 900);
        tvAndMultimediaPageWithElements.chBoxCompanyFilterClick(company.getCompany());
    }

    public void filterByDiagonal(DiagonalRange diagonalRangeFrom, DiagonalRange diagonalRangeUpTo){
        JSExec.scrollBy(0, 600);
        tvAndMultimediaPageWithElements.dropDownMenuDiagonalClick();
        tvAndMultimediaPageWithElements.diagonalRangeFromSend(diagonalRangeFrom.getDiagonalRange()+"");
        tvAndMultimediaPageWithElements.diagonalRangeUpToSend(diagonalRangeUpTo.getDiagonalRange()+"");
    }

    public void filterByScreenRefreshRate(ScreenRefreshRate refreshRate){
        tvAndMultimediaPageWithElements.dropDownMenuScreenRefreshRateClick();
        tvAndMultimediaPageWithElements.chBoxScreenRefreshRateClick(refreshRate.getScreenRefreshRate()+"");
    }

    public void filterByBacklightType(TypeBackLight typeBackLight){
        JSExec.scrollBy(0, 650);
        tvAndMultimediaPageWithElements.dropDownMenuBacklightTypeClick();
        tvAndMultimediaPageWithElements.chBoxBacklightTypeClick(typeBackLight.getBackLight());
    }

    public void buttonApplyClick(){
        tvAndMultimediaPageWithElements.buttonApplyClick();
    }

    public void sortingPrice(){
        JSExec.scrollBy(0, -1000);
        tvAndMultimediaPageWithElements.dropDownMenuSortingPriceShow();
        tvAndMultimediaPageWithElements.sortingPriceExpensiveClick();
    }

    public void firstProductClick(){
        tvAndMultimediaPageWithElements.linkFirstElementClick();
    }
}
