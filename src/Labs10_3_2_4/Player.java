package Labs10_3_2_4;

public interface Player {
    String getUsername();
    int damage(int enemyDamage);
    boolean fight(Player enemy, int distance);
}


