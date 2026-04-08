package Labs2_1;

public class Worker extends Human {
    private double weekSalary;
    private int workDaysPerWeek;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workDaysPerWeek, int workHoursPerDay) {
        super(firstName, lastName);
        if (weekSalary <= 10) {
            throw new IllegalArgumentException();
        }
        if (workDaysPerWeek < 1 || workDaysPerWeek > 7) {
            throw new IllegalArgumentException();
        }
        if (workHoursPerDay < 1 || workHoursPerDay > 24) {
            throw new IllegalArgumentException();
        }
        this.weekSalary = weekSalary;
        this.workDaysPerWeek = workDaysPerWeek;
        this.workHoursPerDay = workHoursPerDay;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10) {
            throw new IllegalArgumentException();
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkDaysPerWeek(int workDaysPerWeek) {
        if (workDaysPerWeek < 1 || workDaysPerWeek > 7) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workdays per week");
        }
        this.workDaysPerWeek = workDaysPerWeek;
    }

    private void setWorkHoursPerDay(int workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 24) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workhours per day");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    private double calculatePerHourSalary() {
        int totalHoursPerWeek = workDaysPerWeek * workHoursPerDay;
        return weekSalary / totalHoursPerWeek;
    }

    public String toString() {
        return String.format("First Name: [%s]\nLast Name: [%s]\nSalary per hour: [%.2f]",
                getFirstName(), getLastName(), calculatePerHourSalary());
    }
}