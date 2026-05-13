package Labs9_2_1;

public class Pupils extends Human {
    private Integer classNumber;
    private Boolean gender;

    public Pupils(String firstName, String lastName, Integer classNumber, Boolean gender) {
        super(firstName, lastName);
        setClassNumber(classNumber);
        setGender(gender);
    }

    private void setClassNumber(Integer classNumber) {

        if (classNumber == null) {
            throw new NullPointerException("Class number cannot be null!");
        }

        if (classNumber < 1 || classNumber > 11) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: class number");
        }
        this.classNumber = classNumber;
    }

    private void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String toString() {
        String lockerRoom = gender ? "boy locker room" : "girl locker room";

        return String.format("First Name: %s\nLast Name: %s\nClass: %d\nLocker: %s",
                firstName, lastName, classNumber, lockerRoom);
    }
}
