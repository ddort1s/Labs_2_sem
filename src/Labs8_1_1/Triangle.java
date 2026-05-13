package Labs8_1_1;

import java.util.Arrays;

public class Triangle{
    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public Triangle(Integer sideC, Integer sideB, Integer sideA) {
        this.sideC = Math.abs(sideC);
        this.sideB = Math.abs(sideB);
        this.sideA = Math.abs(sideA);
    }

    public Integer getPerimeter(){
        return sideA+sideB+sideC;
    }

    public Integer getArea() {
        double p = getPerimeter() / 2.0;
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

