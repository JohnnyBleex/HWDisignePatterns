package models.valueobjects;

import java.io.Serializable;

// Класс объект-значение Частота обновления
public class ScreenRefreshRate implements Serializable {
    private int screenRefreshRate; // Частота обновления

    public ScreenRefreshRate(){

    }

    public ScreenRefreshRate(int screenRefreshRate){
        if (screenRefreshRate > 0) {
            this.screenRefreshRate = screenRefreshRate;
        }else {
            throw new IllegalArgumentException("Частота экрана не может быть меньше нуля!");
        }
    }

    // Геттер
    public int getScreenRefreshRate() {
        return this.screenRefreshRate;
    }

    // Переопределенный метод сравнения
    public boolean equals(ScreenRefreshRate otherScreenRefreshRate){
        return this.screenRefreshRate == otherScreenRefreshRate.screenRefreshRate;
    }
}
