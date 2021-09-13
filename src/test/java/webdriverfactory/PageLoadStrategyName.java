package webdriverfactory;

public enum PageLoadStrategyName {
    NORMAL("normal"),
    EAGER("eager"),
    NONE("none");

    private String strategyName;

    private PageLoadStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    @Override
    public String toString() {
        return String.valueOf(this.strategyName);
    }

    public static PageLoadStrategyName fromString(String strategyName) {
        if (strategyName != null) {
            for (PageLoadStrategyName name : PageLoadStrategyName.values()) {
                if (strategyName.equalsIgnoreCase(name.strategyName)) {
                    return name;
                }
            }
        }
        return null;
    }

    public String getStrategyName() {
        return this.strategyName;
    }
}
