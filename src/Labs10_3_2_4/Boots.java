package Labs10_3_2_4;

public class Boots extends BaseArmor{
    private static final int BOOTS_POSITION = 1;
    public Boots(int durability){
        super(durability);
    }
    public int getPosition(){
        return BOOTS_POSITION;
    }
}
