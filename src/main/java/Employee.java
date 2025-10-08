public class Employee {
    private int eeId;
    private String eeName;
    private double hoursWorked;
    private double payRate;
    private double grossPay;

    public Employee(int id, String name, double hoursWorked, double payRate) {
        this.eeId = id;
        this.eeName = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getId() {
        return eeId;
    }
    public String getName() {
        return eeName;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay() {
        return hoursWorked * payRate;
    }


}
