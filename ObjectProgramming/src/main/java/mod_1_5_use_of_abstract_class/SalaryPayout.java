package mod_1_5_use_of_abstract_class;

public abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }
    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed\n--------------");
    }
}
