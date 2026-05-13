package Labs10_3_1_4;

public class Bike extends BaseVehicle{
    public Bike(String model) { super(model); }

    @Override
    public Integer getTires() { return 2; }

    @Override
    public String toString() {
        return getTires() + " tires on bike \"" + getModel() + "\"";
    }
}
