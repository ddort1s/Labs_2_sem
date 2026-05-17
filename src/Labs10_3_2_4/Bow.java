package Labs10_3_2_4;

public class Bow extends BaseWeapon{
    private static final int BOW_DISTANCE = 5;
    public Bow(double power){
        super(power);
    }
    public int getDistance(){
        return BOW_DISTANCE;
    }
}
