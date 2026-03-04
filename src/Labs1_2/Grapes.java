package Labs1_2;

public class Grapes {

    private String name;
    private int age;

    public Grapes(String name, int age) {

        if (name == null || name.trim().length() < 3) {
            throw new IllegalArgumentException("name");
        }

        if (age < 0) {
            throw new IllegalArgumentException("age");
        }

        this.name = name;
        this.age = age;
    }

    public void grow() {
        age++;
    }

    public int getProductivity() {
        if (age < 2) {
            return 0;
        } else if (age <= 35) {
            return 40;
        } else {
            return 30; // снижение на 25%
        }
    }

    @Override
    public String toString() {
        return name + " gives " + getProductivity() + "kg of Grapes per year";
    }
}