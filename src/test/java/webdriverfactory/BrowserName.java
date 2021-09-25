package webdriverfactory;

// Имена браузеров
public enum BrowserName {
    // Имена браузеров
    CHROME("chrome"),    // Google Chrome
    FIREFOX("firefox");  // Mozilla Firefox

    private String browserName; // Имя браузера

    private BrowserName(String browserName) {
        this.browserName = browserName;
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        return String.valueOf(this.browserName);
    }

    // Возврат константы по строковому значению константы
    public static BrowserName fromString(String browserName) {
        if (browserName != null) {
            for (BrowserName name : BrowserName.values()) {
                if (browserName.equalsIgnoreCase(name.browserName)) {
                    return name;
                }
            }
        }
        return null;
    }

    // Получение имени браузера
    public String getBrowserName() {
        return this.browserName;
    }
}
