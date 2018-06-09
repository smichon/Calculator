package use_of_while_and_for_loop;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Random;

public class ASnake {

    private  int objQuantity;
    private String letter;
    private int repetition;
    private List<String> evenList = new ArrayList<>();
    private List<String> oddList = new ArrayList<>();
    Random generator = new Random();

    public ASnake(String letter, int objQuantity, int repetition) {
        this.letter = letter;
        this.objQuantity = objQuantity;
        this.repetition = repetition;
    }

    public String getLetter() {
        return letter;
    }
    public int getObjQuantity() {
        return objQuantity;
    }
    public int getRepetition() {
        return repetition;
    }
    public List<String> getOddList() {
        return this.oddList;
    }
    public List<String> getEvenList() {
        return this.evenList;
    }


    public void fillArray(Deque<String> queue) {

        for(int i=0; i < objQuantity; i++) {
            StringBuilder sB = new StringBuilder();
            for(int k=0; k < generator.nextInt(repetition)+1; k++) {
                sB.append(letter);
            }
            queue.offer(sB.toString());
        }

        System.out.println("Declared " + objQuantity + " in collection, and there is " + queue.size());
    }

    public void splitQueues(Deque<String> queue) {

        while(queue.size() > 0) {
            String obj = queue.poll();
            if(obj.length() % 2 == 0) {
                evenList.add(obj);
            } else {
                oddList.add(obj);
            }
        }
        System.out.println("There is " + oddList.size() + " objects in list containing odd number of characters");
        System.out.println("There is " + evenList.size() + " objects in list containing even number of characters");
    }
}
