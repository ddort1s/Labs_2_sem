package Labs9_2_1;

public class Students extends Human{
    private String recordBookNumber;
    private String faculty;

    public Students(String firstName, String lastName, String faculty, String recordBookNumber) {
        super(firstName, lastName);
        setFaculty(faculty);
        setRecordBookNumber(recordBookNumber);
    }

    private void setFaculty(String faculty) {
        if (faculty == null || !faculty.matches("[A-Za-z]{3}")) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: faculty");
        }
        this.faculty = faculty;
    }

    private void setRecordBookNumber(String recordBookNumber) {
        String regex = "\\d{4}-\\d{1,2}-[a-zA-Z0-9]{5}";
        if (recordBookNumber == null || !recordBookNumber.matches(regex)) {
            throw new IllegalArgumentException("Invalid record book number!");
        }
        this.recordBookNumber = recordBookNumber;
    }

    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\nFaculty number: %s",
                firstName, lastName, faculty);
    }
}
