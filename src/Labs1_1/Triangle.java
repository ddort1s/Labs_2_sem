package Labs1_1;

public class Triangle {

    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public Triangle(Integer sideA, Integer sideB, Integer sideC) {

        // берём модуль
        this.sideA = Math.abs(sideA);
        this.sideB = Math.abs(sideB);
        this.sideC = Math.abs(sideC);

        if (!isValid()) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
    }

    private boolean isValid() {
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }

    public Integer getPerimetr() {
        return sideA + sideB + sideC;
    }

    public Integer getArea() {
        double p = getPerimetr() / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return (int) Math.round(area);
    }
}

