public class ForumUser extends User {
    private String userName;
    private int postsNumber;
    private boolean loggedIn;

    public ForumUser(String userName, int postsNumber, boolean loggedIn, String firstName, String lastName, String sex, int age, String email) {
        super(firstName, lastName, sex, age, email);
        this.userName = userName;
        this.postsNumber = postsNumber;
        this.loggedIn = loggedIn;
    }

    public String getUserName() {
        return userName;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public boolean getLoggedIn() {
        if (loggedIn == true) {
            System.out.println("User " + userName + " is logged in.");
        }
        else {
            System.out.println("User " + userName + " is logged out.");
        }
        return loggedIn;
    }

    public void postPost() {
    }

    public void commentPost() {
    }

    public void introduceUser() {
        System.out.println("Nickname: " + getUserName());
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Email: " + getEMail());
        System.out.println("Sex: " + getSex());
        System.out.println("Age: " + getAge());
        getLoggedIn();
    }
}
