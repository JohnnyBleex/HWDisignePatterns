package webdriverfactory;

import org.openqa.selenium.PageLoadStrategy;

public class LoadingStrategy {
    public static PageLoadStrategy loadStrategy(PageLoadStrategyName strategyName){
        switch (strategyName){
            case NONE:
                return PageLoadStrategy.NONE;
            case EAGER:
                return PageLoadStrategy.EAGER;
            case NORMAL:
                return PageLoadStrategy.NORMAL;
            default:
                throw new RuntimeException("Некорректное наименование загрузки стратегии браузера!");
        }
    }
}
