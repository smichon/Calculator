package mod_1_1_object_or_structural;

/*przepisz kod strukturalny na obiektowy wraz z metodami, który nada naszemu programowi podejścia obiektowego*/

public class Structural {
    public static void main (String[] args) throws java.lang.Exception
    {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if(name != null) {
            if(age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
