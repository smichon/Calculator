package mod_1_1_object_or_structural;

public class Application {
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Please wait, checking...");
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidator checker = new UserValidator();

        //boolean nameChecker = checker.validateName(name);

        if (checker.validateName(name)) {
            if (checker.validateHeight(height) && checker.validateAge(age)) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
