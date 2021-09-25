package tests.tvs;

import helpers.ScreenShotPage;
import models.builder.TVBuilder;
import models.builder.Television;
import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;
import models.valueobjects.TypeBackLight;
import org.junit.jupiter.api.Test;
import pages.withelements.StartPageWithElements;
import pages.withelements.TVAndMultimediaPageWithElements;
import pages.withelements.TVProductPageWithElements;
import steps.StartPageSteps;
import steps.TVAndMultimediaPageSteps;
import steps.TVProductPageSteps;
import tests.BaseTest;

public class TVProductPageWithElements_Test extends BaseTest {
    @Test
    public void selectedProduct_Is_TVLEDSamsungQE75Q950TSUXRUGrey(){
        // 1. Arrange
        String company = "Samsung";
        int diagonalRangeFrom = 60;
        int diagonalRangeUpTo = 80;
        int screenRefreshRate = 120;
        String typeBackLight = "Direct LED";
        TVBuilder builder = new TVBuilder(
                new Company(company),
                new DiagonalRange(diagonalRangeFrom),
                new DiagonalRange(diagonalRangeUpTo),
                new ScreenRefreshRate(screenRefreshRate),
                new TypeBackLight(typeBackLight))
                .setModel("QE75Q950TSUXRU")
                .setDiagonal(75)
                .setRefreshRate(120)
                .setBackLight("Direct LED");
        Television television = builder.build();

        // 2. Act
        TVProductPageSteps tvProductPageSteps = getProduct(television);

        // 3. Assert
        String expectedTitle = "Технические характеристики 75\" (189 см) Телевизор LED Samsung QE75Q950TSUXRU серый | 8165296 . Интернет-магазин DNS";
        String expectedModel = "Samsung";
        String expectedInches = "75";
        String expectedHertz = "120";
        String expectedBackLight = "Direct LED";
        TVsProductPageAssert tVsProductPageAssert = new TVsProductPageAssert(tvProductPageSteps);
        tVsProductPageAssert.pageTitleEquals(expectedTitle);
        tVsProductPageAssert.pageModelEquals(expectedModel);
        tVsProductPageAssert.pageInchesEquals(expectedInches);
        tVsProductPageAssert.pageHertzEquals(expectedHertz);
        tVsProductPageAssert.pageBackLight(expectedBackLight);
    }

    // Получение страницы с продуктом
    public TVProductPageSteps getProduct(Television television){
        StartPageSteps startPageSteps = new StartPageSteps(new StartPageWithElements(driver));
        startPageSteps.clickCityYes();
        startPageSteps.clickTV();
        ScreenShotPage.getScreenShot("screens\\1_ScreenTVAndMultimediaPage.png");

        TVAndMultimediaPageSteps tvAndMultimediaPageSteps = new TVAndMultimediaPageSteps(new TVAndMultimediaPageWithElements(driver));
        tvAndMultimediaPageSteps.hideHeader();
        tvAndMultimediaPageSteps.filterByCompany(television.getCompany());
        tvAndMultimediaPageSteps.filterByDiagonal(television.getDiagonalRangeFrom(), television.getDiagonalRangeUpTo());
        tvAndMultimediaPageSteps.filterByScreenRefreshRate(television.getScreenRefreshRate());
        tvAndMultimediaPageSteps.filterByBacklightType(television.getTypeBackLight());
        tvAndMultimediaPageSteps.buttonApplyClick();
        tvAndMultimediaPageSteps.sortingPrice();
        ScreenShotPage.getScreenShot("screens\\2_ScreenTVAndMultimediaPageSortDearFirst.png");
        tvAndMultimediaPageSteps.firstProductClick();
        ScreenShotPage.getScreenShot("screens\\3_ScreenTVFirstProductPage.png");

        TVProductPageSteps tvProductPageSteps = new TVProductPageSteps(new TVProductPageWithElements(driver));
        tvProductPageSteps.getTitle();
        tvProductPageSteps.characteristicsClick();
        ScreenShotPage.getScreenShot("screens\\4_ScreenTVCharacteristicsProduct.png");

        return new TVProductPageSteps(new TVProductPageWithElements(driver));
    }
}
