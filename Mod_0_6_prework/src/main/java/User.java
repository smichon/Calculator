public class User {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String email;

    public User(String firstName, String lastName, String sex, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public void logIn() {
    }

    public void removeAccount() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public String getEMail() {
        return this.email;
    }
}
