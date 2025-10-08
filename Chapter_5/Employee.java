

public class Employee {
   
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;

    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(double payRate, double hoursWorked) {
        this.employeeNumber = 0;

        this.payRate = payRate;

        this.hoursWorked = hoursWorked;
    }

    public double getRegularPay() {
        if (hoursWorked > 40)
            return 40 * payRate;
        else
            return hoursWorked * payRate;
    }

    public double getOvertimePay() {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * (payRate * OVERTIME_MULTIPLIER);
        else
            return 0;
    }
}