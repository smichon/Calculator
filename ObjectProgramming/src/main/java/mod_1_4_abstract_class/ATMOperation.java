package mod_1_4_abstract_class;

public class ATMOperation extends ATMOperationPatt {
    protected void cardInsert() {
        System.out.println("Welcome, please insert Your card\n---------------");
    }

    protected void enterPIN() {
        System.out.println("Please enter Your PIN number\n---------------");
    }

    protected void moneyToCashOut() {
        System.out.println("Enter amount to withdraw\n---------------");
    }

    protected void bankAcceptance() {
        System.out.println("Bank has received Your order\n---------------");
    }

    protected void balanceCheck() {
        System.out.println("Please wait, Bank is checking Your balance\n---------------");
    }

    protected void cashOutCommision() {
        System.out.println("Your order is accepted\n---------------");
    }

    protected void cashOut() {
        System.out.println("Your payment is being processed\nTake Your card, then money will be given out\n---------------");
    }

    protected void finishOperation() {
        System.out.println("Transaction completed. Thank You for using our ATM");
    }

    @Override
    public void run() {

        this.cardInsert();
        this.enterPIN();
        this.moneyToCashOut();
        this.bankAcceptance();
        this.balanceCheck();
        this.cashOutCommision();
        this.cashOut();
        this.finishOperation();
    }
}
