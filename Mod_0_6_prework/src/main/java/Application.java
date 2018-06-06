public class Application {
    public static void main (String[] args)
    {
        ForumUser forumUser = new ForumUser("Forumowicz", 234, true, "Jan", "Kowalski", "male", 32, "jan@kowalski.com");

        forumUser.introduceUser();
    }
}
