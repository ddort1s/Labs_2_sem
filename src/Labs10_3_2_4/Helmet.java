package Labs10_3_2_4;

public class Helmet extends BaseArmor{
    private static final int HELMET_POSITION = 3;
    public Helmet(int durability){
        super(durability);
    }
    public int getPosition(){
        return HELMET_POSITION;
    }
}
