package Labs10_3_2_4;

public abstract class BaseWeapon implements Weapon{
    protected double power;

    public BaseWeapon(double power){
        if (power < Weapon.MIN_VALUE || power > Weapon.MAX_VALUE) {
            throw new IllegalArgumentException(
                    String.format("Power must be between %.1f and %.1f", Weapon.MIN_VALUE, Weapon.MAX_VALUE)
            );
        }
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public abstract int getDistance();

    @Override
    public String toString() {
        return String.format(
                "%s, power: %.1f, distance: %d",
                this.getClass().getSimpleName(),
                power,
                getDistance()
        );
    }
}
