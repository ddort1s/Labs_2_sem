package Labs9_2_1;

public class Worker extends Human {
    private Double weekSalary;
    private Integer workDaysPerWeek;
    private Integer workHoursPerDay;

    public Worker(String firstName, String lastName, Double weekSalary, Integer workDaysPerWeek, Integer workHoursPerDay) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkDaysPerWeek(workDaysPerWeek);
        setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(Double weekSalary) {

        if (weekSalary == null) {
            throw new NullPointerException("Week salary cannot be null!");
        }
        if (weekSalary <= 10) {
            throw new IllegalArgumentException("Need more than 10 coins");
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkDaysPerWeek(Integer workDaysPerWeek) {

        if (workDaysPerWeek == null) {
            throw new NullPointerException("Work days per week cannot be null!");
        }
        if (workDaysPerWeek < 1 || workDaysPerWeek > 7) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workdays per week");
        }
        this.workDaysPerWeek = workDaysPerWeek;
    }

    private void setWorkHoursPerDay(Integer workHoursPerDay) {
        if (workHoursPerDay == null) {
            throw new NullPointerException("Work hours per day cannot be null!");
        }
        if (workHoursPerDay < 1 || workHoursPerDay > 24) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workhours per day");
        }


        this.workHoursPerDay = workHoursPerDay;
    }

    private Double calculatePerHourSalary() {
        return this.weekSalary / (this.workDaysPerWeek * this.workHoursPerDay);
    }

    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\nWeek Salary: %.2f\nHours per day: %d\nSalary per hour: %.2f",
                firstName, lastName, weekSalary, workHoursPerDay, calculatePerHourSalary());
    }
}
