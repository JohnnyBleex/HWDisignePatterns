package tests.tvs;

import helpers.JSExec;
import helpers.ScreenShotPage;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import pages.TVAndMultimediaPage;
import pages.TVProductPage;
import tests.BaseTest;

public class TVsProductPage1_Test extends BaseTest {
    @Test
    public void selectedProduct_Is_TVLEDSamsungQE75Q950TSUXRUGrey() {
        StartPage startPage = new StartPage(driver);
        startPage.openPage();
        startPage.buttonChooseACityYesClick();
        startPage.linkTVAndMultimediaMove();
        startPage.linkTVSClick();
        ScreenShotPage.getScreenShot("screens\\1_ScreenTVAndMultimediaPage.png");

        TVAndMultimediaPage tvAndMultimediaPage = new TVAndMultimediaPage(driver);
        tvAndMultimediaPage.hideHeader();
        JSExec.scrollBy(0, 900);
        tvAndMultimediaPage.chBoxCompanyFilterClick("Samsung");
        JSExec.scrollBy(0, 600);
        tvAndMultimediaPage.dropDownMenuDiagonalClick();
        tvAndMultimediaPage.diagonalRangeFromSend("60");
        tvAndMultimediaPage.diagonalRangeUpToSend("80");
        tvAndMultimediaPage.dropDownMenuScreenRefreshRateClick();
        tvAndMultimediaPage.chBoxScreenRefreshRateClick("120");
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
    }
}
