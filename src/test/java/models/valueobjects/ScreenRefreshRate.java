package models.valueobjects;

import java.io.Serializable;

public class ScreenRefreshRate implements Serializable {
    private int screenRefreshRate;

    public ScreenRefreshRate(){

    }

    public ScreenRefreshRate(int screenRefreshRate){
        if (screenRefreshRate > 0) {
            this.screenRefreshRate = screenRefreshRate;
        }else {
            throw new IllegalArgumentException("Частота экрана не может быть меньше нуля!");
        }
    }

    public int getScreenRefreshRate() {
        return this.screenRefreshRate;
    }

    public boolean equals(ScreenRefreshRate otherScreenRefreshRate){
        return this.screenRefreshRate == otherScreenRefreshRate.screenRefreshRate;
    }
}
