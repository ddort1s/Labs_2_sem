package Labs10_3_2_4;

public interface Armor {
    Integer MIN_VALUE = 5;
    Integer MAX_VALUE = 50;

    boolean isBroken();
    Integer protect(Integer value);
    Integer getPosition();
}
