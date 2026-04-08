package Labs1_2;

public class GrapeTree {
    private String sort;
    private Integer age;

    public GrapeTree(String sort, int age) {
        this.sort = sort;
        this.age = age;
    }

    private Integer getProductivity() {
        int baseProductivity = 40;

        if (this.age < 3) {
            return 0;
        } else if (this.age > 35) {
            return baseProductivity * 3 / 4;
        } else {
            return baseProductivity;
        }
    }

    public void addOneYear() {
        this.age++;
    }

    public String getInfo() {
        return String.format("%s gives %d kg of Grapes per year", this.sort, getProductivity());
    }

}