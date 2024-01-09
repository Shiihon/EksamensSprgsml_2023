package Opgave_9_multipleConstructors;

public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password) { // method overload - vælger konstruktor der matcher de antal parametre.
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phoneNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        String str = "Your username is : " + getName() + ", and password : " + getPassword();

        if (email != null) {
            str += ", E-mail : " + getEmail(); // str = str + "E-mail";
        }

        if (phoneNumber != 0) {
            str += ", phonenumber : " + getPhoneNumber();
        }
        return str;
    }
}