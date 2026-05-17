package Labs10_3_2_4;

public interface Armor {
    int MIN_VALUE = 5;
    int MAX_VALUE = 50;

    int protect(int damage);
    boolean isBroken();
    int getPosition();
}
