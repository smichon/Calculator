package mod_1_3_use_of_interfaces;

public class Application {
    public static void main (String[] args) {

        Knight knightDI = new Knight(new DeadIslandQuest());
        Knight knightEK = new Knight(new EliteKnightQuest());

        knightDI.mission();
        knightEK.mission();
    }
}
