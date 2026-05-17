package Labs10_3_2_4;

public abstract class BaseItem implements Item{
    protected int count;

    public BaseItem(int count) {
        if (count < Item.MIN_VALUE || count > Item.MAX_VALUE) {
            throw new IllegalArgumentException(
                    String.format("Count must be between %d and %d", Item.MIN_VALUE, Item.MAX_VALUE)
            );
        }
        this.count = count;
    }

    public int use() {
        if (isUsed()) {
            return 0;
        }
        int result = count;
        count = 0;
        return result;
    }

    public boolean isUsed() {
        return count == 0;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, count: %d, isUsed: %b",
                this.getClass().getSimpleName(),
                count,
                isUsed()
        );
    }
}
