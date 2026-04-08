package Labs2_1;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty() ||
                !Character.isUpperCase(firstName.charAt(0)) ||
                firstName.length() < 2) {
            throw new IllegalArgumentException();
        }
        if (lastName == null || lastName.isEmpty() ||
                !Character.isUpperCase(lastName.charAt(0)) ||
                lastName.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty() ||
                !Character.isUpperCase(firstName.charAt(0)) ||
                firstName.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() ||
                !Character.isUpperCase(lastName.charAt(0)) ||
                lastName.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }
}
