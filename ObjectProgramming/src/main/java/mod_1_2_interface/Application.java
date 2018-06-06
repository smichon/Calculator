package mod_1_2_interface;

/*Stwórz interfejs obsługujący bankomat (eng. ATM) zawierający:

Dwie metody wymagające implementacji - wpłata i wypłata
Metodę domyślną - informacja o połączeniu z bankiem
Metodę statyczną - informacja o zakończeniu działania bankomatu
Następnie zaimplementuj taki interface do klasy o nazwie ATMImpl (ATM Implementation) i stwórz ciała dla metod,
które tego wymagają. W klasie Application w metodzie main wywołaj każdą metodę.*/

public class Application {
    public static void main (String[] args) throws java.lang.Exception {

        ATMImpl operation = new ATMImpl();

        operation.bankConnection();

        operation.cashIn(200);

        operation.cashOut(150);

        System.out.println(ATM.workFinish());
    }
}
