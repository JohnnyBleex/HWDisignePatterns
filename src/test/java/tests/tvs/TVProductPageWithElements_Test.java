package tests.tvs;

import helpers.JSExec;
import helpers.ScreenShotPage;
import org.junit.jupiter.api.Test;
import pages.TVProductPage;
import pages.withelements.StartPageWithElements;
import pages.withelements.TVAndMultimediaPageWithElements;
import tests.BaseTest;

public class TVProductPageWithElements_Test extends BaseTest {
    @Test
    public void selectedProduct_Is_TVLEDSamsungQE75Q950TSUXRUGrey(){
        String company = "Samsung";
        String diagonalRangeFrom = "60";
        String diagonalRangeUpTo = "80";
        String screenRefreshRate = "120";

        TVProductPage tvProductPage = getProduct(company, diagonalRangeFrom, diagonalRangeUpTo, screenRefreshRate);

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

    public TVProductPage getProduct(String company, String diagonalRangeFrom, String diagonalRangeUpTo, String screenRefreshRate){
        StartPageWithElements startPageWithElements = new StartPageWithElements(driver);
        startPageWithElements.openPage();
        startPageWithElements.buttonChooseACityYesClick();
        startPageWithElements.linkTVAndMultimediaMove();
        startPageWithElements.linkTVSClick();
        ScreenShotPage.getScreenShot("screens\\1_ScreenTVAndMultimediaPage.png");

        TVAndMultimediaPageWithElements tvAndMultimediaPageWithElements = new TVAndMultimediaPageWithElements(driver);
        tvAndMultimediaPageWithElements.hideHeader();
        JSExec.scrollBy(0, 900);
        tvAndMultimediaPageWithElements.chBoxCompanyFilterClick(company);
        JSExec.scrollBy(0, 600);
        tvAndMultimediaPageWithElements.dropDownMenuDiagonalClick();
        tvAndMultimediaPageWithElements.diagonalRangeFromSend(diagonalRangeFrom);
        tvAndMultimediaPageWithElements.diagonalRangeUpToSend(diagonalRangeUpTo);
        tvAndMultimediaPageWithElements.dropDownMenuScreenRefreshRateClick();
        tvAndMultimediaPageWithElements.chBoxScreenRefreshRateClick(screenRefreshRate);
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

        TVProductPage tvAndMultimediaProductPage = new TVProductPage(driver);
        tvAndMultimediaProductPage.getPageTitle();
        JSExec.scrollBy(0, 700);
        tvAndMultimediaProductPage.characteristicsClick();
        ScreenShotPage.getScreenShot("screens\\4_ScreenTVCharacteristicsProduct.png");

        return new TVProductPage(driver);
    }
}
