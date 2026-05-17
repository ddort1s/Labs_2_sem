package Labs10_3_2_4;

public class GameTest {

    public static void main(String[] args) {
        System.out.println("=== KOMPLEKSNYI TEST SISTEMY ===\n");

        // 1. TIEST BRONI
        System.out.println("1. TEST SISTEMY BRONI");
        System.out.println("=====================");
        Helmet helmet = new Helmet(25);
        Dress dress = new Dress(35);
        Boots boots = new Boots(10);

        System.out.println("Helmet: " + helmet);
        System.out.println("Dress: " + dress);
        System.out.println("Boots: " + boots);

        int damage1 = 15;
        int remaining1 = helmet.protect(damage1);
        System.out.println("Helmet takes " + damage1 + " damage, remaining: " + remaining1);
        System.out.println("Helmet after: " + helmet + "\n");

        // 2. TEST ORUZHIYA
        System.out.println("2. TEST SISTEMY ORUZHIYA");
        System.out.println("========================");
        Bow bow1 = new Bow(2.5);
        Bow bow2 = new Bow(4.0);

        System.out.println("Bow1: " + bow1);
        System.out.println("Bow2: " + bow2 + "\n");

        // 3. TEST PREDMETOV
        System.out.println("3. TEST SISTEMY PREDMETOV");
        System.out.println("=========================");
        Arrows arrows1 = new Arrows(8);
        Arrows arrows2 = new Arrows(5);
        HealthPotion potion1 = new HealthPotion(4);
        HealthPotion potion2 = new HealthPotion(6);

        System.out.println("Arrows1: " + arrows1);
        System.out.println("Arrows2: " + arrows2);
        System.out.println("HealthPotion1: " + potion1);
        System.out.println("HealthPotion2: " + potion2);

        int used = arrows1.use();
        System.out.println("Arrows1 used: " + used + " arrows");
        System.out.println("Arrows1 after use: " + arrows1 + "\n");

        // 4. TEST PERSONAZHA - LUCHNIKA
        System.out.println("4. TEST PERSONAZHA - LUCHNIKA");
        System.out.println("===============================");
        Archer archer = new Archer("WildArrow", 85, 25, 2);
        System.out.println("Created: " + archer);
        System.out.println("Arrows count: " + archer.getArrowsCount() + "\n");

        // 4.1 Equipovka oruzhiem
        System.out.println("4.1 EQUIPOVKA ORUZHIEM");
        System.out.println("----------------------");
        boolean equipped = archer.change(bow1);
        System.out.println("Equipped bow: " + equipped);
        System.out.println("Archer now: " + archer + "\n");

        // 4.2 Nadenie broni
        System.out.println("4.2 NADENIE BRONI");
        System.out.println("-----------------");
        archer.dress(new Helmet(20));
        archer.dress(new Dress(30));
        archer.dress(new Boots(15));
        System.out.println("Dressed armor\n");

        // 4.3 Dobavlenie strel v kolchan
        System.out.println("4.3 DOBAVLENIE STREL V KOLCHAN");
        System.out.println("-------------------------------");
        Arrows arrowsBonus = new Arrows(10);
        System.out.println("Before: arrows count = " + archer.getArrowsCount());
        archer.putInto(arrowsBonus, 1);
        System.out.println("After: arrows count = " + archer.getArrowsCount() + "\n");

        // 4.4 Dobavlenie zeliya zdorovya
        System.out.println("4.4 DOBAVLENIE ZELIYA ZDOROVYA");
        System.out.println("-------------------------------");
        HealthPotion potionBonus = new HealthPotion(7);
        archer.putInto(potionBonus, 2);
        System.out.println("Potion added to inventory");
        System.out.println("Archer: " + archer + "\n");

        // 4.5 Poluchenie urona
        System.out.println("4.5 POLUCHENIE URONA");
        System.out.println("--------------------");
        System.out.println("Archer health before: " + archer.health);
        int takeDamage = 40;
        System.out.println("Takes " + takeDamage + " damage");
        int actualDamage = archer.damage(takeDamage);
        System.out.println("Actual damage taken: " + actualDamage);
        System.out.println("Archer health after: " + archer.health);
        System.out.println("Is died: " + archer.isDied() + "\n");

        // 4.6 Lechenie
        System.out.println("4.6 LECHENIE");
        System.out.println("------------");
        System.out.println("Health before: " + archer.health);
        archer.useItem(2);
        System.out.println("Used health potion");
        System.out.println("Health after: " + archer.health + "\n");

        // 4.7 Ataka luchnika
        System.out.println("4.7 ATAKA LUCHNIKA");
        System.out.println("------------------");
        Archer enemy = new Archer("Goblin", 30, 5, 1);
        System.out.println("Enemy created: " + enemy);
        System.out.println("Archer arrows: " + archer.getArrowsCount());

        boolean attacked = archer.fight(enemy, 3);
        System.out.println("Attack at distance 3: " + attacked);
        System.out.println("Enemy health: " + enemy.health);
        System.out.println("Archer arrows after: " + archer.getArrowsCount() + "\n");

        // FINAL STATE
        System.out.println("FINAL STATE");
        System.out.println("===========");
        System.out.println("Archer: " + archer);
        System.out.println("Enemy: " + enemy);
    }
}
