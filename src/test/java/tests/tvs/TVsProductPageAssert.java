package tests.tvs;

import org.junit.jupiter.api.Assertions;
import pages.withelements.TVProductPageWithElements;;

public class TVsProductPageAssert {
    private TVProductPageWithElements page;

    public TVsProductPageAssert(TVProductPageWithElements page){
        this.page = page;
    }

    public void pageTitleEquals(String expectedTitle){
        String actualTitle = page.getPageTitle();
        Assertions.assertEquals(expectedTitle, actualTitle, "Ошибка! Заголовок страницы не соответствует ожидаемому!");
    }

    public void pageModelEquals(String expectedModel){
        String actualModel = page.getModelValue();
        Assertions.assertEquals(expectedModel, actualModel, "Ошибка! Модель не соответствует ожидаемому!");
    }

    public void pageInchesEquals(String expectedInches){
        String actualInches = page.getInchesValue();
        Assertions.assertEquals(expectedInches, actualInches, "Ошибка! Диагональ не соответствует ожидаемому!");
    }

    public void pageHertzEquals(String expectedHertz){
        String actualHertz = page.getHertzValue();
        Assertions.assertEquals(expectedHertz, actualHertz, "Ошибка! Герци не соответствуют ожидаемому!");
    }

    public void pageBackLight(String expectedBackLight){
        String actualBackLight = page.getBacklightType();
        Assertions.assertEquals(expectedBackLight, actualBackLight, "Ошибка! Подсветка экрана не соответствует ожидаемому!");
    }
}
