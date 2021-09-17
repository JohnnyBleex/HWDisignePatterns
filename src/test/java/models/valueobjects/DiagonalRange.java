package models.valueobjects;

import java.io.Serializable;

public class DiagonalRange implements Serializable {
    private int diagonalRange;

    public DiagonalRange() {

    }

    public DiagonalRange(int diagonalRange) {
        if (diagonalRange > 0) {
            this.diagonalRange = diagonalRange;
        }else {
            throw new IllegalArgumentException("Диоганаль не может быть меньше нуля!");
        }
    }

    public int getDiagonalRange(){
        return this.diagonalRange;
    }

    public boolean equals(DiagonalRange otherDiagonalRange){
        return this.diagonalRange == otherDiagonalRange.diagonalRange;
    }
}
