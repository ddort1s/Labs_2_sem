package Labs10_3_1_4;

public class Car extends BaseVehicle{
    public Car(String model) {
        super(model);
    }

    @Override
    public Integer getTires(){
        return 4;
    }

    @Override
    public String toString(){
        return getTires()+" tires on car \"" + getModel() + "\"";
    }
}
