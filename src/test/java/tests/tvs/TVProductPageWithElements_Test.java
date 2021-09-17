package tests.tvs;

import helpers.JSExec;
import helpers.ScreenShotPage;
import models.builder.TVBuilder;
import models.builder.Television;
import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;
import org.junit.jupiter.api.Test;
import pages.withelements.StartPageWithElements;
import pages.withelements.TVAndMultimediaPageWithElements;
import pages.withelements.TVProductPageWithElements;
import tests.BaseTest;

public class TVProductPageWithElements_Test extends BaseTest {
    @Test
    public void selectedProduct_Is_TVLEDSamsungQE75Q950TSUXRUGrey(){
        String company = "Samsung";
        int diagonalRangeFrom = 60;
        int diagonalRangeUpTo = 80;
        int screenRefreshRate = 120;
        TVBuilder builder = new TVBuilder(
                new Company(company),
                new DiagonalRange(diagonalRangeFrom),
                new DiagonalRange(diagonalRangeUpTo),
                new ScreenRefreshRate(screenRefreshRate))
                .setModel("QE75Q950TSUXRU").setDiagonal(75).setRefreshRate(120);
        Television television = builder.build();

        TVProductPageWithElements tvProductPage = getProduct(television);

        String expectedTitle = "Технические характеристики 75\" (189 см) Телевизор LED Samsung QE75Q950TSUXRU серый | 8165296 . Интернет-магазин DNS";
        String expectedModel = "Samsung QE75Q950TSUXRU";
        String expectedInches = "75\"";
        String expectedHertz = "120 Гц";
        String expectedBackLight = "Direct LED";
        TVsProductPageAssert tVsProductPageAssert = new TVsProductPageAssert(tvProductPage);
        tVsProductPageAssert.pageTitleEquals(expectedTitle);
        tVsProductPageAssert.pageModelEquals(expectedModel);
        tVsProductPageAssert.pageInchesEquals(expectedInches);
        tVsProductPageAssert.pageHertzEquals(expectedHertz);
        tVsProductPageAssert.pageBackLight(expectedBackLight);
    }

    public TVProductPageWithElements getProduct(Television television){
        StartPageWithElements startPageWithElements = new StartPageWithElements(driver);
        startPageWithElements.openPage();
        startPageWithElements.buttonChooseACityYesClick();
        startPageWithElements.linkTVAndMultimediaMove();
        startPageWithElements.linkTVSClick();
        ScreenShotPage.getScreenShot("screens\\1_ScreenTVAndMultimediaPage.png");

        TVAndMultimediaPageWithElements tvAndMultimediaPageWithElements = new TVAndMultimediaPageWithElements(driver);
        tvAndMultimediaPageWithElements.hideHeader();
        JSExec.scrollBy(0, 900);
        tvAndMultimediaPageWithElements.chBoxCompanyFilterClick(television.getCompany().getCompany());
        JSExec.scrollBy(0, 600);
        tvAndMultimediaPageWithElements.dropDownMenuDiagonalClick();
        tvAndMultimediaPageWithElements.diagonalRangeFromSend(television.getDiagonalRangeFrom().getDiagonalRange()+"");
        tvAndMultimediaPageWithElements.diagonalRangeUpToSend(television.getDiagonalRangeUpTo().getDiagonalRange()+"");
        tvAndMultimediaPageWithElements.dropDownMenuScreenRefreshRateClick();
        tvAndMultimediaPageWithElements.chBoxScreenRefreshRateClick(television.getScreenRefreshRate().getScreenRefreshRate()+"");
        JSExec.scrollBy(0, 650);
        tvAndMultimediaPageWithElements.dropDownMenuBacklightTypeClick();
        tvAndMultimediaPageWithElements.chBoxBacklightTypeClick();
        tvAndMultimediaPageWithElements.buttonApplyClick();
        JSExec.scrollBy(0, -1000);
        tvAndMultimediaPageWithElements.dropDownMenuSortingPriceShow();
        tvAndMultimediaPageWithElements.sortingPriceExpensiveClick();
        ScreenShotPage.getScreenShot("screens\\2_ScreenTVAndMultimediaPageSortDearFirst.png");
        tvAndMultimediaPageWithElements.linkFirstElementClick();
        ScreenShotPage.getScreenShot("screens\\3_ScreenTVFirstProductPage.png");

        TVProductPageWithElements tvAndMultimediaProductPage = new TVProductPageWithElements(driver);
        tvAndMultimediaProductPage.getPageTitle();
        JSExec.scrollBy(0, 700);
        tvAndMultimediaProductPage.characteristicsClick();
        ScreenShotPage.getScreenShot("screens\\4_ScreenTVCharacteristicsProduct.png");

        return new TVProductPageWithElements(driver);
    }
}
