public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMP_NUM = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMP_NUM)
            employeeNumber = MAX_EMP_NUM;

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double getRegularPay(int hoursWorked) {
        int regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(int hoursWorked) {
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        return 0.0;
    }
}
