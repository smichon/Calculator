package mod_1_2_interface;

public interface ATM {
    void cashIn(int ammountIn);

    void cashOut(int ammountOut);

    default void bankConnection()	{
        System.out.println("ATM is connected");
    }

    static String workFinish() {
        return "Thank You for using our ATM";
    }
}
