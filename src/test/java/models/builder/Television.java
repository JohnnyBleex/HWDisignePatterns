package models.builder;

import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;
import models.valueobjects.TypeBackLight;

import java.io.Serializable;

// Класс Телевизор
public class Television implements Serializable {
    private Company company;                     // Производитель
    private String model;                        // Модель
    private DiagonalRange diagonalRangeFrom;     // Диагональ от
    private DiagonalRange diagonalRangeUpTo;     // Диагональ до
    private int diagonal;                        // Диагональ
    private ScreenRefreshRate screenRefreshRate; // Частота обновления экрана
    private int refreshRate;                     // Частота обновления
    private TypeBackLight typeBackLight;         // Тип подсветки
    private String backLight;                    // Подсветка

    public Television(){

    }

    public Television(Company company, DiagonalRange diagonalRangeFrom, DiagonalRange diagonalRangeUpTo,
                      ScreenRefreshRate screenRefreshRate, TypeBackLight typeBackLight) {
        this.company = company;
        this.diagonalRangeFrom = diagonalRangeFrom;
        this.diagonalRangeUpTo = diagonalRangeUpTo;
        this.screenRefreshRate = screenRefreshRate;
        this.typeBackLight = typeBackLight;
    }

    // Сеттеры и геттеры
    // Производитель
    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

    // Модель
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    // Диагональ от
    public void setDiagonalRangeFrom(DiagonalRange diagonalRangeFrom) {
        this.diagonalRangeFrom = diagonalRangeFrom;
    }

    public DiagonalRange getDiagonalRangeFrom() {
        return this.diagonalRangeFrom;
    }

    // Диагональ до
    public void setDiagonalRangeUpTo(DiagonalRange diagonalRangeUpTo) {
        this.diagonalRangeUpTo = diagonalRangeUpTo;
    }

    public DiagonalRange getDiagonalRangeUpTo() {
        return this.diagonalRangeUpTo;
    }

    // Диагональ
    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return this.diagonal;
    }

    // Частота обновления экрана
    public void setScreenRefreshRate(ScreenRefreshRate screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public ScreenRefreshRate getScreenRefreshRate() {
        return this.screenRefreshRate;
    }

    // Частота обновления
    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getRefreshRate() {
        return this.refreshRate;
    }

    // Тип подсветки
    public TypeBackLight getTypeBackLight() {
        return typeBackLight;
    }

    public void setTypeBackLight(TypeBackLight typeBackLight) {
        this.typeBackLight = typeBackLight;
    }

    // Подсветка
    public String getBackLight() {
        return backLight;
    }

    public void setBackLight(String backLight) {
        this.backLight = backLight;
    }
}
