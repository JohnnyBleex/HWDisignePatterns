package models.valueobjects;

import java.io.Serializable;

public class TypeBackLight implements Serializable {
    private String typeBackLight;

    public TypeBackLight() {

    }

    public TypeBackLight(String typeBackLight) {
        if (!typeBackLight.isBlank() || !typeBackLight.isEmpty()) {
            this.typeBackLight = typeBackLight;
        } else {
            throw new IllegalArgumentException("Наименование производитель не может быть пустым!");
        }
    }

    public String getBackLight() {
        return this.typeBackLight;
    }

    public boolean equals(TypeBackLight otherBackLight) {
        return this.typeBackLight.equals(otherBackLight.typeBackLight);
    }
}
