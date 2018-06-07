package wrappers;

/*Napisz program, przypisujący do zmiennych o typach prymitywnych, jakieś wartości.
Następnie takie same wartości przypisz do typów będących wrapperami typów prymitywnych.
Niech program porówna czy wartości w typach prymitywnych oraz odpowiadających im wrapperach są sobie równe.
Do realizacji zadania wybierz trzy dowolne typy prymitywne*/

public class Application {

    public static void main (String[] args) {

        boolean prBool = true;
        double prDouble = 3.14;
        char prChar = 'J';
        Boolean objBool = true;
        Double objDouble = 3.14;
        Character objChar = 'J';

        System.out.println("We are going to compare variables declared as primitive types with created with a wrapper classes\n--------");

        if(prBool == objBool) {
            System.out.println("Variables prBool & objBool are equal\n--------");
        } else {
            System.out.println("Variables prBool & objBool are NOT equal\n--------");
        }

        if(prDouble == objDouble) {
            System.out.println("Variables prDouble & objDouble are equal\n--------");
        } else {
            System.out.println("Variables prDouble & objDouble are NOT equal\n--------");
        }

        if(prChar == objChar) {
            System.out.println("Variables prChar & objChar are equal\n--------");
        } else {
            System.out.println("Variables prChar & objChar are NOT equal\n--------");
        }

    }
}
