package models.valueobjects;

import java.io.Serializable;

// Класс объект-значение Тип подсветки
public class TypeBackLight implements Serializable {
    private String typeBackLight; // Тип подсветки

    public TypeBackLight() {

    }

    public TypeBackLight(String typeBackLight) {
        if (!typeBackLight.isBlank() || !typeBackLight.isEmpty()) {
            this.typeBackLight = typeBackLight;
        } else {
            throw new IllegalArgumentException("Наименование производитель не может быть пустым!");
        }
    }

    // Геттер
    public String getBackLight() {
        return this.typeBackLight;
    }

    // Переопределенный метод сравнения
    public boolean equals(TypeBackLight otherBackLight) {
        return this.typeBackLight.equals(otherBackLight.typeBackLight);
    }
}
