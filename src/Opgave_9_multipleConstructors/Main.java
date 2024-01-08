package Opgave_9_multipleConstructors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Banana", "1234");
        User user2 = new User("Shiihon", "dinMor", "blabla@gmail.com");
        User user3 = new User("Nanna", "Ghassan", "Nanna@gmail.com", 82839922);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
