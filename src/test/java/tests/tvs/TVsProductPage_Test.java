package tests.tvs;

import helpers.JSExec;
import helpers.ScreenShotPage;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import pages.TVAndMultimediaPage;
import pages.TVProductPage;
import tests.BaseTest;

public class TVsProductPage_Test extends BaseTest {
    @Test
    public void selectedProduct_Is_TVLEDSamsungQE75Q950TSUXRUGrey() {
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
    }

    public TVProductPage getProduct(String company, String diagonalRangeFrom, String diagonalRangeUpTo, String screenRefreshRate){
        StartPage startPage = new StartPage(driver);
        startPage.openPage();
        startPage.buttonChooseACityYesClick();
        startPage.linkTVAndMultimediaMove();
        startPage.linkTVSClick();
        ScreenShotPage.getScreenShot("screens\\1_ScreenTVAndMultimediaPage.png");

        TVAndMultimediaPage tvAndMultimediaPage = new TVAndMultimediaPage(driver);
        tvAndMultimediaPage.hideHeader();
        JSExec.scrollBy(0, 900);
        tvAndMultimediaPage.chBoxCompanyFilterClick(company);
        JSExec.scrollBy(0, 600);
        tvAndMultimediaPage.dropDownMenuDiagonalClick();
        tvAndMultimediaPage.diagonalRangeFromSend(diagonalRangeFrom);
        tvAndMultimediaPage.diagonalRangeUpToSend(diagonalRangeUpTo);
        tvAndMultimediaPage.dropDownMenuScreenRefreshRateClick();
        tvAndMultimediaPage.chBoxScreenRefreshRateClick(screenRefreshRate);
        JSExec.scrollBy(0, 650);
        tvAndMultimediaPage.dropDownMenuBacklightTypeClick();
        tvAndMultimediaPage.chBoxBacklightTypeClick();
        tvAndMultimediaPage.buttonApplyClick();
        JSExec.scrollBy(0, -2000);
        tvAndMultimediaPage.dropDownMenuSortingPriceClick();
        tvAndMultimediaPage.sortingPriceExpensiveClick();
        ScreenShotPage.getScreenShot("screens\\2_ScreenTVAndMultimediaPageSortDearFirst.png");
        tvAndMultimediaPage.firstElementClick();
        ScreenShotPage.getScreenShot("screens\\3_ScreenTVFirstProductPage.png");

        TVProductPage tvAndMultimediaProductPage = new TVProductPage(driver);
        tvAndMultimediaProductPage.getPageTitle();
        JSExec.scrollBy(0, 700);
        tvAndMultimediaProductPage.characteristicsClick();
        ScreenShotPage.getScreenShot("screens\\4_ScreenTVCharacteristicsProduct.png");

        return new TVProductPage(driver);
    }
}
