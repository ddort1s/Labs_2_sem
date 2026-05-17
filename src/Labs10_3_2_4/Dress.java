package Labs10_3_2_4;

public class Dress extends BaseArmor{
    private static final int DRESS_POSITION = 2;
    public Dress(int durability){
        super(durability);
    }

    public int getPosition(){
        return DRESS_POSITION;
    }
}
