package mod_1_2_interface;

public class ATMImpl implements ATM {
    public void cashIn(int ammountIn) {
        System.out.println("You are going to cash in " + ammountIn + " PLN");
    }

    public void cashOut(int ammountOut) {
        System.out.println("You are going to withdraw " + ammountOut + " PLN");
    }
}
