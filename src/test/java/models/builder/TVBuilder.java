package models.builder;

import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;
import models.valueobjects.TypeBackLight;

// Класс строитель объекта Телевизор
public class TVBuilder {
    private Company company;                     // Производитель
    private String model = "QE75Q950TSUXRU";     // Модель заданная по умолчанию
    private DiagonalRange diagonalRangeFrom;     // Диагональ от
    private DiagonalRange diagonalRangeUpTo;     // Диагональ до
    private int diagonal = 75;                   // Диагональ заданная по умолчанию
    private ScreenRefreshRate screenRefreshRate; // Частота обновления экрана
    private int refreshRate = 120;               // Частота обновления заданная по умолчанию
    private TypeBackLight typeBackLight;         // Тип подсветки
    private String backLight = "Direct LED";     // Подсветка заданная по умолчанию

    public TVBuilder(Company company, DiagonalRange diagonalRangeFrom, DiagonalRange diagonalRangeUpTo,
                     ScreenRefreshRate screenRefreshRate, TypeBackLight typeBackLight) {
        this.company = company;
        this.diagonalRangeFrom = diagonalRangeFrom;
        this.diagonalRangeUpTo = diagonalRangeUpTo;
        this.screenRefreshRate = screenRefreshRate;
        this.typeBackLight = typeBackLight;
    }

    // Установка значения поля "Производитель"
    public TVBuilder setModel(String model){
        this.model = model;
        return this;
    }

    // Установка значения поля "Диагональ"
    public TVBuilder setDiagonal(int diagonal){
        this.diagonal = diagonal;
        return this;
    }

    // Установка значения поля "Частота обновления"
    public TVBuilder setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
        return this;
    }

    // Установка значения поля "Подсветка"
    public TVBuilder setBackLight(String backLight){
        this.backLight = backLight;
        return this;
    }

    // Создания объекта "Телевизор"
    public Television build(){
        Television television = new Television();
        television.setCompany(this.company);
        television.setModel(this.model);
        television.setDiagonalRangeFrom(this.diagonalRangeFrom);
        television.setDiagonalRangeUpTo(this.diagonalRangeUpTo);
        television.setDiagonal(this.diagonal);
        television.setScreenRefreshRate(this.screenRefreshRate);
        television.setRefreshRate(this.refreshRate);
        television.setTypeBackLight(this.typeBackLight);
        television.setBackLight(this.backLight);
        return television;
    }
}
