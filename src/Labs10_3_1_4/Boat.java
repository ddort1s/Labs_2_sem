package Labs10_3_1_4;

public class Boat extends BaseVehicle {
    public Boat(String model) { super(model); }

    @Override
    public Integer getTires() { return 0; }

    @Override
    public String toString() {
        return getTires() + " tires on boat \"" + getModel() + "\"";
    }
}

