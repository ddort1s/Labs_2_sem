package Labs9_2_1;

public class Human {
    protected String firstName;
    protected String lastName;

    protected Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }



    protected void setFirstName(String firstName) {

        if (firstName == null) {
            throw new NullPointerException("First name cannot be null or empty!");
        }

        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: firstName");
        }

        if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
        }
        this.firstName = firstName;
    }

    protected void setLastName(String lastName){

        if (lastName == null) {
            throw new NullPointerException("First name cannot be null or empty!");
        }
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: lastName");
        }


        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols! Argument: lastName");
        }
        this.lastName = lastName;
    }
}

