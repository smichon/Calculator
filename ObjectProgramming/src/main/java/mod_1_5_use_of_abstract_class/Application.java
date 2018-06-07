package mod_1_5_use_of_abstract_class;

/*utwórz nowe obiekty pracowników:
Pracownika zarabiającego 5 zł za stworzenie jednego produktu,
Pracownika, który zarabia pensję podstawową 2000zł i 20% tej pensji jeżeli zrealizuje dodatkową sprzedaż dowolnego produktu*/

public class Application {

    public static void main(String[] args) {
        FixedSalaryEmployee employeeF = new FixedSalaryEmployee(2000, true);
        ProductSalaryEmployee employeeP = new ProductSalaryEmployee(500);

        SalaryPayoutProcessor processorF = new SalaryPayoutProcessor(employeeF);
        processorF.processPayout();

        SalaryPayoutProcessor processorP = new SalaryPayoutProcessor(employeeP);
        processorP.processPayout();
    }
}
