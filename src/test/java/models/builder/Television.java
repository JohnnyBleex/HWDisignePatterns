package models.builder;

import models.valueobjects.Company;
import models.valueobjects.DiagonalRange;
import models.valueobjects.ScreenRefreshRate;

import java.io.Serializable;

public class Television implements Serializable {
    private Company company;
    private String model;
    private DiagonalRange diagonalRangeFrom;
    private DiagonalRange diagonalRangeUpTo;
    private int diagonal;
    private ScreenRefreshRate screenRefreshRate;
    private int refreshRate;

    public Television(){

    }

    public Television(Company company, DiagonalRange diagonalRangeFrom, DiagonalRange diagonalRangeUpTo, ScreenRefreshRate screenRefreshRate) {
        this.company = company;
        this.diagonalRangeFrom = diagonalRangeFrom;
        this.diagonalRangeUpTo = diagonalRangeUpTo;
        this.screenRefreshRate = screenRefreshRate;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setDiagonalRangeFrom(DiagonalRange diagonalRangeFrom) {
        this.diagonalRangeFrom = diagonalRangeFrom;
    }

    public DiagonalRange getDiagonalRangeFrom() {
        return this.diagonalRangeFrom;
    }

    public void setDiagonalRangeUpTo(DiagonalRange diagonalRangeUpTo) {
        this.diagonalRangeUpTo = diagonalRangeUpTo;
    }

    public DiagonalRange getDiagonalRangeUpTo() {
        return this.diagonalRangeUpTo;
    }

    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return this.diagonal;
    }

    public void setScreenRefreshRate(ScreenRefreshRate screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public ScreenRefreshRate getScreenRefreshRate() {
        return this.screenRefreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getRefreshRate() {
        return this.refreshRate;
    }
}
