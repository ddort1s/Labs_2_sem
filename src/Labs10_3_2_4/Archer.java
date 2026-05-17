package Labs10_3_2_4;

public class Archer extends Hero {

    private static final int MAX_ARROWS = 100;
    private static final int ARROW_POWER = 1;

    private int arrowsCount;
    private int arrowPower;

    public Archer(String username, int health, int arrowsCount, int arrowPower) {
        super(username, health);
        this.arrowsCount = Math.min(arrowsCount, MAX_ARROWS);
        this.arrowPower = arrowPower;
    }

    @Override
    public boolean fight(Player enemy, int distance) {
        if (enemy == null || arrowsCount <= 0) {
            return false;
        }

        int attackDistance = 1;
        double attackPower = arrowPower;

        // Если есть лук, используем его дальность и мощность
        if (weapon != null && weapon instanceof Bow) {
            attackDistance = weapon.getDistance();
            attackPower = weapon.getPower() * arrowPower;
        }

        // Проверяем дальность атаки
        if (distance > attackDistance) {
            return false;
        }

        // Наносим урон и тратим стрелу
        arrowsCount--;
        int damage = (int) attackPower;
        int actualDamage = enemy.damage(damage);
        return true;
    }

    @Override
    protected boolean canUseWeapon(Weapon weapon) {
        return weapon instanceof Bow;
    }

    @Override
    protected boolean canUseItem(Item item) {
        return item instanceof Arrows || item instanceof HealthPotion;
    }

    @Override
    public boolean putInto(Item item, int position) {
        if (position < 1 || position > Inventory.ITEMS_COUNT) {
            return false;
        }
        if (item != null) {
            if (item instanceof Arrows) {
                Arrows arrows = (Arrows) item;
                if (!arrows.isUsed()) {
                    arrowsCount += arrows.use();
                    return true;
                }
            } else if (item instanceof HealthPotion) {
                items[position - 1] = item;
                return true;
            }
        }
        return false;
    }

    public int getArrowsCount() {
        return arrowsCount;
    }
}
