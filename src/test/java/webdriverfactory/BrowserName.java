package webdriverfactory;

public enum BrowserName {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String browserName;

    private BrowserName(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public String toString() {
        return String.valueOf(this.browserName);
    }

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

    public String getBrowserName() {
        return this.browserName;
    }
}
