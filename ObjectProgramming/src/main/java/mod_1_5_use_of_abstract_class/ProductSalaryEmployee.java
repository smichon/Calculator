package mod_1_5_use_of_abstract_class;

public class ProductSalaryEmployee implements Employee {
    private double productPay = 5;
    private int product;

    public ProductSalaryEmployee(int product) {
        this.product = product;
    }

    public double calculateSalary() {
        return this.product * this.productPay;
    }
}
