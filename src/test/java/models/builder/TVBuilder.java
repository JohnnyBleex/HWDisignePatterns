package models.builder;

import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;

public class TVBuilder {
    private Company company;
    private String model = "QE75Q950TSUXRU";
    private DiagonalRange diagonalRangeFrom;
    private DiagonalRange diagonalRangeUpTo;
    private int diagonal = 75;
    private ScreenRefreshRate screenRefreshRate;
    private int refreshRate = 120;

    public TVBuilder(Company company, DiagonalRange diagonalRangeFrom, DiagonalRange diagonalRangeUpTo, ScreenRefreshRate screenRefreshRate) {
        this.company = company;
        this.diagonalRangeFrom = diagonalRangeFrom;
        this.diagonalRangeUpTo = diagonalRangeUpTo;
        this.screenRefreshRate = screenRefreshRate;
    }

    public TVBuilder setModel(String model){
        this.model = model;
        return this;
    }

    public TVBuilder setDiagonal(int diagonal){
        this.diagonal = diagonal;
        return this;
    }

    public TVBuilder setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
        return this;
    }

    public Television build(){
        Television television = new Television();
        television.setCompany(this.company);
        television.setModel(this.model);
        television.setDiagonalRangeFrom(this.diagonalRangeFrom);
        television.setDiagonalRangeUpTo(this.diagonalRangeUpTo);
        television.setDiagonal(this.diagonal);
        television.setScreenRefreshRate(this.screenRefreshRate);
        television.setRefreshRate(this.refreshRate);
        return television;
    }
}
