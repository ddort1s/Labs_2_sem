package Labs10_3_2_4;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {

    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;

    public Hero(String username, int health) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        this.username = username;
        this.health = Math.min(health, Healthy.MAX_HEALTH);
        this.clothes = new Armor[Equipment.CLOTHES_COUNT];
        this.items = new Item[Inventory.ITEMS_COUNT];
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public int damage(int enemyDamage) {
        int actualDamage = enemyDamage;

        // Проверяем защиту от брони
        for (Armor armor : clothes) {
            if (armor != null) {
                actualDamage = armor.protect(actualDamage);
            }
        }

        loseHealth(actualDamage);
        return actualDamage;
    }

    protected void loseHealth(int damage) {
        health = Math.max(0, health - damage);
    }

    @Override
    public boolean isDied() {
        return health <= 0;
    }

    @Override
    public void recoverHealth(int healthAmount) {
        health = Math.min(health + healthAmount, Healthy.MAX_HEALTH);
    }

    @Override
    public void dress(Armor armor) {
        if (armor != null) {
            int position = armor.getPosition() - 1;
            if (position >= 0 && position < clothes.length) {
                clothes[position] = armor;
            }
        }
    }

    @Override
    public boolean change(Weapon newWeapon) {
        if (newWeapon != null && canUseWeapon(newWeapon)) {
            this.weapon = newWeapon;
            return true;
        }
        return false;
    }

    @Override
    public boolean putInto(Item item, int position) {
        if (position < 1 || position > Inventory.ITEMS_COUNT) {
            return false;
        }
        if (item != null && canUseItem(item)) {
            items[position - 1] = item;
            return true;
        }
        return false;
    }

    @Override
    public boolean useItem(int position) {
        if (position < 1 || position > Inventory.ITEMS_COUNT) {
            return false;
        }
        Item item = items[position - 1];
        if (item == null || item.isUsed()) {
            return false;
        }
        int value = item.use();
        if (item instanceof HealthPotion) {
            recoverHealth(value);
            return true;
        }
        return false;
    }

    @Override
    public boolean fight(Player enemy, int distance) {
        return false;
    }

    protected abstract boolean canUseWeapon(Weapon weapon);
    protected abstract boolean canUseItem(Item item);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(": ").append(username);
        sb.append(", health: ").append(health);
        sb.append(", weapon: ");
        sb.append(weapon != null ? weapon.toString() : "no");
        sb.append(", inventory: ");

        boolean hasItems = false;
        for (Item item : items) {
            if (item != null) {
                if (hasItems) sb.append("; ");
                sb.append(item.toString());
                hasItems = true;
            }
        }
        if (!hasItems) {
            sb.append("no");
        }

        return sb.toString();
    }
}
