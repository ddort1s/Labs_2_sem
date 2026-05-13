package Labs10_3_1_4;

public abstract class BaseVehicle implements Vehicle{
    protected String model;
    public BaseVehicle(String model){
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть пустой");
        }
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public abstract Integer getTires();
}

