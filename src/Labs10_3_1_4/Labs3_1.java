package Labs10_3_1_4;

public class Labs3_1 {
    public static void main(String[] args) {
        try {
            Vehicle[] mock = new Vehicle[3];
            mock[0] = new Car("Jaguar");
            mock[1] = new Bike("Stork");
            mock[2] = new Boat("Balloon");

            for (Vehicle v : mock) {
                System.out.println(v.toString());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

