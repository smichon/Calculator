package mod_1_3_use_of_interfaces;

public class Knight {
    private Quest quest;
    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void mission() {
        System.out.println("It's time for a journey...");
        quest.process();
    }
}
