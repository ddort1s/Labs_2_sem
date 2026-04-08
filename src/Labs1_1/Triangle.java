package Labs1_1;

import java.util.Arrays;

public class Triangle{
    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public Triangle(Integer sideC, Integer sideB, Integer sideA) {
        this.sideC = sideC;
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public Integer getPerimetr(){
        return sideA+sideB+sideC;
    }

    public Integer getArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return (int) Math.round(result);
    }

    public Boolean isEquals(Triangle other){
        if (other==null) return false;
        int[] thisSides = {this.sideA, this.sideB, this.sideC};
        int[] otherSides = {other.sideA, other.sideB, other.sideC};

        Arrays.sort(thisSides);
        Arrays.sort(otherSides);

        return Arrays.equals(thisSides, otherSides);
    }

}

