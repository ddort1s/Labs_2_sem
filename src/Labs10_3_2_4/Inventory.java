package Labs10_3_2_4;

public interface Inventory {
    int ITEMS_COUNT = 5;
    boolean putInto(Item item, int position);
    boolean useItem(int position);
}
