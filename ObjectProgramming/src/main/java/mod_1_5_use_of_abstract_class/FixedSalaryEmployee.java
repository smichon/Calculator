package mod_1_5_use_of_abstract_class;

public class FixedSalaryEmployee implements Employee {

    private double perCent = 0.2;
    private double salary;
    private boolean additionalSell;

    public FixedSalaryEmployee(double salary, boolean additionalSell) {
        this.salary = salary;
        this.additionalSell = additionalSell;
    }

    public double calculateSalary() {
        if (additionalSell) {
            return this.salary * (1 + this.perCent);
        } else {
            return this.salary;
        }
    }
}
