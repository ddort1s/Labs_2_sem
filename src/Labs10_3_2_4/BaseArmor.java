package Labs10_3_2_4;

public abstract class BaseArmor implements Armor{
    protected int durability;

    public BaseArmor(int durability) {
        if (durability < Armor.MIN_VALUE || durability > Armor.MAX_VALUE) {
            throw new IllegalArgumentException(
                    String.format("Durability must be between %d and %d", Armor.MIN_VALUE, Armor.MAX_VALUE)
            );
        }
        this.durability = durability;
    }

    public abstract int getPosition();

    @Override
    public boolean isBroken(){
        return durability <= 0;
    }

    @Override
    public int protect(int damage){
        if (isBroken()){
            return damage;
        }
        if (durability >= damage){
            durability -= damage;
            return 0;
        } else {
            int remainingDamage = damage - durability;
            durability = 0;
            return remainingDamage;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%d: %s, durability: %d, isBroken: %b",
                getPosition(),
                this.getClass().getSimpleName(),
                durability,
                isBroken()
        );
    }
}
