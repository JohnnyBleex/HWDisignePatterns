package tests.tvs;

import org.junit.jupiter.api.Assertions;
import steps.TVProductPageSteps;

public class TVsProductPageAssert {
    private TVProductPageSteps tvProductPageSteps;

    public TVsProductPageAssert(TVProductPageSteps tvProductPageSteps){
        this.tvProductPageSteps = tvProductPageSteps;
    }

    public void pageTitleEquals(String expectedTitle){
        String actualTitle = tvProductPageSteps.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle, "Ошибка! Заголовок страницы не соответствует ожидаемому!");
    }

    public void pageModelEquals(String expectedModel){
        String actualModel = tvProductPageSteps.getModelValue();
        Assertions.assertTrue(actualModel.contains(expectedModel), "Ошибка! Модель не соответствует ожидаемому!");
    }

    public void pageInchesEquals(String expectedInches){
        String actualInches = tvProductPageSteps.getInchesValue();
        Assertions.assertTrue(actualInches.contains(expectedInches), "Ошибка! Диагональ не соответствует ожидаемому!");
    }

    public void pageHertzEquals(String expectedHertz){
        String actualHertz = tvProductPageSteps.getHertzValue();
        Assertions.assertTrue(actualHertz.contains(expectedHertz), "Ошибка! Герци не соответствуют ожидаемому!");
    }

    public void pageBackLight(String expectedBackLight){
        String actualBackLight = tvProductPageSteps.getBacklightType();
        Assertions.assertEquals(expectedBackLight, actualBackLight, "Ошибка! Подсветка экрана не соответствует ожидаемому!");
    }
}
